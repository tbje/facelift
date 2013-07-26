package tbje.facelift.css

case class Margin(value: String) extends CssDeclaration {
  val property = "margin"
}

class MarginLeft(val value: String) extends CssDeclaration {
  val property = "margin-left"
}

object MarginLeft {
  def apply(value: String) = new MarginLeft(value)
}

case class MarginLeftPx(x: Int) extends MarginLeft(s"${x}px")

class MarginRight(val value: String) extends CssDeclaration {
  val property = "margin-right"
}

object MarginRight {
  def apply(value: String) = new MarginLeft(value)
}

case class MarginRightPx(x: Int) extends MarginRight(s"${x}px")

class MarginTop(val value: String) extends CssDeclaration {
  val property = "margin-top"
}

object MarginTop {
  def apply(value: String) = new MarginTop(value)
}

case class MarginTopPx(x: Int) extends MarginTop(s"${x}px")

class MarginBottom(val value: String) extends CssDeclaration {
  val property = "margin-bottom"
}

object MarginBottom {
  def apply(value: String) = new MarginBottom(value)
}

case class MarginBottomPx(x: Int) extends MarginBottom(s"${x}px")

object MarginPx {
  def apply(top: Int, right: Int, bottom: Int, left: Int) = new Margin(s"${top}px ${right}px ${bottom}px ${left}px")
  def apply(top: Int, rightAndLeft: Int, bottom: Int) = new Margin(s"${top}px ${rightAndLeft}px ${bottom}px")
  def apply(topAndBottom: Int, rightAndLeft: Int) = new Margin(s"${topAndBottom}px ${rightAndLeft}px")
  def apply(all: Int) = new Margin(s"${all}px")
}

