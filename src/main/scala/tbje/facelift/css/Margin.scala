package tbje.facelift.css

case class Margin(value: String) extends CssDeclaration {
  val property = "margin"
}

object MarginPx {
  def apply(top: Int, right: Int, bottom: Int, left: Int) = new Margin(s"${top}px ${right}px ${bottom}px ${left}px")
  def apply(top: Int, rightAndLeft: Int, bottom: Int) = new Margin(s"${top}px ${rightAndLeft}px ${bottom}px")
  def apply(topAndBottom: Int, rightAndLeft: Int) = new Margin(s"${topAndBottom}px ${rightAndLeft}px")
  def apply(all: Int) = new Margin(s"${all}px")
}

