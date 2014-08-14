package com.github.tbje.facelift.html

import scala.xml._
import com.github.tbje.facelift.imports._
import org.scalatest.WordSpec
import org.scalatest.Matchers

class XmlInterpolateSpec extends WordSpec with Matchers {

  "Combining text and xml elements inside a xml interpolation" should {
    val link = A(Href("link"))
    "provide a NodeSeq with each element separated" in {
      P(xml"I'm a text and this is a $link. More...") shouldEqual
        P(Text("I'm a text and this is a ") ++ link ++ Text(". More..."))
      P(xml"I'm a text and this is a $link. More...").toString shouldEqual
        """<p>I'm a text and this is a <a href="link"></a>. More...</p>"""
      xml"I'm a text and this is a $link. More...".size shouldEqual 3
    }
    "behave better than regular string interpolation" in {
      P(s"I'm a text and this is a $link. More...") should not equal(
        """<p>I'm a text and this is a <a href="link"></a>. More...</p>""")
    }
  }
}
