package com.github.tbje.facelift

import scala.xml._

package html {
  class XmlBase(label: String) extends Elem(null, label, scala.xml.Null, TopScope, false, Seq.empty: _*) {
    def combineAttrs(attrs: Seq[Attribute]) =
      attrs.foldLeft(Null: MetaData)((x, y) => x.append(y).asInstanceOf[Attribute])
    def apply(content: String, attrs: Attribute*): Elem = apply(Text(content), attrs: _*)
    def apply(xml: NodeSeq, attrs: Attribute*): Elem = copy(attributes = combineAttrs(attrs), child = xml)
    def apply(attrs: Attribute*): Elem = copy(attributes = combineAttrs(attrs), child = NodeSeq.Empty)
  }

  class ElementOps(elem: Elem) {
    def apply(xml: NodeSeq) = elem.copy(child = elem.child ++ xml)
    def apply(txt: String) = elem.copy(child = elem.child ++ Text(txt))
  }

  object ElementOps {
    implicit def augmentElemToElementOps(elem: Elem) = new ElementOps(elem)
  }

  object Doctype extends XmlBase("!DOCTYPE") // Defines the document type
  object A extends XmlBase("a") // Defines a hyperlink
  object Abbr extends XmlBase("abbr") // Defines an abbreviation
  object Acronym extends XmlBase("acronym") // Not supported in HTML5. Defines an acronym
  object Address extends XmlBase("address") // Defines contact information for the author/owner of a document
  object Applet extends XmlBase("applet") // Not supported in HTML5. Deprecated in HTML 4.01. Defines an embedded applet
  object Area extends XmlBase("area") // Defines an area inside an image-map
  object Article extends XmlBase("article") // New - Defines an article
  object Aside extends XmlBase("aside") // New - Defines content aside from the page content
  object Audio extends XmlBase("audio") // New - Defines sound content
  object B extends XmlBase("b") // Defines bold text
  object Base extends XmlBase("base") // Specifies the base URL/target for all relative URLs in a document
  object Basefont extends XmlBase("basefont") // Not supported in HTML5. Deprecated in HTML 4.01. Specifies a default color, size, and font for all text in a document
  object Bdi extends XmlBase("bdi") // New - Isolates a part of text that might be formatted in a different direction from other text outside it
  object Bdo extends XmlBase("bdo") // Overrides the current text direction
  object Big extends XmlBase("big") // Not supported in HTML5. Defines big text
  object Blockquote extends XmlBase("blockquote") // Defines a section that is quoted from another source
  object Body extends XmlBase("body") // Defines the document's body
  object Br extends XmlBase("br") // Defines a single line break
  object Button extends XmlBase("button") // Defines a clickable button
  object Canvas extends XmlBase("canvas") // New - Used to draw graphics, on the fly, via scripting (usually JavaScript)
  object Caption extends XmlBase("caption") // Defines a table caption
  object Center extends XmlBase("center") // Not supported in HTML5. Deprecated in HTML 4.01. Defines centered text
  object Cite extends XmlBase("cite") // Defines the title of a work
  object Code extends XmlBase("code") // Defines a piece of computer code
  object Col extends XmlBase("col") // Specifies column properties for each column within a <colgroup> element
  object Colgroup extends XmlBase("colgroup") // Specifies a group of one or more columns in a table for formatting
  object Command extends XmlBase("command") // New - Defines a command button that a user can invoke
  object Datalist extends XmlBase("datalist") // New - Specifies a list of pre-defined options for input controls
  object Dd extends XmlBase("dd") // Defines a description/value of a term in a description list
  object Del extends XmlBase("del") // Defines text that has been deleted from a document
  object Details extends XmlBase("details") // New - Defines additional details that the user can view or hide
  object Dfn extends XmlBase("dfn") // Defines a definition term
  object Dialog extends XmlBase("dialog") // New - Defines a dialog box or window
  object Dir extends XmlBase("dir") // Not supported in HTML5. Deprecated in HTML 4.01. Defines a directory list
  object Div extends XmlBase("div") // Defines a section in a document
  object Dl extends XmlBase("dl") // Defines a description list
  object Dt extends XmlBase("dt") // Defines a term/name in a description list
  object Em extends XmlBase("em") // Defines emphasized text
  object Embed extends XmlBase("embed") // New - Defines a container for an external (non-HTML) application
  object Fieldset extends XmlBase("fieldset") // Groups related elements in a form
  object Figcaption extends XmlBase("figcaption") // New - Defines a caption for a <figure> element
  object Figure extends XmlBase("figure") // New - Specifies self-contained content
  object Font extends XmlBase("font") // Not supported in HTML5. Deprecated in HTML 4.01. Defines font, color, and size for text
  object Footer extends XmlBase("footer") // New - Defines a footer for a document or section
  object Form extends XmlBase("form") // Defines an HTML form for user input
  object Frame extends XmlBase("frame") // Not supported in HTML5. Defines a window (a frame) in a frameset
  object Frameset extends XmlBase("frameset") // Not supported in HTML5. Defines a set of frames
  object H1 extends XmlBase("h1") // Defines HTML headings
  object H2 extends XmlBase("h2") // Defines HTML headings
  object H3 extends XmlBase("h3") // Defines HTML headings
  object H4 extends XmlBase("h4") // Defines HTML headings
  object H5 extends XmlBase("h5") // Defines HTML headings
  object H6 extends XmlBase("h6") // Defines HTML headings
  object Head extends XmlBase("head") // Defines information about the document
  object Header extends XmlBase("header") // New - Defines a header for a document or section
  object Hr extends XmlBase("hr") //  Defines a thematic change in the content
  object Html extends XmlBase("html") // Defines the root of an HTML document
  object I extends XmlBase("i") // Defines a part of text in an alternate voice or mood
  object Iframe extends XmlBase("iframe") // Defines an inline frame
  object Img extends XmlBase("img") // Defines an image
  object Input extends XmlBase("input") // Defines an input control
  object Ins extends XmlBase("ins") // Defines a text that has been inserted into a document
  object Kbd extends XmlBase("kbd") // Defines keyboard input
  object Keygen extends XmlBase("keygen") // New - Defines a key-pair generator field (for forms)
  object Label extends XmlBase("label") // Defines a label for an <input> element
  object Legend extends XmlBase("legend") // Defines a caption for a <fieldset> element
  object Li extends XmlBase("li") // Defines a list item
  object Link extends XmlBase("link") // Defines the relationship between a document and an external resource (most used to link to style sheets)
  object Map extends XmlBase("map") // Defines a client-side image-map
  object Mark extends XmlBase("mark") // New - Defines marked/highlighted text
  object Menu extends XmlBase("menu") // Defines a list/menu of commands
  object Meta extends XmlBase("meta") // Defines metadata about an HTML document
  object Meter extends XmlBase("meter") // New - Defines a scalar measurement within a known range (a gauge)
  object Nav extends XmlBase("nav") // New - Defines navigation links
  object Noframes extends XmlBase("noframes") // Not supported in HTML5. Defines an alternate content for users that do not support frames
  object Noscript extends XmlBase("noscript") // Defines an alternate content for users that do not support client-side scripts
  object Object extends XmlBase("object") // Defines an embedded object
  object Ol extends XmlBase("ol") // Defines an ordered list
  object Optgroup extends XmlBase("optgroup") // Defines a group of related options in a drop-down list
  object Option extends XmlBase("option") // Defines an option in a drop-down list
  object Output extends XmlBase("output") // New - Defines the result of a calculation
  object P extends XmlBase("p") // Defines a paragraph
  object Param extends XmlBase("param") // Defines a parameter for an object
  object Pre extends XmlBase("pre") // Defines preformatted text
  object Progress extends XmlBase("progress") // New - Represents the progress of a task
  object Q extends XmlBase("q") // Defines a short quotation
  object Rp extends XmlBase("rp") // New - Defines what to show in browsers that do not support ruby annotations
  object Rt extends XmlBase("rt") // New - Defines an explanation/pronunciation of characters (for East Asian typography)
  object Ruby extends XmlBase("ruby") // New - Defines a ruby annotation (for East Asian typography)
  object S extends XmlBase("s") // Defines text that is no longer correct
  object Samp extends XmlBase("samp") // Defines sample output from a computer program
  object Script extends XmlBase("script") // Defines a client-side script
  object Section extends XmlBase("section") // New - Defines a section in a document
  object Select extends XmlBase("select") // Defines a drop-down list
  object Small extends XmlBase("small") // Defines smaller text
  object Source extends XmlBase("source") // New - Defines multiple media resources for media elements (<video> and <audio>)
  object Span extends XmlBase("span") // Defines a section in a document
  object Strike extends XmlBase("strike") // Not supported in HTML5. Deprecated in HTML 4.01. Defines strikethrough text
  object Strong extends XmlBase("strong") // Defines important text
  object Style extends XmlBase("style") // Defines style information for a document
  object Sub extends XmlBase("sub") // Defines subscripted text
  object Summary extends XmlBase("summary") // New - Defines a visible heading for a <details> element
  object Sup extends XmlBase("sup") // Defines superscripted text
  object Table extends XmlBase("table") // Defines a table
  object Tbody extends XmlBase("tbody") // Groups the body content in a table
  object Td extends XmlBase("td") // Defines a cell in a table
  object Textarea extends XmlBase("textarea") // Defines a multiline input control (text area)
  object Tfoot extends XmlBase("tfoot") // Groups the footer content in a table
  object Th extends XmlBase("th") // Defines a header cell in a table
  object Thead extends XmlBase("thead") // Groups the header content in a table
  object Time extends XmlBase("time") // New - Defines a date/time
  object Title extends XmlBase("title") // Defines a title for the document
  object Tr extends XmlBase("tr") // Defines a row in a table
  object Track extends XmlBase("track") // New - Defines text tracks for media elements (<video> and <audio>)
  object Tt extends XmlBase("tt") // Not supported in HTML5. Defines teletype text
  object U extends XmlBase("u") // Defines text that should be stylistically different from normal text
  object Ul extends XmlBase("ul") // Defines an unordered list
  object Var extends XmlBase("var") // Defines a variable
  object Video extends XmlBase("video") // New - Defines a video or movie
  object Wbr extends XmlBase("wbr") // New - Defines a possible line-break

}
