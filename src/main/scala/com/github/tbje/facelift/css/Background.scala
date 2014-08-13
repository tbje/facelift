package com.github.tbje.facelift.css

/**
 * Sets all the background properties in one declaration
 * From CSS version 1
 */
case class Background(background: String) extends CssDeclaration {
  val property = "background"
  val value = background
}

/**
 * Sets whether a background image is fixed or scrolls with the rest of the page
 * From CSS version 1
 */
case class BackgroundAttachment(backgroundAttachment: String) extends CssDeclaration {
  val property = "background-attachment"
  val value = backgroundAttachment
}

object BackgroundAttachment {
  /** The background scrolls along with the element. This is default */
  val Scroll = BackgroundAttachment("scroll")
  /** The background is fixed with regard to the viewport */
  val Fixed = BackgroundAttachment("fixed")
  /** The background scrolls along with the element's contents */
  val Local = BackgroundAttachment("local")
}

/**
 * Sets the background color of an element
 * From CSS version 1
 */
case class BackgroundColor(backgroundColor: String) extends CssDeclaration {
  val property = "background-color"
  val value = backgroundColor
}

object BackgroundColor extends BaseColorObject("background-color")

/**
 * Sets the background image for an element
 * From CSS version 1
 */
case class BackgroundImage(backgroundImage: String) extends CssDeclaration {
  val property = BackgroundImage.property
  val value = backgroundImage
}

object BackgroundImage extends InheritX[BackgroundImage] {
  val property = "background-image"
  def url(url: String*) = BackgroundImage("url" + url.mkString("('", "' ,'", "')"))
  val None = BackgroundImage("none")
}

/**
 * Sets the starting position of a background image
 * From CSS version 1
 */
case class BackgroundPosition(backgroundPosition: String) extends CssDeclaration {
  val property = BackgroundPosition.property
  val value = backgroundPosition
}

object BackgroundPosition extends InheritX[BackgroundPosition] {
  val property = "background-position"
  val LeftTop = BackgroundPosition("left top")
  val LeftCenter = BackgroundPosition("left center")
  val LeftBottom = BackgroundPosition("left bottom")
  val RightTop = BackgroundPosition("right top")
  val RightCenter = BackgroundPosition("right center")
  val RightBottom = BackgroundPosition("right bottom")
  val CenterTop = BackgroundPosition("center top")
  val CenterCenter = BackgroundPosition("center center")
  val CenterBottom = BackgroundPosition("center bottom")
  def apply(x: CssMeasure, y: CssMeasure) = new BackgroundPosition(s"${x.value}, ${y.value}")
}

/**
 * Sets how a background image will be repeated
 * From CSS version 1
 */
case class BackgroundRepeat(backgroundRepeat: String) extends CssDeclaration {
  val property = BackgroundRepeat.property
  val value = backgroundRepeat
}

object BackgroundRepeat extends InheritX[BackgroundRepeat] {
  val property = "background-repeat"
  /** The background image will be repeated both vertically and horizontally. This is default */
  val Repeat = BackgroundRepeat("repeat")
  /** The background image will be repeated only horizontally */
  val RepeatX = BackgroundRepeat("repeat-x")
  /** The background image will be repeated only vertically */
  val RepeatY = BackgroundRepeat("repeat-y")
  /** The background-image will not be repeated */
  val NoRepeat = BackgroundRepeat("no-repeat")
}

/**
 * Specifies the painting area of the background
 * From CSS version 3
 */
case class BackgroundClip(backgroundClip: String) extends CssDeclaration {
  val property = "background-clip"
  val value = backgroundClip
}

/**
 * Specifies the positioning area of the background images
 * From CSS version 3
 */
case class BackgroundOrigin(backgroundOrigin: String) extends CssDeclaration {
  val property = "background-origin"
  val value = backgroundOrigin
}

/**
 * Specifies the size of the background images
 * From CSS version 3
 */
case class BackgroundSize(backgroundSize: String) extends CssDeclaration {
  val property = "background-size"
  val value = backgroundSize
}
