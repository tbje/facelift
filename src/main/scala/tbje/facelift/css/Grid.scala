package tbje.facelift.css

/**
 * Specifies the width of each column in a grid
 * Available from CSS version 3
 */
case class GridColumns(gridColumns: String) extends CssDeclaration {
  val property = "grid-columns"
  val value = gridColumns
}

object GridColumns {
  // TODO: grid-columns values
}

/**
 * Specifies the height of each column in a grid
 * Available from CSS version 3
 */
case class GridRows(gridRows: String) extends CssDeclaration {
  val property = "grid-rows"
  val value = gridRows
}

object GridRows {
  // TODO: grid-rows values
}
