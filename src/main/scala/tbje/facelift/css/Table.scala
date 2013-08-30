package tbje.facelift.css

/**
 * Specifies whether or not table borders should be collapsed
 * Available from CSS version 2
 */
case class BorderCollapse(borderCollapse: String) extends CssDeclaration {
  val property = "border-collapse"
  val value = borderCollapse
}

object BorderCollapse {
  // TODO: border-collapse values
}

/**
 * Specifies the distance between the borders of adjacent cells
 * Available from CSS version 2
 */
case class BorderSpacing(borderSpacing: String) extends CssDeclaration {
  val property = "border-spacing"
  val value = borderSpacing
}

object BorderSpacing {
  // TODO: border-spacing values
}

/**
 * Specifies the placement of a table caption
 * Available from CSS version 2
 */
case class CaptionSide(captionSide: String) extends CssDeclaration {
  val property = "caption-side"
  val value = captionSide
}

object CaptionSide {
  // TODO: caption-side values
}

/**
 * Specifies whether or not to display borders and background on empty cells in a table
 * Available from CSS version 2
 */
case class EmptyCells(emptyCells: String) extends CssDeclaration {
  val property = "empty-cells"
  val value = emptyCells
}

object EmptyCells {
  // TODO: empty-cells values
}

/**
 * Sets the layout algorithm to be used for a table
 * Available from CSS version 2
 */
case class TableLayout(tableLayout: String) extends CssDeclaration {
  val property = "table-layout"
  val value = tableLayout
}

object TableLayout {
  // TODO: table-layout values
}
