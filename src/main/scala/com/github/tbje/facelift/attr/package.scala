package com.github.tbje.facelift

import scala.xml._
import css.CssDeclaration

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

  case class Style(str: String) extends AttributeBase("style", str) {
    def &(attrs: CssDeclaration*) = new Style(s"$str; ${attrs mkString "; "}")
  }
  object Style {
    def apply(attrs: CssDeclaration*) = new Style(attrs mkString "; ")
  }

  // The onload event occurs when the user agent finishes loading a window or all frames within a FRAMESET. This attribute may be used with BODY and FRAMESET elements.
  case class OnLoad(onLoad: String) extends AttributeBase("onload", onLoad)

  // The onunload event occurs when the user agent removes a document from a window or frame. This attribute may be used with  BODY and FRAMESET elements.
  case class OnUnload(onUnload: String) extends AttributeBase("onunload", onUnload)

  // The onclick event occurs when the pointing device button is clicked over an element. This attribute may be used with most elements.
  case class OnClick(onClick: String) extends AttributeBase("onclick", onClick)

  // The ondblclick event occurs when the pointing device button is double clicked over an element. This attribute may be used with most elements.
  case class OnDblClick(onDblClick: String) extends AttributeBase("ondblclick", onDblClick)

  // The onmousedown event occurs when the pointing device button is pressed over an element. This attribute may be used with most elements.
  case class OnMouseDown(onMouseDown: String) extends AttributeBase("onmousedown", onMouseDown)

  // The onmouseup event occurs when the pointing device button is released over an element. This attribute may be used with most elements.
  case class OnMouseUp(onMouseUp: String) extends AttributeBase("onmouseup", onMouseUp)

  // The onmouseover event occurs when the pointing device is moved onto an element. This attribute may be used with most elements.
  case class OnMouseOver(onMouseOver: String) extends AttributeBase("onmouseover", onMouseOver)

  // The onmousemove event occurs when the pointing device is moved while it is over an element. This attribute may be used with most elements.
  case class OnMouseMove(onMouseMove: String) extends AttributeBase("onmousemove", onMouseMove)

  // The onmouseout event occurs when the pointing device is moved away from an element. This attribute may be used with most elements.
  case class OnMouseOut(onMouseOut: String) extends AttributeBase("onmouseout", onMouseOut)

  // The  onfocus event occurs when an element receives focus either by the pointing device or by tabbing navigation. This attribute may be used with the following elements: A, AREA, LABEL, INPUT,  SELECT, TEXTAREA, and BUTTON.
  case class OnFocus(onFocus: String) extends AttributeBase("onfocus", onFocus)

  // The onblur event occurs when an element loses focus either by the pointing device or by tabbing navigation. It may be used with the same elements as onfocus.
  case class OnBlur(onBlur: String) extends AttributeBase("onblur", onBlur)

  // The onkeypress event occurs when a key is pressed and released over an element. This attribute may be used with most elements.
  case class OnKeyPress(onKeyPress: String) extends AttributeBase("onkeypress", onKeyPress)

  // The onkeydown event occurs when a key is pressed down over an element. This attribute may be used with most elements.
  case class OnKeyDown(onKeyDown: String) extends AttributeBase("onkeydown", onKeyDown)

  // The onkeyup event occurs when a key is released over an element. This attribute may be used with most elements.
  case class OnKeyUp(onKeyUp: String) extends AttributeBase("onkeyup", onKeyUp)

  // The onsubmit event occurs when a form is submitted. It only applies to the FORM element.
  case class OnSubmit(onSubmit: String) extends AttributeBase("onsubmit", onSubmit)

  // The onreset event occurs when a form is reset. It only applies to the  FORM element.
  case class OnReset(onReset: String) extends AttributeBase("onreset", onReset)

  // The onselect event occurs when a user selects some text in a text field. This attribute may be used with the INPUT and  TEXTAREA elements.
  case class OnSelect(onSelect: String) extends AttributeBase("onselect", onSelect)

  // The onchange event occurs when a control loses the input focus and its value has been modified since gaining focus. This attribute applies to the following elements: INPUT, SELECT, and  TEXTAREA.
  case class OnChange(onChange: String) extends AttributeBase("onchange", onChange)

  case class Src(name: String) extends AttributeBase("src", name)

  case class Href(href: String) extends AttributeBase("href", href)

  case class Cols(cols: Int) extends AttributeBase("cols", cols.toString)

  case class Colspan(colspan: Int) extends AttributeBase("colspan", colspan.toString)

  case class Rows(rows: Int) extends AttributeBase("rows", rows.toString)

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
    val TextCss = Type("text/css")
  }

  case class Content(id: String) extends AttributeBase("content", id)

  case class Charset(id: String) extends AttributeBase("charset", id)

  object Charset {
    val UTF8 = Charset("utf-8")
  }

  case class DataToggle(id: String) extends AttributeBase("data-toggle", id)

  case class DataTarget(id: String) extends AttributeBase("data-target", id)

  case class ElemOps(val n: scala.xml.Elem) extends AnyVal {
    def addStyle(css: com.github.tbje.facelift.css.CssDeclaration*) =
      com.github.tbje.facelift.attr.addStyle(n, css: _*)
  }
}

package object attr {
  @deprecated("Use OnClick instead", "0.2")
  val Onclick = OnClick
  type Onclick = OnClick

  def replaceValue(map: Map[String, String], x: String, func: String => String): Map[String, String] = {
    map.get(x) match {
      case Some(v) => (map - x) + (x -> func(v))
      case None => map
    }
  }

  def mergeValue(map: Map[String, String], x: (String, String)): Map[String, String] = {
    map.get(x._1) match {
      case Some(v) => (map - x._1) + (x._1 -> (v + " " + x._2))
      case None => map + (x._1 -> x._2)
    }
  }

  def classMerge(node: Node, className: String) = appendAttr(node, "class" -> className)


  def decomposeMetaData(m: MetaData): Option[(String, String)] = m match {
    case Null => None
    case PrefixedAttribute(pre, key, values, next) =>
      Some(pre + ":" + key -> values.mkString(" "))
    case UnprefixedAttribute(key, values, next) =>
      Some(key -> values.mkString(" "))
  }

  def unchainMetaData(n: Node): Map[String, String] = (n match {
    case Elem(_, _, attr, _, _) => attr.toList.flatMap(decomposeMetaData(_))
    case _ => Nil
  }).toMap

  def unchainMetaData(m: MetaData): Map[String, String] = m.flatMap(decomposeMetaData(_)).toMap

  def chainMetaData(map: List[(String, String)]): MetaData = map.toList match {
    case Nil => Null
    case (key, value) :: Nil => Attribute(None, key, Text(value) :: Nil, Null)
    case (key, value) :: next => Attribute(None, key, Text(value) :: Nil, chainMetaData(next))
    case x => Null
  }

  def chainMetaData(map: Map[String, String]): MetaData = chainMetaData(map.toList)

  def appendAttr(n: Node, attr: (String, String)) = {
    n match {
      case Elem(pre, name, attrs, x, content @ _*) =>
        new Elem(pre, name, chainMetaData(mergeValue(unchainMetaData(attrs), attr)), x, content.isEmpty, content: _*)
      case x => x
    }
  }

  def attr(x: (String, String)) = new UnprefixedAttribute(x._1, x._2, scala.xml.Null)

  def addOptAttr(e: Elem, a: Option[(String, String)]) = a.map(a => e % attr(a)).getOrElse(e)

  def capEach(x: String) = ((x toLowerCase) split " " map (_ capitalize)).mkString(" ")

  def replaceAttrValue(n: Elem, attrName: String, replaceFunc: String => String) = {
    n match {
      case Elem(pre, name, attrs, x, content @ _*) =>
        new Elem(pre, name, chainMetaData(replaceValue(unchainMetaData(attrs), attrName, replaceFunc)), x, content.isEmpty, content: _*)
      case x => x
    }
  }

  def addStyle(n: Elem, css: CssDeclaration*) =
    replaceAttrValue(n, "style", x => s"$x; ${css.map(_.toString).mkString("; ")}")

  implicit def elemToElemOps(n: scala.xml.Elem) = ElemOps(n)

}
