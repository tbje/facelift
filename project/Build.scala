import sbt._
import Keys._
import sbt.Keys._
import scala.xml.{Elem, Node}
import scala.xml.transform.{RuleTransformer, RewriteRule}

object BuildSettings {
  lazy val prepAlias = addCommandAlias("prep", ";publishLocal;cleanCache")
  val name = "facelift"
  val buildSettings = Defaults.defaultSettings ++ Seq(
    organization := "tbje",
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.10.4",
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
    libraryDependencies := {
      CrossVersion.partialVersion(scalaVersion.value) match {
        case Some((2, scalaMajor)) if scalaMajor >= 11 => libraryDependencies.value ++ Seq(
          "org.scala-lang.modules" %% "scala-xml" % "1.0.2" cross CrossVersion.binary)
        case Some((2, 10)) =>
          libraryDependencies.value
      }
    },
    incOptions := incOptions.value.withNameHashing(true),
    publishTo := {
      val publishDir = Option(System.getProperty("publish.dir")).getOrElse(System.getProperty("user.dir")) 
      val publishPath = "/[organization]/[module](_[scalaVersion])/[revision]/[artifact](_[scalaVersion])-[revision](-[classifier]).[ext]"
      Some(FileRepository(
        "Groosker Repo", 
        Resolver.defaultFileConfiguration, 
        Patterns(true, publishDir + publishPath)
      ))
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
