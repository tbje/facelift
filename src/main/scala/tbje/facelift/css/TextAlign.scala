package tbje.facelift.css

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
