package tbje.facelift

package object css {
  implicit def intToUnit(x: Int) = new css.ToUnitOps(x)
  implicit def doublToUnit(x: Double) = new css.ToUnitOps(x)
}

package css {

  import tbje.facelift.css.CssSelector.{ A, Pseudo }
  object Auto extends CssMeasure("auto")
  object Inherit extends CssMeasure("inherit")

  trait AutoInheritX[T] extends AutoX[T] with InheritX[T]

  trait AutoX[T] extends (String => T) {
    val Auto = apply("auto")
  }

  trait InheritX[T] extends (String => T) {
    val Inherit = apply("inherit")
  }

  case class CssMeasure(value: String)

  class ToUnitOps[T](x: T) {
    def px = CssMeasure(s"${x}px")
    def pct = CssMeasure(s"${x}%")
    def em = CssMeasure(s"${x}em")
    def in = CssMeasure(s"${x}in")
    def cm = CssMeasure(s"${x}cm")
    def mm = CssMeasure(s"${x}mm")
    def ex = CssMeasure(s"${x}ex")
    def pt = CssMeasure(s"${x}pt")
    val % = pct
  }

  abstract class CssElement {
    def selectors: Seq[CssSelector]
    def declarations: Seq[CssDeclaration]
    def children = Seq[CssElement]()
    def addParents(parentSelectors: Seq[CssSelector], parentDeclarations: Seq[CssDeclaration]): CssElement
    def removeParentForPseudo(selectors: Seq[CssSelector]) = {
      val pseudos = selectors.collect { case x: Pseudo => x }
      pseudos.foldLeft(selectors) { (sel, pseudo) =>
        sel.collect { case x if x != pseudo.parent => x }
      }
    }
    override val toString: String = {
      val elements = (if (declarations.isEmpty) Seq() else {
        Seq(s"""|${removeParentForPseudo(selectors) mkString " "} {
  		|  ${declarations.mkString("", ";\n  ", ";")}
  		|}
  		|""".stripMargin)
      }) ++ children.map(_.toString)
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
