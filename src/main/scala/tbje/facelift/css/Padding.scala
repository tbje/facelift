package tbje.facelift.css

case class Padding(value: String) extends CssDeclaration {
  val property = "padding"
}

object PaddingPx {
  def apply(top: Int, right: Int, bottom: Int, left: Int) = new Padding(s"${top}px ${right}px ${bottom}px ${left}px")
  def apply(top: Int, rightAndLeft: Int, bottom: Int) = new Padding(s"${top}px ${rightAndLeft}px ${bottom}px")
  def apply(topAndBottom: Int, rightAndLeft: Int) = new Padding(s"${topAndBottom}px ${rightAndLeft}px")
  def apply(all: Int) = new Padding(s"${all}px")
}
