package tbje.facelift.css

/**
 * Sets the color of text
 * Available from CSS version 1
 */
// TODO: color

/**
 * Specifies the text direction/writing direction
 * Available from CSS version 2
 */
// TODO: direction

/**
 * Increases or decreases the space between characters in a text
 * Available from CSS version 1
 */
// TODO: letter-spacing

/**
 * Sets the line height
 * Available from CSS version 1
 *
 */
// TODO: line-height	

case class TextAlign(value: String) extends CssDeclaration {
  val property = "text-align"
}

object TextAlign {
  object Left extends TextAlign("left") // Aligns the text to the left
  object Right extends TextAlign("right") // Aligns the text to the right
  object Center extends TextAlign("center") // Centers the text
  object Justify extends TextAlign("justify") // Stretches the lines so that each line has equal width (like in newspapers and magazines
  object Inherit extends TextAlign("inherit") // Specifies that the value of the text-align property should be inherited from the parent element
  val Default = Left
}

/**
 * Specifies the decoration added to text
 * Available from CSS version 1
 */
// TODO: text-decoration

/**
 * Specifies the indentation of the first line in a text-block
 * Available from CSS version 1
 */
// TODO: text-indent

/**
 * Controls the capitalization of text
 * Available from CSS version 1
 *
 */
// TODO: text-transform	

/**
 * No description
 * Available from CSS version 2
 */
// TODO: unicode-bidi

/**
 * Sets the vertical alignment of an element
 * Available from CSS version 1
 */
// TODO: vertical-align

/**
 * Specifies how white-space inside an element is handled
 * Available from CSS version 1
 */
// TODO: white-space

/**
 * Increases or decreases the space between words in a text
 * Available from CSS version 1
 *
 */
// TODO: word-spacing	

/**
 * Specifies whether a punctuation character may be placed outside the line box
 * Available from CSS version 3
 */
// TODO: hanging-punctuation

/**
 * Specifies whether a punctuation character should be trimmed
 * Available from CSS version 3
 */
// TODO: punctuation-trim

/**
 * Describes how the last line of a block or a line right before a forced line break is aligned when text-align is "justify"
 * Available from CSS version 3
 */
// TODO: text-align-last

/**
 * Specifies the justification method used when text-align is "justify"
 * Available from CSS version 3
 *
 */
// TODO: text-justify	

/**
 * Specifies a text outline
 * Available from CSS version 3
 */
// TODO: text-outline

/**
 * Specifies what should happen when text overflows the containing element
 * Available from CSS version 3
 */
// TODO: text-overflow

/**
 * Adds shadow to text
 * Available from CSS version 3
 */
// TODO: text-shadow

/**
 * Specifies line breaking rules for text
 * Available from CSS version 3
 *
 */
// TODO: text-wrap	

/**
 * Specifies line breaking rules for non-CJK scripts
 * Available from CSS version 3
 */
// TODO: word-break

/**
 * Allows long, unbreakable words to be broken and wrap to the next line
 * Available from CSS version 3
 */
// TODO: word-wrap
