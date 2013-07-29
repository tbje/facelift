package tbje.facelift.css

class Padding(val value: String) extends CssDeclaration {
  val property = "padding"
}

object Padding {
  def apply(value: String) = new Padding(value)
  def apply(top: CssMeasure, right: CssMeasure, bottom: CssMeasure, left: CssMeasure) = new Padding(s"${top.value} ${right.value} ${bottom.value} ${left.value}")
  def apply(top: CssMeasure, rightAndLeft: CssMeasure, bottom: CssMeasure) = new Padding(s"${top.value} ${rightAndLeft.value} ${bottom.value}")
  def apply(topAndBottom: CssMeasure, rightAndLeft: CssMeasure) = new Padding(s"${topAndBottom.value} ${rightAndLeft.value}")
  def apply(all: CssMeasure) = new Padding(s"${all.value}")
}

class PaddingLeft(val value: String) extends CssDeclaration {
  val property = "padding-left"
}

object PaddingLeft {
  def apply(value: String) = new PaddingLeft(value)
  def apply(measure: CssMeasure) = new PaddingLeft(measure.value)
}

case class PaddingLeftPx(x: Int) extends PaddingLeft(s"${x}px")

class PaddingRight(val value: String) extends CssDeclaration {
  val property = "padding-right"
}

object PaddingRight {
  def apply(value: String) = new PaddingRight(value)
  def apply(measure: CssMeasure) = new PaddingRight(measure.value)
}

case class PaddingRightPx(x: Int) extends PaddingRight(s"${x}px")

class PaddingTop(val value: String) extends CssDeclaration {
  val property = "padding-top"
}

object PaddingTop {
  def apply(value: String) = new PaddingTop(value)
  def apply(measure: CssMeasure) = new PaddingTop(measure.value)
}

case class PaddingTopPx(x: Int) extends PaddingTop(s"${x}px")

class PaddingBottom(val value: String) extends CssDeclaration {
  val property = "padding-bottom"
}

object PaddingBottom {
  def apply(value: String) = new PaddingBottom(value)
  def apply(measure: CssMeasure) = new PaddingBottom(measure.value)
}

case class PaddingBottomPx(x: Int) extends PaddingBottom(s"${x}px")

object PaddingPx {
  def apply(top: Int, right: Int, bottom: Int, left: Int) = new Padding(s"${top}px ${right}px ${bottom}px ${left}px")
  def apply(top: Int, rightAndLeft: Int, bottom: Int) = new Padding(s"${top}px ${rightAndLeft}px ${bottom}px")
  def apply(topAndBottom: Int, rightAndLeft: Int) = new Padding(s"${topAndBottom}px ${rightAndLeft}px")
  def apply(all: Int) = new Padding(s"${all}px")
}
