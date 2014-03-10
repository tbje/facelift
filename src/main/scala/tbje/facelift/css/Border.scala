package tbje.facelift.css

trait BorderWidthX[T] { t: (String => T) =>
  val Medium = t("medium")
  val Thin = t("thin")
  val Thick = t("thick")
  def apply(c: CssMeasure): T = t(c.value)
}

trait BorderStyleX[T] { t: (String => T) =>
  val None = t("none")
  val Hidden = t("hidden")
  val Dotted = t("dotted")
  val Dashed = t("dashed")
  val Solid = t("solid")
  val Double = t("double")
  val Groove = t("groove")
  val Ridge = t("ridge")
  val Inset = t("inset")
  val Outset = t("outset")
  val Initial = t("initial")
  val Inherit = t("inherit")
}

trait Radius[T] { t: (String => T) =>
  def apply(measure: CssMeasure): T = t(measure.value)
  val Initial = t("initial")
  val Inherit = t("inherit")
}

/**
 * Sets all the border properties in one declaration
 * Available from CSS version 1
 */
case class Border(border: String) extends CssDeclaration {
  val property = "border"
  val value = border
}

object Border {
  // TODO: border values
}

/**
 * Sets all the bottom border properties in one declaration
 * Available from CSS version 1
 */
case class BorderBottom(borderBottom: String) extends CssDeclaration {
  val property = "border-bottom"
  val value = borderBottom
}

object BorderBottom {
  // TODO: border-bottom values
}

/**
 * Sets the color of the four borders
 * Available from CSS version 1
 */
case class BorderColor(borderColor: String) extends CssDeclaration {
  val property = "border-color"
  val value = borderColor
}

/**
 * Sets the color of the top border
 * Available from CSS version 1
 */
case class BorderTopColor(borderTopColor: String) extends CssDeclaration {
  val property = "border-top-color"
  val value = borderTopColor
}

/**
 * Sets the color of the bottom border	1
 * Available from CSS version
 */
case class BorderBottomColor(borderBottomColor: String) extends CssDeclaration {
  val property = "border-bottom-color"
  val value = borderBottomColor
}

/**
 * Sets the color of the left border
 * Available from CSS version 1
 */
case class BorderLeftColor(borderLeftColor: String) extends CssDeclaration {
  val property = "border-left-color"
  val value = borderLeftColor
}

/**
 * Sets the color of the right border
 * Available from CSS version 1
 */
case class BorderRightColor(borderRightColor: String) extends CssDeclaration {
  val property = "border-right-color"
  val value = borderRightColor
}

/**
 * Sets the color of an outline
 * Available from CSS version 2
 */
case class OutlineColor(outlineColor: String) extends CssDeclaration {
  val property = "outline-color"
  val value = outlineColor
}

object BorderColor extends BaseColorObject("border-color")
object BorderTopColor extends BaseColorObject("border-top-color")
object BorderBottomColor extends BaseColorObject("border-bottom-color")
object BorderLeftColor extends BaseColorObject("border-left-color")
object BorderRightColor extends BaseColorObject("border-right-color")
object OutlineColor extends BaseColorObject("outline-color")

/**
 * Sets the style of the four borders
 * Available from CSS version 1
 */
case class BorderStyle(borderStyle: String) extends CssDeclaration {
  val property = "border-style"
  val value = borderStyle
}

/**
 * Sets the style of the top border
 * Available from CSS version 1
 */
case class BorderTopStyle(borderTopStyle: String) extends CssDeclaration {
  val property = "border-top-style"
  val value = borderTopStyle
}

/**
 * Sets the style of the bottom border
 * Available from CSS version 1
 */
case class BorderBottomStyle(borderBottomStyle: String) extends CssDeclaration {
  val property = "border-bottom-style"
  val value = borderBottomStyle
}

/**
 * Sets the style of the left border
 * Available from CSS version 1
 */
case class BorderLeftStyle(borderLeftStyle: String) extends CssDeclaration {
  val property = "border-left-style"
  val value = borderLeftStyle
}

/**
 * Sets the style of the right border
 * Available from CSS version 1
 */
case class BorderRightStyle(borderRightStyle: String) extends CssDeclaration {
  val property = "border-right-style"
  val value = borderRightStyle
}

/**
 * Sets the style of an outline
 * Available from CSS version 2
 */
case class OutlineStyle(outlineStyle: String) extends CssDeclaration {
  val property = "outline-style"
  val value = outlineStyle
}

object BorderStyle extends BorderStyleX[BorderStyle] with (String => BorderStyle)
object BorderTopStyle extends BorderStyleX[BorderTopStyle] with (String => BorderTopStyle)
object BorderBottomStyle extends BorderStyleX[BorderBottomStyle] with (String => BorderBottomStyle)
object BorderLeftStyle extends BorderStyleX[BorderLeftStyle] with (String => BorderLeftStyle)
object BorderRightStyle extends BorderStyleX[BorderRightStyle] with (String => BorderRightStyle)
object OutlineStyle extends BorderStyleX[OutlineStyle] with (String => OutlineStyle)

/**
 * Sets the width of the four borders
 * Available from CSS version 1
 */
case class BorderWidth(borderWidth: String) extends CssDeclaration {
  val property = "border-width"
  val value = borderWidth
}

/**
 * Sets the width of the top border
 * Available from CSS version 1
 */
case class BorderTopWidth(borderTopWidth: String) extends CssDeclaration {
  val property = "border-top-width"
  val value = borderTopWidth
}

/**
 * Sets the width of the bottom border
 * Available from CSS version 1
 */
case class BorderBottomWidth(borderBottomWidth: String) extends CssDeclaration {
  val property = "border-bottom-width"
  val value = borderBottomWidth
}

/**
 * Sets the width of the left border
 * Available from CSS version 1
 */
case class BorderLeftWidth(borderLeftWidth: String) extends CssDeclaration {
  val property = "border-left-width"
  val value = borderLeftWidth
}

/**
 * Sets the width of the right border
 * Available from CSS version 1
 */
case class BorderRightWidth(borderRightWidth: String) extends CssDeclaration {
  val property = "border-right-width"
  val value = borderRightWidth
}

/**
 * Sets the width of an outline
 * Available from CSS version 2
 */
case class OutlineWidth(outlineWidth: String) extends CssDeclaration {
  val property = "outline-width"
  val value = outlineWidth
}

object BorderWidth extends BorderWidthX[BorderWidth] with (String => BorderWidth)
object BorderTopWidth extends BorderWidthX[BorderTopWidth] with (String => BorderTopWidth)
object BorderBottomWidth extends BorderWidthX[BorderBottomWidth] with (String => BorderBottomWidth)
object BorderLeftWidth extends BorderWidthX[BorderLeftWidth] with (String => BorderLeftWidth)
object BorderRightWidth extends BorderWidthX[BorderRightWidth] with (String => BorderRightWidth)
object OutlineWidth extends BorderWidthX[OutlineWidth] with (String => OutlineWidth)

/**
 * Sets all the left border properties in one declaration
 * Available from CSS version 1
 */
case class BorderLeft(borderLeft: String) extends CssDeclaration {
  val property = "border-left"
  val value = borderLeft
}

object BorderLeft {
  // TODO: border-left values
}

/**
 * Sets all the right border properties in one declaration
 * Available from CSS version 1
 */
case class BorderRight(borderRight: String) extends CssDeclaration {
  val property = "border-right"
  val value = borderRight
}

object BorderRight {
  // TODO: border-right values
}

/**
 * Sets all the top border properties in one declaration
 * Available from CSS version 1
 */
case class BorderTop(borderTop: String) extends CssDeclaration {
  val property = "border-top"
  val value = borderTop
}

object BorderTop {
  // TODO: border-top values
}

/**
 * Sets all the outline properties in one declaration
 * Available from CSS version 2
 */
case class Outline(outline: String) extends CssDeclaration {
  val property = "outline"
  val value = outline
}

object Outline {} // TODO: outline values

/**
 * A shorthand property for setting all the four border-*-radius properties
 * Available from CSS version 3
 */
case class BorderRadius(borderRadius: String) extends CssDeclaration {
  val property = "border-radius"
  val value = borderRadius
}

/**
 * Defines the shape of the border of the top-left corner
 * Available from CSS version 3
 */
case class BorderTopLeftRadius(borderTopLeftRadius: String) extends CssDeclaration {
  val property = "border-top-left-radius"
  val value = borderTopLeftRadius
}

/**
 * Defines the shape of the border of the top-right corner
 * Available from CSS version 3
 */
case class BorderTopRightRadius(borderTopRightRadius: String) extends CssDeclaration {
  val property = "border-top-right-radius"
  val value = borderTopRightRadius
}

/**
 * Defines the shape of the border of the bottom-left corner
 * Available from CSS version 3
 */
case class BorderBottomLeftRadius(borderBottomLeftRadius: String) extends CssDeclaration {
  val property = "border-bottom-left-radius"
  val value = borderBottomLeftRadius
}

/**
 * Defines the shape of the border of the bottom-right corner
 * Available from CSS version 3
 */
case class BorderBottomRightRadius(borderBottomRightRadius: String) extends CssDeclaration {
  val property = "border-bottom-right-radius"
  val value = borderBottomRightRadius
}

object BorderRadius extends (String => BorderRadius) with Radius[BorderRadius]
object BorderTopLeftRadius extends Radius[BorderTopLeftRadius] with (String => BorderTopLeftRadius)
object BorderTopRightRadius extends Radius[BorderTopRightRadius] with (String => BorderTopRightRadius)
object BorderBottomLeftRadius extends Radius[BorderBottomLeftRadius] with (String => BorderBottomLeftRadius)
object BorderBottomRightRadius extends Radius[BorderBottomRightRadius] with (String => BorderBottomRightRadius)

/**
 * A shorthand property for setting all the border-image-* properties
 * Available from CSS version 3
 */
case class BorderImage(borderImage: String) extends CssDeclaration {
  val property = "border-image"
  val value = borderImage
}

object BorderImage // TODO: border-image values

/**
 * Specifies the amount by which the border image area extends beyond the border box
 * Available from CSS version 3
 */
case class BorderImageOutset(borderImageOutset: String) extends CssDeclaration {
  val property = "border-image-outset"
  val value = borderImageOutset
}

object BorderImageOutset // TODO: border-image-outset values

/**
 * Specifies whether the image-border should be repeated, rounded or stretched
 * Available from CSS version 3
 */
case class BorderImageRepeat(borderImageRepeat: String) extends CssDeclaration {
  val property = "border-image-repeat"
  val value = borderImageRepeat
}

object BorderImageRepeat // TODO: border-image-repeat values

/**
 * Specifies the inward offsets of the image-border
 * Available from CSS version 3
 */
case class BorderImageSlice(borderImageSlice: String) extends CssDeclaration {
  val property = "border-image-slice"
  val value = borderImageSlice
}

object BorderImageSlice // TODO: border-image-slice values

/**
 * Specifies an image to be used as a border
 * Available from CSS version 3
 */
case class BorderImageSource(borderImageSource: String) extends CssDeclaration {
  val property = "border-image-source"
  val value = borderImageSource
}

object BorderImageSource // TODO: border-image-source values

/**
 * Specifies the widths of the image-border
 * Available from CSS version 3
 */
case class BorderImageWidth(borderImageWidth: String) extends CssDeclaration {
  val property = "border-image-width"
  val value = borderImageWidth
}

object BorderImageWidth {
  def apply(measure: CssMeasure) = new BorderImageWidth(measure.value)
  def apply(times: Int) = new BorderImageWidth(times.toString)
  val Auto = new BorderImageWidth("auto")
  val Initial = new BorderImageWidth("initial")
  val Inherit = new BorderImageWidth("inherit")
}

/**
 * Available from CSS version 3
 */
case class BoxDecorationBreak(boxDecorationBreak: String) extends CssDeclaration {
  val property = "box-decoration-break"
  val value = boxDecorationBreak
}

object BoxDecorationBreak // TODO: box-decoration-break values

/**
 * Attaches one or more drop-shadows to the box
 * Available from CSS version 3
 */
case class BoxShadow(boxShadow: String) extends CssDeclaration {
  val property = "box-shadow"
  val value = boxShadow
}

object BoxShadow // TODO: box-shadow values
