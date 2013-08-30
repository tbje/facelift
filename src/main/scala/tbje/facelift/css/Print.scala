package tbje.facelift.css

/**
 * Sets the minimum number of lines that must be left at the bottom of a page when a page break occurs inside an element
 * Available from CSS version 2
 */
case class Orphans(orphans: String) extends CssDeclaration {
  val property = "orphans"
  val value = orphans
}

object Orphans {
  // TODO: orphans values
}

/**
 * Sets the page-breaking behavior after an element
 * Available from CSS version 2
 */
case class PageBreakAfter(pageBreakAfter: String) extends CssDeclaration {
  val property = "page-break-after"
  val value = pageBreakAfter
}

object PageBreakAfter {
  // TODO: page-break-after values
}

/**
 * Sets the page-breaking behavior before an element
 * Available from CSS version 2
 */
case class PageBreakBefore(pageBreakBefore: String) extends CssDeclaration {
  val property = "page-break-before"
  val value = pageBreakBefore
}

object PageBreakBefore {
  // TODO: page-break-before values
}

/**
 * Sets the page-breaking behavior inside an element
 * Available from CSS version 2
 */
case class PageBreakInside(pageBreakInside: String) extends CssDeclaration {
  val property = "page-break-inside"
  val value = pageBreakInside
}

object PageBreakInside {
  // TODO: page-break-inside values
}

/**
 * Sets the minimum number of lines that must be left at the top of a page when a page break occurs inside an element
 * Available from CSS version 2
 */
case class Widows(widows: String) extends CssDeclaration {
  val property = "widows"
  val value = widows
}

object Widows {
  // TODO: widows values
}
