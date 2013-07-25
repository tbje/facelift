package tbje.facelift

import scala.xml.Attribute
import scala.xml.Text
import scala.xml.UnprefixedAttribute

package css {
  // Sets all the background properties in one declaration
  // From CSS version 1
  case class Background(background: String) extends CssDeclaration {
    override def toString = s"background: $background"
  }

  // Sets whether a background image is fixed or scrolls with the rest of the page
  // From CSS version 1
  case class BackgroundAttachment(backgroundAttachment: String) extends CssDeclaration {
    override def toString = s"background-attachment: $backgroundAttachment"
  }

  // Sets the background color of an element
  // From CSS version 1
  case class BackgroundColor(backgroundColor: String) extends CssDeclaration {
    override def toString = s"background-color: $backgroundColor"
  }

  // Sets the background image for an element
  // From CSS version 1
  case class BackgroundImage(backgroundImage: String) extends CssDeclaration {
    override def toString = s"background-image: $backgroundImage"
  }

  // Sets the starting position of a background image
  // From CSS version 1
  case class BackgroundPosition(backgroundPosition: String) extends CssDeclaration {
    override def toString = s"background-position: $backgroundPosition"
  }

  // Sets how a background image will be repeated
  // From CSS version 1
  case class BackgroundRepeat(backgroundRepeat: String) extends CssDeclaration {
    override def toString = s"background-repeat: $backgroundRepeat"
  }

  // Specifies the painting area of the background
  // From CSS version 3
  case class BackgroundClip(backgroundClip: String) extends CssDeclaration {
    override def toString = s"background-clip: $backgroundClip"
  }
  // Specifies the positioning area of the background images
  // From CSS version 3
  case class BackgroundOrigin(backgroundOrigin: String) extends CssDeclaration {
    override def toString = s"background-origin: $backgroundOrigin"
  }

  // Specifies the size of the background images
  // From CSS version 3
  case class BackgroundSize(backgroundSize: String) extends CssDeclaration {
    override def toString = s"background-size: $backgroundSize"
  }

  abstract class CssDeclaration {
    override def toString: String
  }
  case class FontSizeEm(size: Double) extends CssDeclaration {
    override def toString = s"font-size: ${size}em"
  }
  case class FontSizePx(size: Int) extends CssDeclaration {
    override def toString = s"font-size: ${size}px"
  }
  case class Margin(value: String) extends CssDeclaration {
    override val toString = s"margin: $value"
  }
  object MarginPx {
    def apply(top: Int, right: Int, bottom: Int, left: Int) = new Margin(s"${top}px ${right}px ${bottom}px ${left}px")
    def apply(top: Int, rightAndLeft: Int, bottom: Int) = new Margin(s"${top}px ${rightAndLeft}px ${bottom}px")
    def apply(topAndBottom: Int, rightAndLeft: Int) = new Margin(s"${topAndBottom}px ${rightAndLeft}px")
    def apply(all: Int) = new Margin(s"${all}px")
  }
  case class Padding(value: String) extends CssDeclaration {
    override val toString = s"padding: $value"
  }
  case class Width(value: String) extends CssDeclaration {
    override def toString = s"width: $value"
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
    override val toString = s"text-align: $value"
  }
  object TextAlign {
    object Left extends TextAlign("left") // Aligns the text to the left
    object Right extends TextAlign("right") // Aligns the text to the right
    object Center extends TextAlign("center") // Centers the text
    object Justify extends TextAlign("justify") // Stretches the lines so that each line has equal width (like in newspapers and magazines
    object Inherit extends TextAlign("inherit") // Specifies that the value of the text-align property should be inherited from the parent element
    val Default = Left
  }

  class CssElement(elements: CssSelector*)(styles: CssDeclaration*) {
    override val toString =
      s"""|${elements mkString " "} {
  		|  ${styles.mkString("", ";\n  ", ";")}
  		|}""".stripMargin
  }

  object CssDeclaration {
    implicit def tuple2ToCSSAttr(t: (String, String)) = new CssDeclaration {
      val (key, value) = t
      override val toString = s"$key: $value"
    }
    implicit def tuple2ToCSSAttr2(t: (Symbol, String)) = new CssDeclaration {
      val (key, value) = t
      val unCamelCased = key.name.foldLeft("") { (a, b) => if (b == b.toUpper) s"$a-${b.toLower}" else s"$a$b" }
      override val toString = s"$unCamelCased: $value"
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

