package com.github.tbje.facelift.css

/**
 * Used with the :before and :after pseudo-elements, to insert generated content
 * Available from CSS version 2
 */
case class Content(content: String) extends CssDeclaration {
  val property = "content"
  val value = content
}

object Content {
  // TODO: content values
}

/**
 * Increments one or more counters
 * Available from CSS version 2
 */
case class CounterIncrement(counterIncrement: String) extends CssDeclaration {
  val property = "counter-increment"
  val value = counterIncrement
}

object CounterIncrement {
  // TODO: counter-increment values
}

/**
 * Creates or resets one or more counters
 * Available from CSS version 2
 */
case class CounterReset(counterReset: String) extends CssDeclaration {
  val property = "counter-reset"
  val value = counterReset
}

object CounterReset {
  // TODO: counter-reset values
}

/**
 * Sets the type of quotation marks for embedded quotations
 * Available from CSS version 2
 */
case class Quotes(quotes: String) extends CssDeclaration {
  val property = "quotes"
  val value = quotes
}

object Quotes {
  // TODO: quotes values
}

/**
 * Allows a replaced element to be just a rectangular area of an object, instead of the whole object
 * Available from CSS version 3
 */
case class Crop(crop: String) extends CssDeclaration {
  val property = "crop"
  val value = crop
}

object Crop {
  // TODO: crop values
}

/**
 * Causes an element to be removed from the flow and reinserted at a later point in the document
 * Available from CSS version 3
 */
case class MoveTo(moveTo: String) extends CssDeclaration {
  val property = "move-to"
  val value = moveTo
}

object MoveTo {
  // TODO: move-to values
}

/**
 * Determines which page-based occurrence of a given element is applied to a counter or string value
 * Available from CSS version 3
 */
case class PagePolicy(pagePolicy: String) extends CssDeclaration {
  val property = "page-policy"
  val value = pagePolicy
}

object PagePolicy {
  // TODO: page-policy values
}
