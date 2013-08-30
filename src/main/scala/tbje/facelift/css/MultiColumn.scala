package tbje.facelift.css

/**
 * Specifies the number of columns an element should be divided into
 * Available from CSS version 3
 */
case class ColumnCount(columnCount: String) extends CssDeclaration {
  val property = "column-count"
  val value = columnCount
}

object ColumnCount {
  // TODO: column-count values
}

/**
 * Specifies how to fill columns
 * Available from CSS version 3
 */
case class ColumnFill(columnFill: String) extends CssDeclaration {
  val property = "column-fill"
  val value = columnFill
}

object ColumnFill {
  // TODO: column-fill values
}

/**
 * Specifies the gap between the columns
 * Available from CSS version 3
 */
case class ColumnGap(columnGap: String) extends CssDeclaration {
  val property = "column-gap"
  val value = columnGap
}

object ColumnGap {
  // TODO: column-gap values
}

/**
 * A shorthand property for setting all the column-rule-* properties
 * Available from CSS version 3
 */
case class ColumnRule(columnRule: String) extends CssDeclaration {
  val property = "column-rule"
  val value = columnRule
}

object ColumnRule {
  // TODO: column-rule values
}

/**
 * Specifies the color of the rule between columns
 * Available from CSS version 3
 */
case class ColumnRuleColor(columnRuleColor: String) extends CssDeclaration {
  val property = "column-rule-color"
  val value = columnRuleColor
}

object ColumnRuleColor {
  // TODO: column-rule-color values
}

/**
 * Specifies the style of the rule between columns
 * Available from CSS version 3
 */
case class ColumnRuleStyle(columnRuleStyle: String) extends CssDeclaration {
  val property = "column-rule-style"
  val value = columnRuleStyle
}

object ColumnRuleStyle {
  // TODO: column-rule-style values
}

/**
 * Specifies the width of the rule between columns
 * Available from CSS version 3
 */
case class ColumnRuleWidth(columnRuleWidth: String) extends CssDeclaration {
  val property = "column-rule-width"
  val value = columnRuleWidth
}

object ColumnRuleWidth {
  // TODO: column-rule-width values
}

/**
 * Specifies how many columns an element should span across
 * Available from CSS version 3
 */
case class ColumnSpan(columnSpan: String) extends CssDeclaration {
  val property = "column-span"
  val value = columnSpan
}

object ColumnSpan {
  // TODO: column-span values
}

/**
 * Specifies the width of the columns
 * Available from CSS version 3
 */
case class ColumnWidth(columnWidth: String) extends CssDeclaration {
  val property = "column-width"
  val value = columnWidth
}

object ColumnWidth {
  // TODO: column-width values
}

/**
 * A shorthand property for setting column-width and column-count
 * Available from CSS version 3
 */
case class Columns(columns: String) extends CssDeclaration {
  val property = "columns"
  val value = columns
}

object Columns {
  // TODO: columns values
}
