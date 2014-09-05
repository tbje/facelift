package com.github.tbje.facelift.util

object GenImports extends App {
  val path = "/Users/tbje/facelift/src/main/scala/tbje/facelift/css/"
  val f = new java.io.File(path)
  val cssFiles = f.listFiles.filter { f =>
    !f.getName.startsWith("#") &&
      !f.getName.startsWith(".#") &&
      !f.getName.startsWith("CssSelector") &&
      f.getName.endsWith(".scala")
  }

  val ClassReg = """.*class ([^(]*)\(.*""".r
  val ObjectReg = """.*object ([A-Z][^ ]*) .*""".r
  val donts = Seq("Option", "Map", "Font", "Id", "Content", "Mark", "Class", "CssElementWithChildren", "CssElementWithoutChildren", "CssMeasure", "ToUnitOps[T]")

  val results = cssFiles flatMap { file =>
    val src = scala.io.Source.fromFile(file).getLines.toList
    src.collect {
      case ClassReg(name) => name
      case ObjectReg(name) => name
    }
  }

  val str = results.distinct.diff(donts).sorted.map(n => s"val $n = css.$n").mkString("\n")

}
