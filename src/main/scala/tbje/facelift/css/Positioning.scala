package tbje.facelift.css

/**
 * Specifies the top position of a positioned element
 * Available from CSS version 2
 */
case class Top(top: String) extends CssDeclaration {
  val property = "top"
  val value = top
}

object Top {
  // TODO: top values
}

/**
 * Specifies the bottom position of a positioned element
 *  Available from CSS version 2
 */
case class Bottom(bottom: String) extends CssDeclaration {
  val property = "bottom"
  val value = bottom
}

object Bottom {
  // TODO: bottom values
}

/**
 * Specifies the left position of a positioned element
 *  Available from CSS version 2
 */
case class Left(left: String) extends CssDeclaration {
  val property = "left"
  val value = left
}

object Left {
  // TODO: left values
}

/**
 * Specifies the right position of a positioned element
 *  Available from CSS version 2
 */
case class Right(right: String) extends CssDeclaration {
  val property = "right"
  val value = right
}

object Right {
  // TODO: right values
}

/**
 * Clips an absolutely positioned element
 *  Available from CSS version 2
 */
case class Clip(clip: String) extends CssDeclaration {
  val property = "clip"
  val value = clip
}

object Clip {
  // TODO: clip values
}

/**
 * Specifies the type of cursor to be displayed
 *  Available from CSS version 2
 */
case class Cursor(cursor: String) extends CssDeclaration {
  val property = "cursor"
  val value = cursor
}

object Cursor {
  // TODO: cursor values
}

/**
 * Specifies what happens if content overflows an element's box
 *  Available from CSS version 2
 */
case class Overflow(overflow: String) extends CssDeclaration {
  val property = "overflow"
  val value = overflow
}

object Overflow {
  // TODO: overflow values
}

/**
 * Specifies the type of positioning method used for an element (static, relative, absolute or fixed)
 *  Available from CSS version 2
 */
case class Position(position: String) extends CssDeclaration {
  val property = "position"
  val value = position
}

object Position {
  // TODO: position values
}

/**
 * Specifies whether or not an element is visible
 *  Available from CSS version 2
 */
case class Visibility(visibility: String) extends CssDeclaration {
  val property = "visibility"
  val value = visibility
}

object Visibility {
  // TODO: visibility values
}

/**
 * Sets the stack order of a positioned element
 *  Available from CSS version 2
 */
case class ZIndex(zIndex: String) extends CssDeclaration {
  val property = "z-index"
  val value = zIndex
}

object ZIndex {
  // TODO: z-index values
}

class Float(val value: String) extends CssDeclaration {
  val property = "float"
}
object Float {
  def apply(value: String) = new Float(value)
  object Left extends Float("left")
  object Right extends Float("right")
  object None extends Float("none")
  object Inherit extends Float("inherit")
}

class Clear(val value: String) extends CssDeclaration {
  val property = "clear"
}

object Clear {
  def apply(value: String) = new Clear(value)
  object Right extends Clear("right")
  object Left extends Clear("left")
  object Both extends Clear("both")
  object None extends Clear("none")
  object Inherit extends Clear("inherit")
  val Default = None
}

case class Display(value: String) extends CssDeclaration {
  val property = "display"
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

