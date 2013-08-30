package tbje.facelift.css

/**
 * Allows you to make an element look like a standard user interface element
 * Available from CSS version 3
 */
case class Appearance(appearance: String) extends CssDeclaration {
  val property = "appearance"
  val value = appearance
}

object Appearance {
  // TODO: appearance values
}

/**
 * Allows you to define certain elements to fit an area in a certain way
 * Available from CSS version 3
 */
case class BoxSizing(boxSizing: String) extends CssDeclaration {
  val property = "box-sizing"
  val value = boxSizing
}

object BoxSizing {
  // TODO: box-sizing values
}

/**
 * Provides the author the ability to style an element with an iconic equivalent
 * Available from CSS version 3
 */
case class Icon(icon: String) extends CssDeclaration {
  val property = "icon"
  val value = icon
}

object Icon {
  // TODO: icon values
}

/**
 * Specifies where to navigate when using the arrow-down navigation key
 * Available from CSS version 3
 */
case class NavDown(navDown: String) extends CssDeclaration {
  val property = "nav-down"
  val value = navDown
}

object NavDown {
  // TODO: nav-down values
}

/**
 * Specifies the tabbing order for an element
 * Available from CSS version 3
 */
case class NavIndex(navIndex: String) extends CssDeclaration {
  val property = "nav-index"
  val value = navIndex
}

object NavIndex {
  // TODO: nav-index values
}

/**
 * Specifies where to navigate when using the arrow-left navigation key
 * Available from CSS version 3
 */
case class NavLeft(navLeft: String) extends CssDeclaration {
  val property = "nav-left"
  val value = navLeft
}

object NavLeft {
  // TODO: nav-left values
}

/**
 * Specifies where to navigate when using the arrow-right navigation key
 * Available from CSS version 3
 */
case class NavRight(navRight: String) extends CssDeclaration {
  val property = "nav-right"
  val value = navRight
}

object NavRight {
  // TODO: nav-right values
}

/**
 * Specifies where to navigat
 * Available from CSS version
 */
case class NavUp(navUp: String) extends CssDeclaration {
  val property = "nav-up"
  val value = navUp
}

object NavUp {
  // TODO: nav-up values
}

/**
 * Offsets an outline, and draws it beyond the border edge
 * Available from CSS version 3
 */
case class OutlineOffset(outlineOffset: String) extends CssDeclaration {
  val property = "outline-offset"
  val value = outlineOffset
}

object OutlineOffset {
  // TODO: outline-offset values
}

/**
 * Specifies whether or not an element is resizable by the user
 * Available from CSS version 3
 */
case class Resize(resize: String) extends CssDeclaration {
  val property = "resize"
  val value = resize
}

object Resize {
  // TODO: resize values
}
