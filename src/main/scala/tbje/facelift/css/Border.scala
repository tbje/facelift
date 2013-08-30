package tbje.facelift.css

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
 * Sets the color of the bottom border	1
 * Available from CSS version
 */
case class BorderBottomColor(borderBottomColor: String) extends CssDeclaration {
  val property = "border-bottom-color"
  val value = borderBottomColor
}

object BorderBottomColor {
  // TODO: border-bottom-color values
}

/**
 * Sets the style of the bottom border
 * Available from CSS version 1
 */
case class BorderBottomStyle(borderBottomStyle: String) extends CssDeclaration {
  val property = "border-bottom-style"
  val value = borderBottomStyle
}

object BorderBottomStyle {
  // TODO: border-bottom-style values
}

/**
 * Sets the width of the bottom border
 * Available from CSS version 1
 */
case class BorderBottomWidth(borderBottomWidth: String) extends CssDeclaration {
  val property = "border-bottom-width"
  val value = borderBottomWidth
}

object BorderBottomWidth {
  // TODO: border-bottom-width values
}

/**
 * Sets the color of the four borders
 * Available from CSS version 1
 */
case class BorderColor(borderColor: String) extends CssDeclaration {
  val property = "border-color"
  val value = borderColor
}

object BorderColor {
  // TODO: border-color values
}

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
 * Sets the color of the left border
 * Available from CSS version 1
 */
case class BorderLeftColor(borderLeftColor: String) extends CssDeclaration {
  val property = "border-left-color"
  val value = borderLeftColor
}

object BorderLeftColor {
  // TODO: border-left-color values
}

/**
 * Sets the style of the left border
 * Available from CSS version 1
 */
case class BorderLeftStyle(borderLeftStyle: String) extends CssDeclaration {
  val property = "border-left-style"
  val value = borderLeftStyle
}

object BorderLeftStyle {
  // TODO: border-left-style values
}

/**
 * Sets the width of the left border
 * Available from CSS version 1
 */
case class BorderLeftWidth(borderLeftWidth: String) extends CssDeclaration {
  val property = "border-left-width"
  val value = borderLeftWidth
}

object BorderLeftWidth {
  // TODO: border-left-width values
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
 * Sets the color of the right border
 * Available from CSS version 1
 */
case class BorderRightColor(borderRightColor: String) extends CssDeclaration {
  val property = "border-right-color"
  val value = borderRightColor
}

object BorderRightColor {
  // TODO: border-right-color values
}

/**
 * Sets the style of the right border
 * Available from CSS version 1
 */
case class BorderRightStyle(borderRightStyle: String) extends CssDeclaration {
  val property = "border-right-style"
  val value = borderRightStyle
}

object BorderRightStyle {
  // TODO: border-right-style values
}

/**
 * Sets the width of the right border
 * Available from CSS version 1
 */
case class BorderRightWidth(borderRightWidth: String) extends CssDeclaration {
  val property = "border-right-width"
  val value = borderRightWidth
}

object BorderRightWidth {
  // TODO: border-right-width values
}

/**
 * Sets the style of the four borders
 * Available from CSS version 1
 */
case class BorderStyle(borderStyle: String) extends CssDeclaration {
  val property = "border-style"
  val value = borderStyle
}

object BorderStyle {
  // TODO: border-style values
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
 * Sets the color of the top border
 * Available from CSS version 1
 */
case class BorderTopColor(borderTopColor: String) extends CssDeclaration {
  val property = "border-top-color"
  val value = borderTopColor
}

object BorderTopColor {
  // TODO: border-top-color values
}

/**
 * Sets the style of the top border
 * Available from CSS version 1
 */
case class BorderTopStyle(borderTopStyle: String) extends CssDeclaration {
  val property = "border-top-style"
  val value = borderTopStyle
}

object BorderTopStyle {
  // TODO: border-top-style values
}

/**
 * Sets the width of the top border
 * Available from CSS version 1
 */
case class BorderTopWidth(borderTopWidth: String) extends CssDeclaration {
  val property = "border-top-width"
  val value = borderTopWidth
}

object BorderTopWidth {
  // TODO: border-top-width values
}

/**
 * Sets the width of the four borders
 * Available from CSS version 1
 */
case class BorderWidth(borderWidth: String) extends CssDeclaration {
  val property = "border-width"
  val value = borderWidth
}

object BorderWidth {
  // TODO: border-width values
}

/**
 * Sets all the outline properties in one declaration
 * Available from CSS version 2
 */
case class Outline(outline: String) extends CssDeclaration {
  val property = "outline"
  val value = outline
}

object Outline {
  // TODO: outline values
}

/**
 * Sets the color of an outline
 * Available from CSS version 2
 */
case class OutlineColor(outlineColor: String) extends CssDeclaration {
  val property = "outline-color"
  val value = outlineColor
}

object OutlineColor {
  // TODO: outline-color values
}

/**
 * Sets the style of an outline
 * Available from CSS version 2
 */
case class OutlineStyle(outlineStyle: String) extends CssDeclaration {
  val property = "outline-style"
  val value = outlineStyle
}

object OutlineStyle {
  // TODO: outline-style values
}

/**
 * Sets the width of an outline
 * Available from CSS version 2
 */
case class OutlineWidth(outlineWidth: String) extends CssDeclaration {
  val property = "outline-width"
  val value = outlineWidth
}

object OutlineWidth {
  // TODO: outline-width values
}

/**
 * Defines the shape of the border of the bottom-left corner
 * Available from CSS version 3
 */
case class BorderBottomLeftRadius(borderBottomLeftRadius: String) extends CssDeclaration {
  val property = "border-bottom-left-radius"
  val value = borderBottomLeftRadius
}

object BorderBottomLeftRadius {
  // TODO: border-bottom-left-radius values
}

/**
 * Defines the shape of the border of the bottom-right corner
 * Available from CSS version 3
 */
case class BorderBottomRightRadius(borderBottomRightRadius: String) extends CssDeclaration {
  val property = "border-bottom-right-radius"
  val value = borderBottomRightRadius
}

object BorderBottomRightRadius {
  // TODO: border-bottom-right-radius values
}

/**
 * A shorthand property for setting all the border-image-* properties
 * Available from CSS version 3
 */
case class BorderImage(borderImage: String) extends CssDeclaration {
  val property = "border-image"
  val value = borderImage
}

object BorderImage {
  // TODO: border-image values
}

/**
 * Specifies the amount by which the border image area extends beyond the border box
 * Available from CSS version 3
 */
case class BorderImageOutset(borderImageOutset: String) extends CssDeclaration {
  val property = "border-image-outset"
  val value = borderImageOutset
}

object BorderImageOutset {
  // TODO: border-image-outset values
}

/**
 * Specifies whether the image-border should be repeated, rounded or stretched
 * Available from CSS version 3
 */
case class BorderImageRepeat(borderImageRepeat: String) extends CssDeclaration {
  val property = "border-image-repeat"
  val value = borderImageRepeat
}

object BorderImageRepeat {
  // TODO: border-image-repeat values
}

/**
 * Specifies the inward offsets of the image-border
 * Available from CSS version 3
 */
case class BorderImageSlice(borderImageSlice: String) extends CssDeclaration {
  val property = "border-image-slice"
  val value = borderImageSlice
}

object BorderImageSlice {
  // TODO: border-image-slice values
}

/**
 * Specifies an image to be used as a border
 * Available from CSS version 3
 */
case class BorderImageSource(borderImageSource: String) extends CssDeclaration {
  val property = "border-image-source"
  val value = borderImageSource
}

object BorderImageSource {
  // TODO: border-image-source values
}

/**
 * Specifies the widths of the image-border
 * Available from CSS version 3
 */
case class BorderImageWidth(borderImageWidth: String) extends CssDeclaration {
  val property = "border-image-width"
  val value = borderImageWidth
}

object BorderImageWidth {
  // TODO: border-image-width values
}

/**
 * A shorthand property for setting all the four border-*-radius properties
 * Available from CSS version 3
 */
case class BorderRadius(borderRadius: String) extends CssDeclaration {
  val property = "border-radius"
  val value = borderRadius
}

object BorderRadius {
  // TODO: border-radius values
}

/**
 * Defines the shape of the border of the top-left corner
 * Available from CSS version 3
 */
case class BorderTopLeftRadius(borderTopLeftRadius: String) extends CssDeclaration {
  val property = "border-top-left-radius"
  val value = borderTopLeftRadius
}

object BorderTopLeftRadius {
  // TODO: border-top-left-radius values
}

/**
 * Defines the shape of the border of the top-right corner
 * Available from CSS version 3
 */
case class BorderTopRightRadius(borderTopRightRadius: String) extends CssDeclaration {
  val property = "border-top-right-radius"
  val value = borderTopRightRadius
}

object BorderTopRightRadius {
  // TODO: border-top-right-radius values
}

/**
 * Available from CSS version 3
 */
case class BoxDecorationBreak(boxDecorationBreak: String) extends CssDeclaration {
  val property = "box-decoration-break"
  val value = boxDecorationBreak
}

object BoxDecorationBreak {
  // TODO: box-decoration-break values
}

/**
 * Attaches one or more drop-shadows to the box
 * Available from CSS version 3
 */
case class BoxShadow(boxShadow: String) extends CssDeclaration {
  val property = "box-shadow"
  val value = boxShadow
}

object BoxShadow {
  // TODO: box-shadow values
}
