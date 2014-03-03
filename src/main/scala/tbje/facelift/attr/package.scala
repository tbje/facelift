package tbje.facelift

import scala.xml._

package attr {

  import css._

  class AttributeBase(val attrName: String, val attrValue: String) extends UnprefixedAttribute(attrName, Text(attrValue), scala.xml.Null)

  object AttributeBase {
    implicit def tuple2ToAttrBase(t: (String, String)) = t match { case (name, value) => new AttributeBase(name, value) }
    implicit def tuple2ToAttrBase2(t: (Symbol, String)) = {
      val (camelCasedName, value) = t
      val name = camelCasedName.name.foldLeft("") { (a, b) => if (b == b.toUpper) s"$a-${b.toLower}" else s"$a$b" }
      new AttributeBase(name, value)
    }
    def unapply(x: Any) = x match {
      case attr: AttributeBase => Some((attr.attrName, attr.attrValue))
      case _ => None
    }
  }

  case class Id(id: String) extends AttributeBase("id", id)

  case class Class(val names: String*) extends AttributeBase("class", names mkString " ") {
    def &(other: Class) = Class((names ++ other.names): _*)
  }

  case class Value(name: String) extends AttributeBase("value", name)

  case class Name(name: String) extends AttributeBase("name", name)

  case class Style(str: String) extends AttributeBase("style", str)

  object Style {
    def apply(attrs: CssDeclaration*) = new Style(attrs mkString "; ")
  }

  case class Src(name: String) extends AttributeBase("src", name)

  case class Href(href: String) extends AttributeBase("href", href)

  case class Onclick(onclick: String) extends AttributeBase("onclick", onclick)

  case class Rel(val types: String*) extends AttributeBase("rel", types mkString " ") {
    def &(other: Rel) = Rel((types ++ other.types): _*)
  }

  object Rel {
    val Stylesheet = Rel("stylesheet")
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

