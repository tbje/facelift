package com.github.tbje.facelift
package attr

import org.scalatest.WordSpec
import org.scalatest.Matchers

import imports._
import css.{ CssElement, BootstrapClasses => Bs }

class ClassTest extends WordSpec with Matchers {
  "Class" should {
    val myClass = Class("test")(Color.Green, MarginBottom(2.px))
    "allow creaation of Css Class" in {
      val c: Class = myClass
      c.name should equal("test")
    }
    "allow creaation of CssElement" in {
      val d: CssElement = myClass
      d.toString should equal("""|.test {
                                 |  color: green;
                                 |  margin-bottom: 2px;
                                 |}
                                 |""".stripMargin)
    }
    "allow use directly in Html" in {
      P(myClass) should equal(<p class="test"></p>)
    }
    "allow concatenation of multiple elements" in {
      P(myClass & Bs.h1 & Class("mine")) should equal(<p class="test h1 mine"></p>)
    }
  }
}
