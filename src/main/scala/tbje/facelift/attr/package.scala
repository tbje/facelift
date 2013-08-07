package tbje.facelift

import scala.xml._

package attr {

  import css._

  case class Id(id: String) extends UnprefixedAttribute("id", Text(id), scala.xml.Null)

  case class Class(names: String*) extends UnprefixedAttribute(
    "class",
    Text(names mkString " "),
    scala.xml.Null)

  case class Name(name: String) extends UnprefixedAttribute(
    "name",
    Text(name),
    scala.xml.Null)
  case class Style(attrs: CssDeclaration*) extends UnprefixedAttribute(
    "style",
    Text(attrs mkString "; "),
    scala.xml.Null)

  case class Src(name: String) extends UnprefixedAttribute(
    "src",
    Text(name),
    scala.xml.Null)

  case class Href(href: String) extends UnprefixedAttribute(
    "href",
    Text(href),
    scala.xml.Null)

}

