package com.github.tbje.facelift.css

/**
 * Specifies the animation
 * Available from CSS version 3
 */
case class Keyframes(keyframes: String) extends CssDeclaration {
  val property = "@keyframes"
  val value = keyframes
}

object Keyframes {
  // TODO: @keyframes values
}

/**
 * A shorthand property for all the animation properties below, except the animation-play-state property
 * Available from CSS version 3
 */
case class Animation(animation: String) extends CssDeclaration {
  val property = "animation"
  val value = animation
}

object Animation {
  // TODO: animation values
}

/**
 * Specifies a name for the @keyframes animation
 * Available from CSS version 3
 */
case class AnimationName(animationName: String) extends CssDeclaration {
  val property = "animation-name"
  val value = animationName
}

object AnimationName {
  // TODO: animation-name values
}

/**
 * Specifies how many seconds or milliseconds an animation takes to complete one cycle
 * Available from CSS version 3
 */
case class AnimationDuration(animationDuration: String) extends CssDeclaration {
  val property = "animation-duration"
  val value = animationDuration
}

object AnimationDuration {
  // TODO: animation-duration values
}

/**
 * Specifies the speed curve of the animation
 * Available from CSS version 3
 */
case class AnimationTimingFunction(animationTimingFunction: String) extends CssDeclaration {
  val property = "animation-timing-function"
  val value = animationTimingFunction
}

object AnimationTimingFunction {
  // TODO: animation-timing-function values
}

/**
 * Specifies when the animation will start
 * Available from CSS version 3
 */
case class AnimationDelay(animationDelay: String) extends CssDeclaration {
  val property = "animation-delay"
  val value = animationDelay
}

object AnimationDelay {
  // TODO: animation-delay values
}

/**
 * Specifies the number of times an animation should be played
 * Available from CSS version 3
 */
case class AnimationIterationCount(animationIterationCount: String) extends CssDeclaration {
  val property = "animation-iteration-count"
  val value = animationIterationCount
}

object AnimationIterationCount {
  // TODO: animation-iteration-count values
}

/**
 * Specifies whether or not the animation should play in reverse on alternate cycles
 * Available from CSS version 3
 */
case class AnimationDirection(animationDirection: String) extends CssDeclaration {
  val property = "animation-direction"
  val value = animationDirection
}

object AnimationDirection {
  // TODO: animation-direction values
}

/**
 * Specifies whether the animation is running or paused
 * Available from CSS version 3
 */
case class AnimationPlayState(animationPlayState: String) extends CssDeclaration {
  val property = "animation-play-state"
  val value = animationPlayState
}

object AnimationPlayState {
  // TODO: animation-play-state values
}
