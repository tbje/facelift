package tbje.facelift.css

case class Width(value: String) extends CssDeclaration {
  val property = Width.property
}

object Width extends AutoInheritX[Width] with (String => Width) {
  val property = "width"
  def apply(measure: CssMeasure) = new Width(measure.value)
}


case class Height(value: String) extends CssDeclaration {
  val property = Height.property
}

object Height extends AutoInheritX[Height]{
  val property = "height"
  def apply(measure: CssMeasure) = new Height(measure.value)
}
