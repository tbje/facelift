package com.github.tbje.facelift.css

/**
 * Sets the color of text
 * Available from CSS version 1
 */
case class Color(color: String) extends CssDeclaration {
  val property = "color"
  val value = color
}

object Color extends BaseColorObject("color")

/**
 * Specifies the text direction/writing direction
 * Available from CSS version 2
 */
case class Direction(direction: String) extends CssDeclaration {
  val property = "direction"
  val value = direction
}

object Direction {
  // TODO: direction values
}

/**
 * Increases or decreases the space between characters in a text
 * Available from CSS version 1
 */
case class LetterSpacing(letterSpacing: String) extends CssDeclaration {
  val property = "letter-spacing"
  val value = letterSpacing
}

object LetterSpacing {
  // TODO: letter-spacing values
}

/**
 * Sets the line height
 * Available from CSS version 1
 *
 */
case class LineHeight(lineHeight: String) extends CssDeclaration {
  val property = "line-height"
  val value = lineHeight
}

object LineHeight {
  def apply(measure: CssMeasure) = new LineHeight(measure.value)
}

case class TextAlign(value: String) extends CssDeclaration {
  val property = "text-align"
}

object TextAlign {
  val Left = new TextAlign("left") // Aligns the text to the left
  val Right = new TextAlign("right") // Aligns the text to the right
  val Center = new TextAlign("center") // Centers the text
  val Justify = new TextAlign("justify") // Stretches the lines so that each line has equal width (like in newspapers and magazines
  val Inherit = new TextAlign("inherit") // Specifies that the value of the text-align property should be inherited from the parent element
  val Default = Left
}

/**
 * Specifies the decoration added to text
 * Available from CSS version 1
 */
case class TextDecoration(textDecoration: String) extends CssDeclaration {
  val property = "text-decoration"
  val value = textDecoration
}

object TextDecoration {
  // TODO: text-decoration values
}

/**
 * Specifies the indentation of the first line in a text-block
 * Available from CSS version 1
 */
case class TextIndent(textIndent: String) extends CssDeclaration {
  val property = "text-indent"
  val value = textIndent
}

object TextIndent {
  // TODO: text-indent values
}
/**
 * Controls the capitalization of text
 * Available from CSS version 1
 *
 */
case class TextTransform(textTransform: String) extends CssDeclaration {
  val property = "text-transform"
  val value = textTransform
}

object TextTransform {
  // TODO: text-transform values
}

/**
 * No description
 * Available from CSS version 2
 */
case class UnicodeBidi(unicodeBidi: String) extends CssDeclaration {
  val property = "unicode-bidi"
  val value = unicodeBidi
}

object UnicodeBidi {
  // TODO: unicode-bidi values
}

/**
 * Sets the vertical alignment of an element
 * Available from CSS version 1
 */
case class VerticalAlign(verticalAlign: String) extends CssDeclaration {
  val property = "vertical-align"
  val value = verticalAlign
}

object VerticalAlign {
  // TODO: vertical-align values
}

/**
 * Specifies how white-space inside an element is handled
 * Available from CSS version 1
 */
case class WhiteSpace(whiteSpace: String) extends CssDeclaration {
  val property = "white-space"
  val value = whiteSpace
}

object WhiteSpace {
  // TODO: white-space values
}

/**
 * Increases or decreases the space between words in a text
 * Available from CSS version 1
 *
 */
case class WordSpacing(wordSpacing: String) extends CssDeclaration {
  val property = "word-spacing"
  val value = wordSpacing
}

object WordSpacing {
  // TODO: word-spacing values
}

/**
 * Specifies whether a punctuation character may be placed outside the line box
 * Available from CSS version 3
 */
case class HangingPunctuation(hangingPunctuation: String) extends CssDeclaration {
  val property = "hanging-punctuation"
  val value = hangingPunctuation
}

object HangingPunctuation {
  // TODO: hanging-punctuation values
}

/**
 * Specifies whether a punctuation character should be trimmed
 * Available from CSS version 3
 */
case class PunctuationTrim(punctuationTrim: String) extends CssDeclaration {
  val property = "punctuation-trim"
  val value = punctuationTrim
}

object PunctuationTrim {
  // TODO: punctuation-trim values
}

/**
 * Describes how the last line of a block or a line right before a forced line break is aligned when text-align is "justify"
 * Available from CSS version 3
 */
case class TextAlignLast(textAlignLast: String) extends CssDeclaration {
  val property = "text-align-last"
  val value = textAlignLast
}

object TextAlignLast {
  // TODO: text-align-last values
}

/**
 * Specifies the justification method used when text-align is "justify"
 * Available from CSS version 3
 *
 */
case class TextJustify(textJustify: String) extends CssDeclaration {
  val property = "text-justify"
  val value = textJustify
}

object TextJustify {
  // TODO: text-justify values
}

/**
 * Specifies a text outline
 * Available from CSS version 3
 */
case class TextOutline(textOutline: String) extends CssDeclaration {
  val property = "text-outline"
  val value = textOutline
}

object TextOutline {
  // TODO: text-outline values
}

/**
 * Specifies what should happen when text overflows the containing element
 * Available from CSS version 3
 */
case class TextOverflow(textOverflow: String) extends CssDeclaration {
  val property = "text-overflow"
  val value = textOverflow
}

object TextOverflow {
  // TODO: text-overflow values
}

/**
 * Adds shadow to text
 * Available from CSS version 3
 */
case class TextShadow(textShadow: String) extends CssDeclaration {
  val property = "text-shadow"
  val value = textShadow
}

object TextShadow {
  // TODO: text-shadow values
}

/**
 * Specifies line breaking rules for text
 * Available from CSS version 3
 *
 */
case class TextWrap(textWrap: String) extends CssDeclaration {
  val property = "text-wrap"
  val value = textWrap
}

object TextWrap {
  // TODO: text-wrap values
}

/**
 * Specifies line breaking rules for non-CJK scripts
 * Available from CSS version 3
 */
case class WordBreak(wordBreak: String) extends CssDeclaration {
  val property = "word-break"
  val value = wordBreak
}

object WordBreak {
  // TODO: word-break values
}

/**
 * Allows long, unbreakable words to be broken and wrap to the next line
 * Available from CSS version 3
 */
case class WordWrap(wordWrap: String) extends CssDeclaration {
  val property = "word-wrap"
  val value = wordWrap
}

object WordWrap {
  // TODO: word-wrap values
}
