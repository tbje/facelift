package com.github.tbje.facelift.css

/**
 * Specifies whether or not to clip the left/right edges of the content, if it overflows the element's content area
 * Available from CSS version 3
 */
case class OverflowX(overflowX: String) extends CssDeclaration {
  val property = "overflow-x"
  val value = overflowX
}

object OverflowX {
  // TODO: overflow-x values
}

/**
 * Specifies whether or not to clip the top/bottom edges of the content, if it overflows the element's content area
 * Available from CSS version 3
 */
case class OverflowY(overflowY: String) extends CssDeclaration {
  val property = "overflow-y"
  val value = overflowY
}

object OverflowY {
  // TODO: overflow-y values
}

/**
 * Specifies the preferred scrolling method for elements that overflow
 * Available from CSS version 3
 */
case class OverflowStyle(overflowStyle: String) extends CssDeclaration {
  val property = "overflow-style"
  val value = overflowStyle
}

object OverflowStyle {
  // TODO: overflow-style values
}

/**
 * Rotates an element around a given point defined by the rotation-point property
 * Available from CSS version 3
 */
case class Rotation(rotation: String) extends CssDeclaration {
  val property = "rotation"
  val value = rotation
}

object Rotation {
  // TODO: rotation values
}

/**
 * Defines a point as an offset from the top left border edge
 * Available from CSS version 3
 */
case class RotationPoint(rotationPoint: String) extends CssDeclaration {
  val property = "rotation-point"
  val value = rotationPoint
}

object RotationPoint {
  // TODO: rotation-point values
}

/**
 * Specifies how to align the child elements of a box
 * Available from CSS version 3
 */
case class BoxAlign(boxAlign: String) extends CssDeclaration {
  val property = "box-align"
  val value = boxAlign
}

object BoxAlign {
  // TODO: box-align values
}

/**
 * Specifies in which direction the children of a box are displayed
 * Available from CSS version 3
 */
case class BoxDirection(boxDirection: String) extends CssDeclaration {
  val property = "box-direction"
  val value = boxDirection
}

object BoxDirection {
  // TODO: box-direction values
}

/**
 * Specifies whether the children of a box is flexible or inflexible in size
 * Available from CSS version 3
 */
case class BoxFlex(boxFlex: String) extends CssDeclaration {
  val property = "box-flex"
  val value = boxFlex
}

object BoxFlex {
  // TODO: box-flex values
}

/**
 * Assigns flexible elements to flex groups
 * Available from CSS version 3
 */
case class BoxFlexGroup(boxFlexGroup: String) extends CssDeclaration {
  val property = "box-flex-group"
  val value = boxFlexGroup
}

object BoxFlexGroup {
  // TODO: box-flex-group values
}

/**
 * Specifies whether columns will go onto a new line whenever it runs out of space in the parent box
 * Available from CSS version 3
 */
case class BoxLines(boxLines: String) extends CssDeclaration {
  val property = "box-lines"
  val value = boxLines
}

object BoxLines {
  // TODO: box-lines values
}

/**
 * Specifies the display order of the child elements of a box
 * Available from CSS version 3
 */
case class BoxOrdinalGroup(boxOrdinalGroup: String) extends CssDeclaration {
  val property = "box-ordinal-group"
  val value = boxOrdinalGroup
}

object BoxOrdinalGroup {
  // TODO: box-ordinal-group values
}

/**
 * Specifies whether the children of a box should be laid out horizontally or vertically
 * Available from CSS version 3
 */
case class BoxOrient(boxOrient: String) extends CssDeclaration {
  val property = "box-orient"
  val value = boxOrient
}

object BoxOrient {
  // TODO: box-orient values
}

/**
 * Specifies the horizontal position in horizontal boxes and the vertical position in vertical boxes
 * Available from CSS version 3
 */
case class BoxPack(boxPack: String) extends CssDeclaration {
  val property = "box-pack"
  val value = boxPack
}

object BoxPack {
  // TODO: box-pack values
}
