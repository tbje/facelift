package tbje.facelift.css

class Margin(val value: String) extends CssDeclaration {
  val property = Margin.property
}

object Margin extends AutoInheritX[Margin] {
  val property = "margin"
  def apply(top: CssMeasure, right: CssMeasure, bottom: CssMeasure, left: CssMeasure) = new Margin(s"${top.value} ${right.value} ${bottom.value} ${left.value}")
  def apply(top: CssMeasure, rightAndLeft: CssMeasure, bottom: CssMeasure) = new Margin(s"${top.value} ${rightAndLeft.value} ${bottom.value}")
  def apply(topAndBottom: CssMeasure, rightAndLeft: CssMeasure) = new Margin(s"${topAndBottom.value} ${rightAndLeft.value}")
  def apply(all: CssMeasure) = new Margin(s"${all.value}")
  def apply(value: String) = new Margin(value)
}

class MarginLeft(val value: String) extends CssDeclaration {
  val property = MarginLeft.property
}

object MarginLeft extends AutoInheritX[MarginLeft] {
  val property = "margin-left"
  def apply(value: String) = new MarginLeft(value)
  def apply(measure: CssMeasure) = new MarginLeft(measure.value)
}

case class MarginLeftPx(x: Int) extends MarginLeft(s"${x}px")

class MarginRight(val value: String) extends CssDeclaration {
  val property = MarginRight.property
}

object MarginRight extends AutoInheritX[MarginRight] {
  val property = "margin-right"
  def apply(value: String) = new MarginRight(value)
  def apply(measure: CssMeasure) = new MarginRight(measure.value)
}

case class MarginRightPx(x: Int) extends MarginRight(s"${x}px")

class MarginTop(val value: String) extends CssDeclaration {
  val property = MarginTop.property
}

object MarginTop extends AutoInheritX[MarginTop] {
  val property = "margin-top"
  def apply(value: String) = new MarginTop(value)
  def apply(measure: CssMeasure) = new MarginTop(measure.value)
}

case class MarginTopPx(x: Int) extends MarginTop(s"${x}px")

class MarginBottom(val value: String) extends CssDeclaration {
  val property = MarginBottom.property
}

object MarginBottom extends AutoInheritX[MarginBottom] {
  val property = "margin-bottom"
  def apply(value: String) = new MarginBottom(value)
  def apply(measure: CssMeasure) = new MarginBottom(measure.value)
}

case class MarginBottomPx(x: Int) extends MarginBottom(s"${x}px")

object MarginPx {
  def apply(top: Int, right: Int, bottom: Int, left: Int) = new Margin(s"${top}px ${right}px ${bottom}px ${left}px")
  def apply(top: Int, rightAndLeft: Int, bottom: Int) = new Margin(s"${top}px ${rightAndLeft}px ${bottom}px")
  def apply(topAndBottom: Int, rightAndLeft: Int) = new Margin(s"${topAndBottom}px ${rightAndLeft}px")
  def apply(all: Int) = new Margin(s"${all}px")
}

