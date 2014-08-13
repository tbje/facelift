package com.github.tbje.facelift.css

/**
 * Sets the direction of the moving content
 * Available from CSS version 3
 */
case class MarqueeDirection(marqueeDirection: String) extends CssDeclaration {
  val property = "marquee-direction"
  val value = marqueeDirection
}

object MarqueeDirection {
  // TODO: marquee-direction values
}

/**
 * Sets ho
 * Available from CSS version
 */
case class MarqueePlayCount(marqueePlayCount: String) extends CssDeclaration {
  val property = "marquee-play-count"
  val value = marqueePlayCount
}

object MarqueePlayCount {
  // TODO: marquee-play-count values
}

/**
 * Sets how fast the content scrolls
 * Available from CSS version 3
 */
case class MarqueeSpeed(marqueeSpeed: String) extends CssDeclaration {
  val property = "marquee-speed"
  val value = marqueeSpeed
}

object MarqueeSpeed {
  // TODO: marquee-speed values
}

/**
 * Sets the style of the moving content
 * Available from CSS version 3
 */
case class MarqueeStyle(marqueeStyle: String) extends CssDeclaration {
  val property = "marquee-style"
  val value = marqueeStyle
}

object MarqueeStyle {
  // TODO: marquee-style values
}
