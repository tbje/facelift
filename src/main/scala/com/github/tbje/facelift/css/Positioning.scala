package com.github.tbje.facelift.css

/**
 * Specifies the top position of a positioned element
 * Available from CSS version 2
 */
case class Top(top: String) extends CssDeclaration {
  val property = Top.property
  val value = top
}

object Top extends AutoInheritX[Top] {
  val property = "top"
  def apply(m: CssMeasure) = new Top(m.value)
}

/**
 * Specifies the bottom position of a positioned element
 *  Available from CSS version 2
 */
case class Bottom(bottom: String) extends CssDeclaration {
  val property = Bottom.property
  val value = bottom
}

object Bottom extends AutoInheritX[Bottom] {
  val property = "bottom"
  def apply(m: CssMeasure) = new Bottom(m.value)
}

/**
 * Specifies the left position of a positioned element
 *  Available from CSS version 2
 */
case class Left(left: String) extends CssDeclaration {
  val property = Left.property
  val value = left
}

object Left extends AutoInheritX[Left] {
  val property = "left"
  def apply(m: CssMeasure) = new Left(m.value)
}

/**
 * Specifies the right position of a positioned element
 *  Available from CSS version 2
 */
case class Right(right: String) extends CssDeclaration {
  val property = Right.property
  val value = right
}

object Right extends AutoInheritX[Right] {
  val property = "right"
  def apply(m: CssMeasure) = new Right(m.value)
}

/**
 * Clips an absolutely positioned element
 *  Available from CSS version 2
 */
case class Clip(clip: String) extends CssDeclaration {
  val property = Clip.property
  val value = clip
}

object Clip extends AutoInheritX[Clip] {
  val property = "clip"
  def RectPx(x: Int, width: Int, height: Int, y: Int) = Clip(s"rect($x px, $width px, $height px, $y px)")
  def Rect(x: CssMeasure, width: CssMeasure, height: CssMeasure, y: CssMeasure) = Clip(s"rect(${x.value}, ${width.value}, ${height.value}, ${y.value})")
}

/**
 * Specifies the type of cursor to be displayed
 *  Available from CSS version 2
 */
case class Cursor(cursor: String) extends CssDeclaration {
  val property = Cursor.property
  val value = cursor
}

object Cursor extends AutoInheritX[Cursor] {
  val property = "cursor"
  val Alias = Cursor("alias")
  val AllScroll = Cursor("all-scroll")
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
}

/**
 * Specifies what happens if content overflows an element's box
 *  Available from CSS version 2
 */
case class Overflow(overflow: String) extends CssDeclaration {
  val property = Overflow.property
  val value = overflow
}

object Overflow extends AutoInheritX[Overflow] {
  val property = "overflow"
  val Visible = Overflow("visible")
  val Hidden = Overflow("hidden")
  val Scroll = Overflow("scroll")
}

/**
 * Specifies the type of positioning method used for an element (static, relative, absolute or fixed)
 *  Available from CSS version 2
 */
case class Position(position: String) extends CssDeclaration {
  val property = Position.property
  val value = position
}

object Position extends InheritX[Position] {
  val property = "position"
  val Static = Position("static")
  val Absolute = Position("absolute")
  val Fixed = Position("fixed")
  val Relative = Position("relative")
}

/**
 * Specifies whether or not an element is visible
 *  Available from CSS version 2
 */
case class Visibility(visibility: String) extends CssDeclaration {
  val property = Visibility.property
  val value = visibility
}

object Visibility extends InheritX[Visibility] {
  val property = "visibility"
  val Visible = Visibility("visible")
  val Hidden = Visibility("hidden")
  val Collapse = Visibility("collapse")
}

/**
 * Sets the stack order of a positioned element
 *  Available from CSS version 2
 */
case class ZIndex(zIndex: String) extends CssDeclaration {
  val property = ZIndex.property
  val value = zIndex
}

object ZIndex extends AutoInheritX[ZIndex] {
  val property = "z-index"
  def apply(index: Int) = new ZIndex(index.toString)
}

class Float(val value: String) extends CssDeclaration {
  val property = Float.property
}
object Float extends InheritX[Float] {
  val property = "float"
  def apply(value: String) = new Float(value)
  val Left = new Float("left")
  val Right = new Float("right")
  val None = new Float("none")
}

class Clear(val value: String) extends CssDeclaration {
  val property = Clear.property
}

object Clear extends InheritX[Clear] {
  val property = "clear"
  def apply(value: String) = new Clear(value)
  val Right = new Clear("right")
  val Left = new Clear("left")
  val Both = new Clear("both")
  val None = new Clear("none")
  val Default = None
}

case class Display(value: String) extends CssDeclaration {
  val property = Display.property
}

object Display extends InheritX[Display] {
  val property = "display"
  val None = new Display("none") // The element will not be displayed at all
  val Box = new Display("box") // The element is displayed as a block-level flex container box
  val Block = new Display("block") // The element is displayed as a block-level element (like paragraphs and headers)
  val Flex = new Display("flex") // The element is displayed as a block-level flex container box
  val Inline = new Display("inline") // This is default. The element is displayed as an inline-level element (like span)
  val InlineBlock = new Display("inline-block") // The element is placed as an inline element (on the same line as adjacent content), but it behaves as a block element
  val InlineFlex = new Display("inline-flex") // The element is displayed as an inline-level flex container box
  val InlineTable = new Display("inline-table") // The element is displayed as an inline-level table
  val ListItem = new Display("list-item") // The element is displayed as a list-item, which means that it has a bullet in front of it
  val Table = new Display("table") // The element is displayed as a table
  val TableCaption = new Display("table-caption") // The element is displayed as a table caption
  val TableCell = new Display("table-cell") // The element is displayed as a table cell
  val TableColumn = new Display("table-column") // The element is displayed as a table column
  val TableColumnGroup = new Display("table-column-group") // The element is displayed as a table column group (like <colgroup>)
  val TableFooterGroup = new Display("table-footer-group") // The element is displayed as a table footer row group
  val TableHeaderGroup = new Display("table-header-group") // The element is displayed as a table header row group
  val TableRow = new Display("table-row") // The element is displayed as a table row
  val TableGroup = new Display("table-row-group") // The element is displayed as a table row group
}
