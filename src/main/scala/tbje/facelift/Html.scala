package tbje.facelift

import scala.xml._

package html {
  class XmlBase(label: String) extends Elem(null, label, scala.xml.Null, TopScope, false, Seq.empty: _*) {
    def combineAttrs(attrs: Seq[Attribute]) =
      attrs.foldLeft(Null: MetaData)((x, y) => x.append(y).asInstanceOf[Attribute])
    def apply(content: String, attrs: Attribute*): NodeSeq = apply(Text(content), attrs: _*)
    def apply(xml: NodeSeq, attrs: Attribute*): NodeSeq = copy(attributes = combineAttrs(attrs), child = xml)
  }

  object Html extends XmlBase("html")

  object Body extends XmlBase("body")

  object H1 extends XmlBase("h1")

  object Code extends XmlBase("code")

  object Span extends XmlBase("span")

  object P extends XmlBase("p")

  object Div extends XmlBase("div")

  object Br extends XmlBase("br")
}

package attr {

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
    "style",
    Text(attrs mkString "; "),
    scala.xml.Null)
}

