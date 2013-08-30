package tbje.facelift.css

/**
 * Applies a 2D or 3D transformation to an element
 * Available from CSS version 3
 */
case class Transform(transform: String) extends CssDeclaration {
  val property = "transform"
  val value = transform
}

object Transform {
  // TODO: transform values
}

/**
 * Allows you to change the position on transformed elements
 * Available from CSS version 3
 */
case class TransformOrigin(transformOrigin: String) extends CssDeclaration {
  val property = "transform-origin"
  val value = transformOrigin
}

object TransformOrigin {
  // TODO: transform-origin values
}

/**
 * Specifies how nested elements are rendered in 3D space
 * Available from CSS version 3
 */
case class TransformStyle(transformStyle: String) extends CssDeclaration {
  val property = "transform-style"
  val value = transformStyle
}

object TransformStyle {
  // TODO: transform-style values
}

/**
 * 	Specifies the perspective on how 3D elements are viewed
 * Available from CSS version 3
 */
case class Perspective(perspective: String) extends CssDeclaration {
  val property = "perspective"
  val value = perspective
}

object Perspective {
  // TODO: perspective values
}

/**
 * Specifies the bottom position of 3D elements
 * Available from CSS version 3
 */
case class PerspectiveOrigin(perspectiveOrigin: String) extends CssDeclaration {
  val property = "perspective-origin"
  val value = perspectiveOrigin
}

object PerspectiveOrigin {
  // TODO: perspective-origin values
}

/**
 * Defines whether or not an element should be visible when not facing the screen
 * Available from CSS version 3
 */
case class BackfaceVisibility(backfaceVisibility: String) extends CssDeclaration {
  val property = "backface-visibility"
  val value = backfaceVisibility
}

object BackfaceVisibility {
  // TODO: backface-visibility values
}
