package tbje.facelift.css

class Width(val value: String) extends CssDeclaration {
  val property = "width"
}

object Width {
  object Auto extends Width("auto")
  object Inherit extends Width("inherit")
  def apply(value: String) = new Width(value)
}

case class WidthPx(px: Int) extends Width(s"${px}px")

case class WidthPct(percent: Int) extends Width(s"${percent}%")

class Height(val value: String) extends CssDeclaration {
  val property = "height"
}

object Height {
  object Auto extends Width("auto")
  object Inherit extends Width("inherit")
  def apply(value: String) = new Height(value)
}

case class HeightPx(px: Int) extends Height(s"${px}px")

case class HeightPct(percent: Int) extends Height(s"${percent}%")
