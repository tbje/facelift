package com.github.tbje.facelift.css

/**
 * Allows more precise alignment of elements
 * Available from CSS version 3
 */
case class AlignmentAdjust(alignmentAdjust: String) extends CssDeclaration {
  val property = "alignment-adjust"
  val value = alignmentAdjust
}

object AlignmentAdjust {
  // TODO: alignment-adjust values
}

/**
 * Specifies how an inline-level element is aligned with respect to its parent
 * Available from CSS version 3
 */
case class AlignmentBaseline(alignmentBaseline: String) extends CssDeclaration {
  val property = "alignment-baseline"
  val value = alignmentBaseline
}

object AlignmentBaseline {
  // TODO: alignment-baseline values
}

/**
 * Allows repositioning of the dominant-baseline relative to the dominant-baseline
 * Available from CSS version 3
 */
case class BaselineShift(baselineShift: String) extends CssDeclaration {
  val property = "baseline-shift"
  val value = baselineShift
}

object BaselineShift {
  // TODO: baseline-shift values
}

/**
 * Specifies a scaled-baseline-table
 * Available from CSS version 3
 *
 */
case class DominantBaseline(dominantBaseline: String) extends CssDeclaration {
  val property = "dominant-baseline"
  val value = dominantBaseline
}

object DominantBaseline {
  // TODO: dominant-baseline values
}

/**
 * Sets the alignment point of the drop initial for the primary connection point
 * Available from CSS version 3
 */
case class DropInitialAfterAdjust(dropInitialAfterAdjust: String) extends CssDeclaration {
  val property = "drop-initial-after-adjust"
  val value = dropInitialAfterAdjust
}

object DropInitialAfterAdjust {
  // TODO: drop-initial-after-adjust values
}

/**
 * Sets which alignment line within the initial line box is used at the primary connection point with the initial letter box
 * Available from CSS version 3
 */
case class DropInitialAfterAlign(dropInitialAfterAlign: String) extends CssDeclaration {
  val property = "drop-initial-after-align"
  val value = dropInitialAfterAlign
}

object DropInitialAfterAlign {
  // TODO: drop-initial-after-align values
}

/**
 * Sets the alignment point of the drop initial for the secondary connection point
 * Available from CSS version 3
 */
case class DropInitialBeforeAdjust(dropInitialBeforeAdjust: String) extends CssDeclaration {
  val property = "drop-initial-before-adjust"
  val value = dropInitialBeforeAdjust
}

object DropInitialBeforeAdjust {
  // TODO: drop-initial-before-adjust values
}

/**
 * Sets which alignment line within the initial line box is used at the secondary connection point with the initial letter box
 * Available from CSS version 3
 */
case class DropInitialBeforeAlign(dropInitialBeforeAlign: String) extends CssDeclaration {
  val property = "drop-initial-before-align"
  val value = dropInitialBeforeAlign
}

object DropInitialBeforeAlign {
  // TODO: drop-initial-before-align values
}

/**
 * Controls the partial sinking of the initial letter
 * Available from CSS version 3
 */
case class DropInitialSize(dropInitialSize: String) extends CssDeclaration {
  val property = "drop-initial-size"
  val value = dropInitialSize
}

object DropInitialSize {
  // TODO: drop-initial-size values
}

/**
 * Activates a drop-initial effect	3
 * Available from CSS version
 */
case class DropInitialValue(dropInitialValue: String) extends CssDeclaration {
  val property = "drop-initial-value"
  val value = dropInitialValue
}

object DropInitialValue {
  // TODO: drop-initial-value values
}

/**
 * Sets which line of a multi-line inline block align with the previous and next inline elements within a line
 * Available from CSS version 3
 */
case class InlineBoxAlign(inlineBoxAlign: String) extends CssDeclaration {
  val property = "inline-box-align"
  val value = inlineBoxAlign
}

object InlineBoxAlign {
  // TODO: inline-box-align values
}

/**
 * A shorthand property for setting the line-stacking-strategy, line-stacking-ruby, and line-stacking-shift properties
 * Available from CSS version 3
 */
case class LineStacking(lineStacking: String) extends CssDeclaration {
  val property = "line-stacking"
  val value = lineStacking
}

object LineStacking {
  // TODO: line-stacking values
}

/**
 * Sets the line stacking method for block elements containing ruby annotation elements
 * Available from CSS version 3
 */
case class LineStackingRuby(lineStackingRuby: String) extends CssDeclaration {
  val property = "line-stacking-ruby"
  val value = lineStackingRuby
}

object LineStackingRuby {
  // TODO: line-stacking-ruby values
}

/**
 * Sets the line stacking method for block elements containing elements with base-shift
 * Available from CSS version 3
 */
case class LineStackingShift(lineStackingShift: String) extends CssDeclaration {
  val property = "line-stacking-shift"
  val value = lineStackingShift
}

object LineStackingShift {
  // TODO: line-stacking-shift values
}

/**
 * Sets the line stacking strategy for stacked line boxes within a containing block element
 * Available from CSS version 3
 */
case class LineStackingStrategy(lineStackingStrategy: String) extends CssDeclaration {
  val property = "line-stacking-strategy"
  val value = lineStackingStrategy
}

object LineStackingStrategy {
  // TODO: line-stacking-strategy values
}

/**
 * Sets the block-progression dimension of the text content area of an inline box
 * Available from CSS version 3
 */
case class TextHeight(textHeight: String) extends CssDeclaration {
  val property = "text-height"
  val value = textHeight
}

object TextHeight {
  // TODO: text-height values
}
