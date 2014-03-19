package tbje.facelift

import scala.xml._

package attr {

  import css._

  class AttributeBase(val attrName: String, val attrValue: String) extends UnprefixedAttribute(attrName, Text(attrValue), scala.xml.Null) {
    def tupled = attrName -> attrValue
  }

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

  case class For(name: String) extends AttributeBase("for", name)

  case class Placeholder(name: String) extends AttributeBase("placeholder", name)

  case class Name(name: String) extends AttributeBase("name", name)

  object Name {
    val ApplicationName = Name("application-name")
    val Author = Name("author")
    val Description = Name("description")
    val Generator = Name("generator")
    val Keywords = Name("keywords")
    val Viewport = Name("viewport")
  }

  case class Style(str: String) extends AttributeBase("style", str)

  object Style {
    def apply(attrs: CssDeclaration*) = new Style(attrs mkString "; ")
  }

  case class Src(name: String) extends AttributeBase("src", name)

  case class Href(href: String) extends AttributeBase("href", href)

  case class Onclick(onclick: String) extends AttributeBase("onclick", onclick)

  case class OnSubmit(onSubmit: String) extends AttributeBase("onsubmit", onSubmit)

  case class Rel(val types: String*) extends AttributeBase("rel", types mkString " ") {
    def &(other: Rel) = Rel((types ++ other.types): _*)
  }

  object Rel {
    val Stylesheet = Rel("stylesheet")
    val Icon = Rel("icon")
    val Shortcut = Rel("shortcut")
  }

  case class Role(id: String) extends AttributeBase("role", id)

  case class Type(id: String) extends AttributeBase("type", id)

  object Type {
    val Button = Type("button")
    val Checkbox = Type("checkbox")
    val Color = Type("color")
    val Date = Type("date")
    val Datetime = Type("datetime")
    val DatetimeLocal = Type("datetime-local")
    val Email = Type("email")
    val File = Type("file")
    val Hidden = Type("hidden")
    val Image = Type("image")
    val ImagePng = Type("image/png")
    val Month = Type("month")
    val Number = Type("number")
    val Password = Type("password")
    val Radio = Type("radio")
    val Range = Type("range")
    val Reset = Type("reset")
    val Search = Type("search")
    val Submit = Type("submit")
    val Tel = Type("tel")
    val Text = Type("text")
    val TextJavaScript = Type("text/javascript")
  }

  case class Content(id: String) extends AttributeBase("content", id)

  case class Charset(id: String) extends AttributeBase("charset", id)

  object Charset {
    val UTF8 = Charset("utf-8")
  }

  case class DataToggle(id: String) extends AttributeBase("data-toggle", id)

  case class DataTarget(id: String) extends AttributeBase("data-target", id)

}

