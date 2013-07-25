package tbje.facelift

import scala.xml.Attribute
import scala.xml.Text
import scala.xml.UnprefixedAttribute

package css {
  abstract class CssDeclaration {
    def property: String
    def value: String
    override def toString = s"$property: $value"
  }
  case class FontSizeEm(size: Double) extends CssDeclaration {
    val property = "font-size"
    val value = s"${size}em"
  }
  case class FontSizePx(size: Int) extends CssDeclaration {
    val property = "font-size"
    val value = s"${size}px"
  }
  case class Margin(value: String) extends CssDeclaration {
    val property = "margin"
  }
  object MarginPx {
    def apply(top: Int, right: Int, bottom: Int, left: Int) = new Margin(s"${top}px ${right}px ${bottom}px ${left}px")
    def apply(top: Int, rightAndLeft: Int, bottom: Int) = new Margin(s"${top}px ${rightAndLeft}px ${bottom}px")
    def apply(topAndBottom: Int, rightAndLeft: Int) = new Margin(s"${topAndBottom}px ${rightAndLeft}px")
    def apply(all: Int) = new Margin(s"${all}px")
  }
  case class Padding(value: String) extends CssDeclaration {
    val property = "padding"
  }
  case class Width(value: String) extends CssDeclaration {
    val property = "width"
  }
  object WidthPx {
    def apply(px: Int) = Width(s"${px}px")
  }
  object PaddingPx {
    def apply(top: Int, right: Int, bottom: Int, left: Int) = new Padding(s"${top}px ${right}px ${bottom}px ${left}px")
    def apply(top: Int, rightAndLeft: Int, bottom: Int) = new Padding(s"${top}px ${rightAndLeft}px ${bottom}px")
    def apply(topAndBottom: Int, rightAndLeft: Int) = new Padding(s"${topAndBottom}px ${rightAndLeft}px")
    def apply(all: Int) = new Padding(s"${all}px")
  }
  case class TextAlign(value: String) extends CssDeclaration {
    val property = "text-align"
  }
  object TextAlign {
    object Left extends TextAlign("left") // Aligns the text to the left
    object Right extends TextAlign("right") // Aligns the text to the right
    object Center extends TextAlign("center") // Centers the text
    object Justify extends TextAlign("justify") // Stretches the lines so that each line has equal width (like in newspapers and magazines
    object Inherit extends TextAlign("inherit") // Specifies that the value of the text-align property should be inherited from the parent element
    val Default = Left
  }

  abstract class CssElement {
    def selectors: Seq[CssSelector]
    def declarations: Seq[CssDeclaration]
    def children = Seq[CssElement]()
    def addParents(parentSelectors: Seq[CssSelector], parentDeclarations: Seq[CssDeclaration]): CssElement
    override val toString: String =
      s"""|${selectors mkString " "} {
  		|  ${declarations.mkString("", ";\n  ", ";")}
  		|}
  		|
  		|${children.map(_.toString) mkString "\n\n"}
  		""".stripMargin

  }
  case class CssElementWithoutChildren(selectors: Seq[CssSelector], declarations: Seq[CssDeclaration]) extends CssElement {
    def apply(children: CssElement*) = new CssElementWithChildren(selectors, declarations, children map (_.addParents(selectors, declarations)))
    def addParents(parentSelectors: Seq[CssSelector], parentDeclarations: Seq[CssDeclaration]): CssElement =
      copy(selectors = parentSelectors ++ selectors, declarations = declarations ++ parentDeclarations)
  }
  case class CssElementWithChildren(selectors: Seq[CssSelector], declarations: Seq[CssDeclaration], override val children: Seq[CssElement], parentSelectors: Seq[CssSelector] = Seq(), parentDeclarations: Seq[CssDeclaration] = Seq()) extends CssElement {
    def addParents(parentSelectors: Seq[CssSelector], parentDeclarations: Seq[CssDeclaration]): CssElement =
      copy(selectors = parentSelectors ++ selectors, declarations = declarations ++ parentDeclarations, children = children map (_.addParents(parentSelectors, parentDeclarations)))
  }

  object CssElement {
    def apply(elements: CssSelector*)(styles: CssDeclaration*) = new CssElementWithoutChildren(elements, styles)
  }

  object CssDeclaration {
    implicit def tuple2ToCSSAttr(t: (String, String)) = new CssDeclaration {
      val (property, value) = t
    }
    implicit def tuple2ToCSSAttr2(t: (Symbol, String)) = new CssDeclaration {
      val (camelCasedProperty, value) = t
      val property = camelCasedProperty.name.foldLeft("") { (a, b) => if (b == b.toUpper) s"$a-${b.toLower}" else s"$a$b" }
    }
  }
  abstract class CssSelector {
    def toString: String
  }
  object CssSelector {
    case class Id(id: String) extends CssSelector {
      override val toString = s"#$id"
    }
    case class Class(name: String) extends CssSelector {
      override val toString = s".$name"
    }
    object H1 extends CssSelector {
      override val toString = "h1"
    }
    object H2 extends CssSelector {
      override val toString = "h2"
    }
    object H3 extends CssSelector {
      override val toString = "h3"
    }
    object A extends CssSelector {
      override val toString = "a"
    }
    object P extends CssSelector {
      override val toString = "p"
    }

  }

}

import css._
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
  case class Style(attrs: CssDeclaration*) extends UnprefixedAttribute(
    "display",
    Text(attrs mkString "; "),
    scala.xml.Null)
}

