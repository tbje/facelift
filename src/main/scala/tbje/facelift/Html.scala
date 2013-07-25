package tbje.facelift

import scala.xml.Attribute
import scala.xml.Text
import scala.xml.UnprefixedAttribute

object Html {
  case class Id(id: String) extends UnprefixedAttribute("id", Text(id), scala.xml.Null)
  case class Class(names: String*) extends UnprefixedAttribute(
    "class",
    Text(names mkString " "),
    scala.xml.Null)
  case class Name(name: String) extends UnprefixedAttribute(
    "name",
    Text(name),
    scala.xml.Null)
  import css._
  case class Style(attrs: CssDeclaration*) extends UnprefixedAttribute(
    "display",
    Text(attrs mkString "; "),
    scala.xml.Null)
}

