package tbje.facelift.css

case class Display(value: String) extends CssDeclaration {
  override def toString = s"display: $value"
}

object Display {
  object None extends Display("none") // The element will not be displayed at all
  object Box extends Display("box") // The element is displayed as a block-level flex container box
  object Block extends Display("block") // The element is displayed as a block-level element (like paragraphs and headers)
  object Flex extends Display("flex") // The element is displayed as a block-level flex container box
  object Inline extends Display("inline") // This is default. The element is displayed as an inline-level element (like span)
  object InlineBlock extends Display("inline-block") // The element is placed as an inline element (on the same line as adjacent content), but it behaves as a block element
  object InlineFlex extends Display("inline-flex") // The element is displayed as an inline-level flex container box
  object InlineTable extends Display("inline-table") // The element is displayed as an inline-level table
  object ListItem extends Display("list-item") // The element is displayed as a list-item, which means that it has a bullet in front of it
  object Table extends Display("table") // The element is displayed as a table
  object TableCaption extends Display("table-caption") // The element is displayed as a table caption
  object TableCell extends Display("table-cell") // The element is displayed as a table cell
  object TableColumn extends Display("table-column") // The element is displayed as a table column
  object TableColumnGroup extends Display("table-column-group") // The element is displayed as a table column group (like <colgroup>)
  object TableFooterGroup extends Display("table-footer-group") // The element is displayed as a table footer row group
  object TableHeaderGroup extends Display("table-header-group") // The element is displayed as a table header row group
  object TableRow extends Display("table-row") // The element is displayed as a table row
  object TableGroup extends Display("table-row-group") // The element is displayed as a table row group
  object Inherit extends Display("inherit") // The value of the display property will be inherited from the parent element
}
