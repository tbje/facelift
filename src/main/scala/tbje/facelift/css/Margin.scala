package tbje.facelift.css

case class Margin(value: String) extends CssDeclaration {
  val property = Margin.property
}

object Margin extends AutoInheritX[Margin] {
  val property = "margin"
  def apply(top: CssMeasure, right: CssMeasure, bottom: CssMeasure, left: CssMeasure) = new Margin(s"${top.value} ${right.value} ${bottom.value} ${left.value}")
  def apply(top: CssMeasure, rightAndLeft: CssMeasure, bottom: CssMeasure) = new Margin(s"${top.value} ${rightAndLeft.value} ${bottom.value}")
  def apply(topAndBottom: CssMeasure, rightAndLeft: CssMeasure) = new Margin(s"${topAndBottom.value} ${rightAndLeft.value}")
  def apply(all: CssMeasure) = new Margin(s"${all.value}")
}

object MarginLeft extends AutoInheritX[MarginLeft] {
  val property = "margin-left"
  def apply(measure: CssMeasure) = new MarginLeft(measure.value)
}

case class MarginLeft(value: String) extends CssDeclaration {
  val property = MarginLeft.property
}

case class MarginRight(value: String) extends CssDeclaration {
  val property = MarginRight.property
}

object MarginRight extends AutoInheritX[MarginRight] {
  val property = "margin-right"
  def apply(measure: CssMeasure) = new MarginRight(measure.value)
}

case class MarginTop(value: String) extends CssDeclaration {
  val property = MarginTop.property
}

object MarginTop extends AutoInheritX[MarginTop] {
  val property = "margin-top"
  def apply(measure: CssMeasure) = new MarginTop(measure.value)
}

case class MarginBottom(value: String) extends CssDeclaration {
  val property = MarginBottom.property
}

object MarginBottom extends AutoInheritX[MarginBottom] {
  val property = "margin-bottom"
  def apply(measure: CssMeasure) = new MarginBottom(measure.value)
}

