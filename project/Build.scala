import sbt._
import com.typesafe.sbt.SbtSite.site
import com.typesafe.sbt.SbtGhPages.ghpages
import com.typesafe.sbt.SbtGit.GitKeys._
import com.typesafe.sbt.SbtGit._
import Keys._

object BuildSettings {
  val name = "facelift"
  val buildSettings = Defaults.defaultSettings ++ Seq(
    organization := "tbje",
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.10.3",
    git.remoteRepo := "git@github.com:tbje/facelift.git",
    resolvers += Resolver.sonatypeRepo("snapshots"),
    resolvers += Resolver.sonatypeRepo("releases"),
    scalacOptions ++= Seq(
        "-unchecked",
        "-deprecation",
        "-Xlint",
        "-language:_",
        "-target:jvm-1.6",
        "-encoding", "UTF-8"
    ), // ++ site.settings ++ ,
    publishTo := {
      val publishDir = Option(System.getProperty("publish.dir")).getOrElse(System.getProperty("user.dir")) 
      val publishPath = "/[organization]/[module](_[scalaVersion])/[revision]/[artifact](_[scalaVersion])-[revision](-[classifier]).[ext]"
      Some(FileRepository(
        "Groosker Repo", 
        Resolver.defaultFileConfiguration, 
        Patterns(true, publishDir + publishPath)
      ))
    }
  )
}

object FaceliftBuild extends Build {
  import BuildSettings._  

  lazy val root: Project = Project(
    name,
    file("."),
    settings = buildSettings ++ Seq(
      run <<= run in Compile in core) ++ Seq(site.settings : _*) ++ Seq(ghpages.settings: _*)
  ) dependsOn(macros) settings (
    // include the macro classes and resources in the main jar
    mappings in (Compile, packageBin) ++= mappings.in(macros, Compile, packageBin).value,
    mappings in (Compile, packageBin) ++= mappings.in(core, Compile, packageBin).value
  )

  lazy val macros: Project = Project(
    name + "-macros",
    file("macros"),
    settings = buildSettings ++ Seq(
      libraryDependencies <+= (scalaVersion)("org.scala-lang" % "scala-reflect" % _))
  ) settings (
//    publish := {},
//    publishLocal := {}
  ) dependsOn(core) 

  lazy val core: Project = Project(
    name + "-core",
    file("core"),
    settings = buildSettings
  )
}
