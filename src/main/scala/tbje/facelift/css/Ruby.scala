package tbje.facelift.css

/**
 * Controls the text alignment of the ruby text and ruby base contents relative to each other
 * Available from CSS version 3
 */
case class RubyAlign(rubyAlign: String) extends CssDeclaration {
  val property = "ruby-align"
  val value = rubyAlign
}

object RubyAlign {
  // TODO: ruby-align values
}

/**
 * Determines whether, and on which side, ruby text is allowed to partially overhang any adjacent text in addition to its own base, when the ruby text is wider than the ruby base
 * Available from CSS version 3
 */
case class RubyOverhang(rubyOverhang: String) extends CssDeclaration {
  val property = "ruby-overhang"
  val value = rubyOverhang
}

object RubyOverhang {
  // TODO: ruby-overhang values
}

/**
 * Controls the position of the ruby text with respect to its base
 * Available from CSS version 3
 */
case class RubyPosition(rubyPosition: String) extends CssDeclaration {
  val property = "ruby-position"
  val value = rubyPosition
}

object RubyPosition {
  // TODO: ruby-position values
}

/**
 * Controls the spanning behavior of annotation elements
 * Available from CSS version 3
 */
case class RubySpan(rubySpan: String) extends CssDeclaration {
  val property = "ruby-span"
  val value = rubySpan
}

object RubySpan {
  // TODO: ruby-span values
}
