organization := "tbje"

name := "Facelift"

scalaVersion := "2.10.2"

version := "0.1-SNAPSHOT"

publishTo := Some(FileRepository("Groosker Repo", Resolver.defaultFileConfiguration, Patterns(true, Option(System.getProperty("publish.dir")).getOrElse(System.getProperty("user.dir")) + "/[organization]/[module](_[scalaVersion])/[revision]/[artifact](_[scalaVersion])-[revision](-[classifier]).[ext]")))

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-Xlint",
  "-language:_",
  "-target:jvm-1.6",
  "-encoding", "UTF-8"
)
