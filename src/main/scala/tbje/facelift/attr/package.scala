package tbje.facelift

import scala.xml._

package attr {

  import css._

  class AttributeBase(name: String, value: String) extends UnprefixedAttribute(name, Text(value), scala.xml.Null)

  case class Id(id: String) extends AttributeBase("id", id)

  case class Class(names: String*) extends AttributeBase("class", names mkString " ")

  case class Value(name: String) extends AttributeBase("value", name)

  case class Name(name: String) extends AttributeBase("name", name)

  case class Style(str: String) extends AttributeBase("style", str)

  object Style {
    def apply(attrs: CssDeclaration*) = new Style(attrs mkString "; ")
  }

  case class Src(name: String) extends AttributeBase("src", name)

  case class Href(href: String) extends AttributeBase("href", href)

  case class Onclick(onclick: String) extends AttributeBase("onclick", onclick)

  case class Rel(id: String) extends AttributeBase("rel", id)

  object Rel {
    def apply(es: String*) = new Rel(es.mkString(" "))
    object Stylesheet extends Rel("stylesheet")
  }

  case class Role(id: String) extends AttributeBase("role", id)

  case class Type(id: String) extends AttributeBase("type", id)

  object Type {
    object ImagePng extends Type("image/png")
    object TextJavaScript extends Type("text/javascript")
  }

  case class Content(id: String) extends AttributeBase("content", id)

  case class Charset(id: String) extends AttributeBase("charset", id)

  case class DataToggle(id: String) extends AttributeBase("data-toggle", id)

  case class DataTarget(id: String) extends AttributeBase("data-target", id)

}

