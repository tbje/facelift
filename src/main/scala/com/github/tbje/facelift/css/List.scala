package com.github.tbje.facelift.css

/**
 * Sets all the properties for a list in one declaration
 * Available from CSS version 1
 */
case class ListStyle(listStyle: String) extends CssDeclaration {
  val property = "list-style"
  val value = listStyle
}

object ListStyle {
  // TODO: list-style values
}

/**
 * Specifies an image as the list-item marker
 * Available from CSS version 1
 */
case class ListStyleImage(listStyleImage: String) extends CssDeclaration {
  val property = "list-style-image"
  val value = listStyleImage
}

object ListStyleImage {
  // TODO: list-style-image values
}

/**
 * Specifies if the list-item markers should appear inside or outside the content flow
 * Available from CSS version 1
 */
case class ListStylePosition(listStylePosition: String) extends CssDeclaration {
  val property = "list-style-position"
  val value = listStylePosition
}

object ListStylePosition {
  // TODO: list-style-position values
}

/**
 * Specifies the type of list-item marker
 * Available from CSS version 1
 */
case class ListStyleType(listStyleType: String) extends CssDeclaration {
  val property = "list-style-type"
  val value = listStyleType
}

object ListStyleType {
  // TODO: list-style-type values
}
