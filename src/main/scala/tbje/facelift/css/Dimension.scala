package tbje.facelift.css

class Width(val value: String) extends CssDeclaration {
  val property = Width.property
}

object Width extends AutoInheritX[Width] with (String => Width) {
  val property = "width"
  def apply(value: String) = new Width(value)
  def apply(measure: CssMeasure) = new Width(measure.value)
}

case class WidthPx(px: Int) extends Width(s"${px}px")

case class WidthPct(percent: Int) extends Width(s"${percent}%")

class Height(val value: String) extends CssDeclaration {
  val property = Height.property
}

object Height extends AutoInheritX[Height]{
  val property = "height"
  def apply(value: String) = new Height(value)
  def apply(measure: CssMeasure) = new Height(measure.value)
}

case class HeightPx(px: Int) extends Height(s"${px}px")

case class HeightPct(percent: Int) extends Height(s"${percent}%")
