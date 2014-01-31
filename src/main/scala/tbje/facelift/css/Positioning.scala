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
  def apply(m: CssMeasure) = new Top(m.value)
  val Auto = Top("auto")
  val Inherit = Top("inherit")
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
  def apply(m: CssMeasure) = new Bottom(m.value)
  val Auto = Bottom("auto")
  val Inherit = Bottom("inherit")
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
  def apply(m: CssMeasure) = new Left(m.value)
  val Auto = Left("auto")
  val Inherit = Left("inherit")
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
  def apply(m: CssMeasure) = new Right(m.value)
  val Auto = Right("auto")
  val Inherit = Right("inherit")
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
  val Auto = Clip("auto")
  val Inherit = Clip("inherit")
  def RectPx(x: Int, width: Int, height: Int, y: Int) = Clip(s"rect($x px, $width px, $height px, $y px)")
  def Rect(x: CssMeasure, width: CssMeasure, height: CssMeasure, y: CssMeasure) = Clip(s"rect(${x.value}, ${width.value}, ${height.value}, ${y.value})")
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
  val Alias = Cursor("alias")
  val AllScroll = Cursor("all-scroll")
  val Auto = Cursor("auto")
  val Cell = Cursor("cell")
  val ContextMenu = Cursor("context-menu")
  val ColResize = Cursor("col-resize")
  val Copy = Cursor("copy")
  val Crosshair = Cursor("crosshair")
  val Default = Cursor("default")
  val EResize = Cursor("e-resize")
  val EwResize = Cursor("ew-resize")
  val Help = Cursor("help")
  val Move = Cursor("move")
  val NResize = Cursor("n-resize")
  val NeResize = Cursor("ne-resize")
  val NeswResize = Cursor("nesw-resize")
  val NsResize = Cursor("ns-resize")
  val NwResize = Cursor("nw-resize")
  val NwseResize = Cursor("nwse-resize")
  val NoDrop = Cursor("no-drop")
  val None = Cursor("none")
  val NotAllowed = Cursor("not-allowed")
  val Pointer = Cursor("pointer")
  val Progress = Cursor("progress")
  val RowResize = Cursor("row-resize")
  val SResize = Cursor("s-resize")
  val SeResize = Cursor("se-resize")
  val SwResize = Cursor("sw-resize")
  val Text = Cursor("text")
  val Url = Cursor("URL")
  val VerticalText = Cursor("vertical-text")
  val WResize = Cursor("w-resize")
  val Wait = Cursor("wait")
  val ZoomIn = Cursor("zoom-in")
  val ZoomOut = Cursor("zoom-out")
  val Inherit = Cursor("inherit")
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
  val Visible = Overflow("visible")
  val Hidden = Overflow("hidden")
  val Scroll = Overflow("scroll")
  val Auto = Overflow("auto")
  val Inherit = Overflow("inherit")
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
  val Static = Position("static")
  val Absolute = Position("absolute")
  val Fixed = Position("fixed")
  val Relative = Position("relative")
  val Inherit = Position("inherit")
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
  val Visible = Visibility("visible")
  val Hidden = Visibility("hidden")
  val Collapse = Visibility("collapse")
  val Inherit = Visibility("inherit")
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
  def apply(index: Int) = new ZIndex(index.toString)
  val Auto = ZIndex("auto")
  val Inherit = ZIndex("inherit")
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

