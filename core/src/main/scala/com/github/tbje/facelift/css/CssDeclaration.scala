package com.github.tbje.facelift.css

abstract class CssDeclaration {
  def property: String
  def value: String
  override def toString = s"$property: $value"
}

object CssDeclaration {
  implicit def tuple2ToCSSAttr(t: (String, String)) = new CssDeclaration {
    val (property, value) = t
  }
  implicit def tuple2ToCSSAttr2(t: (Symbol, String)) = new CssDeclaration {
    val (camelCasedProperty, value) = t
    val property = camelCasedProperty.name.foldLeft("") { (a, b) => if (b == b.toUpper) s"$a-${b.toLower}" else s"$a$b" }
  }
  def unapply(x: Any) = x match {
    case css: CssDeclaration => Some((css.property, css.value))
    case _ => None
  }
}
