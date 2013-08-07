package tbje.facelift

import scala.xml._

package attr {

  import css._

  class AttributeBase(name: String, value: String) extends UnprefixedAttribute(name, Text(value), scala.xml.Null)

  case class Id(id: String) extends AttributeBase("id", id)

  case class Class(names: String*) extends AttributeBase("class", names mkString " ")

  case class Name(name: String) extends AttributeBase("name", name)

  case class Style(attrs: CssDeclaration*) extends AttributeBase("style", attrs mkString "; ")

  case class Src(name: String) extends AttributeBase("src", name)

  case class Href(href: String) extends AttributeBase("href", href)

  case class Onclick(onclick: String) extends AttributeBase("onclick", onclick)
}

