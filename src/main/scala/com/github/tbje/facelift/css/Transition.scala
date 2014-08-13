package com.github.tbje.facelift.css

/**
 * A shorthand property for setting the four transition properties
 * Available from CSS version 3
 */
case class Transition(transition: String) extends CssDeclaration {
  val property = "transition"
  val value = transition
}

object Transition {
  // TODO: transition values
}

/**
 * Specifies the name of the CSS property the transition effect is for
 * Available from CSS version 3
 */
case class TransitionProperty(transitionProperty: String) extends CssDeclaration {
  val property = "transition-property"
  val value = transitionProperty
}

object TransitionProperty {
  // TODO: transition-property values
}

/**
 * Specifies how many seconds or milliseconds a transition effect takes to complete
 * Available from CSS version 3
 */
case class TransitionDuration(transitionDuration: String) extends CssDeclaration {
  val property = "transition-duration"
  val value = transitionDuration
}

object TransitionDuration {
  // TODO: transition-duration values
}

/**
 * Specifies the speed curve of the transition effect
 * Available from CSS version 3
 */
case class TransitionTimingFunction(transitionTimingFunction: String) extends CssDeclaration {
  val property = "transition-timing-function"
  val value = transitionTimingFunction
}

object TransitionTimingFunction {
  // TODO: transition-timing-function values
}

/**
 * Specifies when the transition effect will start
 * Available from CSS version 3
 */
case class TransitionDelay(transitionDelay: String) extends CssDeclaration {
  val property = "transition-delay"
  val value = transitionDelay
}

object TransitionDelay {
  // TODO: transition-delay values
}
