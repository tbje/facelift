import sbt._
import Keys._
import sbt.Keys._
import scala.xml.NodeSeq

object BuildSettings {
  lazy val prepAlias = addCommandAlias("prep", ";publishLocal;cleanCache")
  def devs(devList: (String, String)*) = {
    def devsNode(x: NodeSeq) = <developers>{x}</developers>
    def idNode(x: String) = <id>{x}</id>
    def nameNode(x: String) = <name>{x}</name>
    def devNode(id: String, name: String) = <developer>{idNode(id) ++ nameNode(name)}</developer>
    devsNode(devList.foldLeft(NodeSeq.Empty){ case (ex, (id, name)) =>
      ex ++ devNode(id, name)
    })
  }
  val name = "facelift"
  val buildSettings = Defaults.defaultSettings ++ Seq(
    organization := "com.github.tbje",
    version := "0.2-SNAPSHOT",
    scalaVersion := "2.10.4",
    homepage := Some(url("https://github.com/tbje/facelift")),
    scmInfo := Some(ScmInfo(url("https://github.com/tbje/facelift"), "https://github.com/tbje/facelift.git")),
    licenses := Seq("BSD-style" -> url("http://www.opensource.org/licenses/bsd-license.php")),
    crossScalaVersions := Seq("2.10.4", "2.11.0"),
    resolvers += Resolver.sonatypeRepo("snapshots"),
    resolvers += Resolver.sonatypeRepo("releases"),
    scalacOptions ++= Seq(
        "-unchecked",
        "-deprecation",
        "-Xlint",
        "-language:_",
        "-target:jvm-1.6",
        "-encoding", "UTF-8"
    ),
    pomExtra := devs("tbje" -> "Trond Bjerkestrand"),
    libraryDependencies := {
      CrossVersion.partialVersion(scalaVersion.value) match {
        case Some((2, scalaMajor)) if scalaMajor >= 11 => libraryDependencies.value ++ Seq(
          "org.scala-lang.modules" %% "scala-xml" % "1.0.2" cross CrossVersion.binary)
        case Some((2, 10)) =>
          libraryDependencies.value
      }
    },
    incOptions := incOptions.value.withNameHashing(true),
    publishMavenStyle := true,
    publishArtifact in Test := false,
    pomIncludeRepository := { _ => false },
    publishTo := {
      Option(System.getProperty("publish.dir")) map { publishDir => // Publish locally if publish.dir is set.
        val publishPath = "/[organization]/[module](_[scalaVersion])/[revision]/[artifact](_[scalaVersion])-[revision](-[classifier]).[ext]"
        Some(FileRepository(
          "Groosker Repo",
          Resolver.defaultFileConfiguration,
          Patterns(true, publishDir + publishPath)
        ))
      } getOrElse {
        val nexus = "https://oss.sonatype.org/"
        if (isSnapshot.value)
          Some("snapshots" at nexus + "content/repositories/snapshots")
        else
          Some("releases"  at nexus + "service/local/staging/deploy/maven2")
      }
    }
  ) ++ prepAlias
}

object FaceliftBuild extends Build {
  import BuildSettings._

  lazy val root: Project = Project(
    name,
    file("."),
    settings = buildSettings ++ Seq(
      run <<= run in Compile in core)
    ) dependsOn(macros) settings (
      allDependencies <<= allDependencies.map{ deps => deps.filter(_.name != "facelift-macros") },
      // include the macro classes and resources in the main jar
      mappings in (Compile, packageBin) ++= mappings.in(macros, Compile, packageBin).value,
      mappings in (Compile, packageBin) ++= mappings.in(core, Compile, packageBin).value//,
  )

  lazy val macros: Project = Project(
    name + "-macros",
    file("macros"),
    settings = buildSettings ++ Seq(
      libraryDependencies <+= (scalaVersion)("org.scala-lang" % "scala-reflect" % _))
  ) settings (
    publish := {},
    publishLocal := {}
  ) dependsOn(core)

  lazy val core: Project = Project(
    name + "-core",
    file("core"),
    settings = buildSettings
  ) settings (
    publish := {},
    publishLocal := {}
  )
}
