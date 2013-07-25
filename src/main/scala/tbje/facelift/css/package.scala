package tbje.facelift

package css {

  abstract class CssDeclaration {
    def property: String
    def value: String
    override def toString = s"$property: $value"
  }

  object CssDeclaration {
    implicit def tuple2ToCSSAttr(t: (String, String)) = new CssDeclaration {
      val (property, value) = t
    }
    implicit def tuple2ToCSSAttr2(t: (Symbol, String)) = new CssDeclaration {
      val (camelCasedProperty, value) = t
      val property = camelCasedProperty.name.foldLeft("") { (a, b) => if (b == b.toUpper) s"$a-${b.toLower}" else s"$a$b" }
    }
  }

  abstract class CssElement {
    def selectors: Seq[CssSelector]
    def declarations: Seq[CssDeclaration]
    def children = Seq[CssElement]()
    def addParents(parentSelectors: Seq[CssSelector], parentDeclarations: Seq[CssDeclaration]): CssElement
    override val toString: String = {
      val elements = s"""|${selectors mkString " "} {
  		|  ${declarations.mkString("", ";\n  ", ";")}
  		|}
  		|""".stripMargin +: children.map(_.toString)
      elements mkString ("", "\n", "")
    }

  }

  object CssElement {
    def apply(elements: CssSelector*)(styles: CssDeclaration*) = new CssElementWithoutChildren(elements, styles)
  }

  case class CssElementWithoutChildren(selectors: Seq[CssSelector], declarations: Seq[CssDeclaration]) extends CssElement {
    def apply(children: CssElement*) = new CssElementWithChildren(selectors, declarations, children map (_.addParents(selectors, declarations)))
    def addParents(parentSelectors: Seq[CssSelector], parentDeclarations: Seq[CssDeclaration]): CssElement =
      copy(selectors = parentSelectors ++ selectors, declarations = declarations ++ parentDeclarations.filterNot(el => declarations.exists(_.property == el.property)))
  }

  case class CssElementWithChildren(selectors: Seq[CssSelector], declarations: Seq[CssDeclaration], override val children: Seq[CssElement], parentSelectors: Seq[CssSelector] = Seq(), parentDeclarations: Seq[CssDeclaration] = Seq()) extends CssElement {
    def addParents(parentSelectors: Seq[CssSelector], parentDeclarations: Seq[CssDeclaration]): CssElement =
      copy(selectors = parentSelectors ++ selectors, declarations = declarations ++ parentDeclarations.filterNot(el => declarations.exists(_.property == el.property)), children = children map (_.addParents(parentSelectors, parentDeclarations)))
  }

}