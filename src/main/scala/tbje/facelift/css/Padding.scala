package tbje.facelift.css

case class Padding(value: String) extends CssDeclaration {
  val property = "padding"
}

object Padding extends AutoInheritX[Padding] {
  def apply(top: CssMeasure, right: CssMeasure, bottom: CssMeasure, left: CssMeasure) = new Padding(s"${top.value} ${right.value} ${bottom.value} ${left.value}")
  def apply(top: CssMeasure, rightAndLeft: CssMeasure, bottom: CssMeasure) = new Padding(s"${top.value} ${rightAndLeft.value} ${bottom.value}")
  def apply(topAndBottom: CssMeasure, rightAndLeft: CssMeasure) = new Padding(s"${topAndBottom.value} ${rightAndLeft.value}")
  def apply(all: CssMeasure) = new Padding(s"${all.value}")
}

case class PaddingLeft(value: String) extends CssDeclaration {
  val property = "padding-left"
}

object PaddingLeft extends AutoInheritX[PaddingLeft] {
  def apply(measure: CssMeasure) = new PaddingLeft(measure.value)
}

case class PaddingRight(value: String) extends CssDeclaration {
  val property = "padding-right"
}

object PaddingRight extends AutoInheritX[PaddingRight] {
  def apply(measure: CssMeasure) = new PaddingRight(measure.value)
}

case class PaddingTop(value: String) extends CssDeclaration {
  val property = "padding-top"
}

object PaddingTop extends AutoInheritX[PaddingTop] {
  def apply(measure: CssMeasure) = new PaddingTop(measure.value)
}

case class PaddingBottom(value: String) extends CssDeclaration {
  val property = "padding-bottom"
}

object PaddingBottom extends AutoInheritX[PaddingBottom] {
  def apply(measure: CssMeasure) = new PaddingBottom(measure.value)
}
