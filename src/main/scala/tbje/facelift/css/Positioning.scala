package tbje.facelift.css

class Float(val value: String) extends CssDeclaration {
  val property = "float"
}
object Float {
  def apply(value: String) = new Float(value)
  object Left extends Float("left")
  object Right extends Float("right")
  object None extends Float("none")
  object Inherit extends Float("inherit")
}