package tbje.facelift.css

abstract class CssSelector {
  def toString: String
}
object CssSelector {
  case class Id(id: String) extends CssSelector {
    override val toString = s"#$id"
  }
  case class Class(name: String) extends CssSelector {
    override val toString = s".$name"
  }
  object H1 extends CssSelector {
    override val toString = "h1"
  }
  object H2 extends CssSelector {
    override val toString = "h2"
  }
  object H3 extends CssSelector {
    override val toString = "h3"
  }
  trait Pseudo {
    def parent: CssSelector
  }
  trait PseudoA extends Pseudo {
    def parent = A
  }
  object A extends CssSelector {
    override val toString = "a"
    object Hover extends CssSelector with PseudoA {
      override val toString = "a:hover"
    }
    object Link extends CssSelector with PseudoA {
      override val toString = "a:link"
    }
    object Visited extends CssSelector with PseudoA {
      override val toString = "a:visited"
    }
    object Active extends CssSelector with PseudoA {
      override val toString = "a:active"
    }
  }
  object P extends CssSelector {
    override val toString = "p"
  }

}
