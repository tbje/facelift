package tbje.facelift.css

/**
 * Gives a hint for how to scale a replaced element if neither its width nor its height property is auto
 * Available from CSS version 3
 */
case class Fit(fit: String) extends CssDeclaration {
  val property = "fit"
  val value = fit
}

object Fit {
  // TODO: fit values
}

/**
 * Determines the alignment of the object inside the box
 * Available from CSS version 3
 */
case class FitPosition(fitPosition: String) extends CssDeclaration {
  val property = "fit-position"
  val value = fitPosition
}

object FitPosition {
  // TODO: fit-position values
}

/**
 * Specifies a rotation in the right or clockwise direction that a user agent applies to an image
 * Available from CSS version 3
 */
case class ImageOrientation(imageOrientation: String) extends CssDeclaration {
  val property = "image-orientation"
  val value = imageOrientation
}

object ImageOrientation {
  // TODO: image-orientation values
}

/**
 * Specifies a particular type of page where an element SHOULD be displayed
 * Available from CSS version 3
 */
case class Page(page: String) extends CssDeclaration {
  val property = "page"
  val value = page
}

object Page {
  // TODO: page values
}

/**
 * Specifies the size and orientation of the containing box for page content
 * Available from CSS version 3
 */
case class Size(size: String) extends CssDeclaration {
  val property = "size"
  val value = size
}

object Size {
  // TODO: size values
}

/**
 * Specifies the label of the bookmark
 * Available from CSS version 3
 */
case class BookmarkLabel(bookmarkLabel: String) extends CssDeclaration {
  val property = "bookmark-label"
  val value = bookmarkLabel
}

object BookmarkLabel {
  // TODO: bookmark-label values
}

/**
 * Specifies the level of the bookmark
 * Available from CSS version 3
 */
case class BookmarkLevel(bookmarkLevel: String) extends CssDeclaration {
  val property = "bookmark-level"
  val value = bookmarkLevel
}

object BookmarkLevel {
  // TODO: bookmark-level values
}

/**
 * Specifies the target of the bookmark link
 * Available from CSS version 3
 */
case class BookmarkTarget(bookmarkTarget: String) extends CssDeclaration {
  val property = "bookmark-target"
  val value = bookmarkTarget
}

object BookmarkTarget {
  // TODO: bookmark-target values
}

/**
 * Pushes floated elements in the opposite direction of the where they have been floated with float
 * Available from CSS version 3
 */
case class FloatOffset(floatOffset: String) extends CssDeclaration {
  val property = "float-offset"
  val value = floatOffset
}

object FloatOffset {
  // TODO: float-offset values
}

/**
 * Specifies the minimum number of characters in a hyphenated word after the hyphenation character
 * Available from CSS version 3
 */
case class HyphenateAfter(hyphenateAfter: String) extends CssDeclaration {
  val property = "hyphenate-after"
  val value = hyphenateAfter
}

object HyphenateAfter {
  // TODO: hyphenate-after values
}

/**
 * Specifies the minimum number of characters in a hyphenated word before the hyphenation character
 * Available from CSS version 3
 */
case class HyphenateBefore(hyphenateBefore: String) extends CssDeclaration {
  val property = "hyphenate-before"
  val value = hyphenateBefore
}

object HyphenateBefore {
  // TODO: hyphenate-before values
}

/**
 * Specifies a string that is shown when a hyphenate-break occurs
 * Available from CSS version 3
 */
case class HyphenateCharacter(hyphenateCharacter: String) extends CssDeclaration {
  val property = "hyphenate-character"
  val value = hyphenateCharacter
}

object HyphenateCharacter {
  // TODO: hyphenate-character values
}

/**
 * Indicates the maximum number of successive hyphenated lines in an element
 * Available from CSS version 3
 */
case class HyphenateLines(hyphenateLines: String) extends CssDeclaration {
  val property = "hyphenate-lines"
  val value = hyphenateLines
}

object HyphenateLines {
  // TODO: hyphenate-lines values
}

/**
 * Specifies a comma-separated list of external resources that can help the browser determine hyphenation points
 * Available from CSS version 3
 */
case class HyphenateResource(hyphenateResource: String) extends CssDeclaration {
  val property = "hyphenate-resource"
  val value = hyphenateResource
}

object HyphenateResource {
  // TODO: hyphenate-resource values
}

/**
 * Sets how to split words to improve the layout of paragraphs
 * Available from CSS version 3
 */
case class Hyphens(hyphens: String) extends CssDeclaration {
  val property = "hyphens"
  val value = hyphens
}

object Hyphens {
  // TODO: hyphens values
}

/**
 * Specifies the correct resolution of images
 * Available from CSS version 3
 */
case class ImageResolution(imageResolution: String) extends CssDeclaration {
  val property = "image-resolution"
  val value = imageResolution
}

object ImageResolution {
  // TODO: image-resolution values
}

/**
 * Adds crop and/or cross marks to the document
 * Available from CSS version 3
 */
case class Marks(marks: String) extends CssDeclaration {
  val property = "marks"
  val value = marks
}

object Marks {
  // TODO: marks values
}

/**
 * No description
 * Available from CSS version 3
 */
case class StringSet(stringSet: String) extends CssDeclaration {
  val property = "string-set"
  val value = stringSet
}

object StringSet {
  // TODO: string-set values
}

/**
 * Sets the maximum height of an element
 * Available from CSS version 2
 */
case class MaxHeight(maxHeight: String) extends CssDeclaration {
  val property = "max-height"
  val value = maxHeight
}

object MaxHeight {
  // TODO: max-height values
}

/**
 * Sets the maximum width of an element
 * Available from CSS version 2
 */
case class MaxWidth(maxWidth: String) extends CssDeclaration {
  val property = "max-width"
  val value = maxWidth
}

object MaxWidth {
  // TODO: max-width values
}

/**
 * Sets the minimum height of an element
 * Available from CSS version 2
 */
case class MinHeight(minHeight: String) extends CssDeclaration {
  val property = "min-height"
  val value = minHeight
}

object MinHeight {
  // TODO: min-height values
}

/**
 * Sets the minimum width of an element
 * Available from CSS version 2
 */
case class MinWidth(minWidth: String) extends CssDeclaration {
  val property = "min-width"
  val value = minWidth
}

object MinWidth {
  // TODO: min-width values
}
