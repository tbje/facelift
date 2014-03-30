package tbje.facelift

import tbje.facelift.html.Glyphicon

class Example {

  import tbje.facelift.imports._

  object FirstPage {

    val titleId = Id("title")
    val titleClass = Class("cool")
    val titleStyle = Style(Color.Green, MarginPx(45, 20, 10, 10), 'paddingLeft -> "10px")
    val html1 = // Integrate attributes with standard scala xml
      <html><body>{ <h1></h1> % titleId % titleClass % titleStyle } </body></html>
    val html2 = // Html DSL, children then attributes style
      Html {
        Body {
          H1("Welcome to FaceLift", titleId, titleClass, titleStyle, 'test -> "hei")
        }
      }
    val html3 = // Html DSL, attributes first style
      Html {
        Body(Style('backgroundColor -> "#F5F5F5")) {
          H1(titleId, titleClass, titleStyle, 'funkyAttr -> "very-funky")("Welcome to FaceLift")(B("my friend")) ++ // Calling apply multiple times will concatenate children
            Glyphicon.Asterisk % Style(Color.Green)
        }
      }
  }

  object CssTest {
    import CssSelector._
    val linkCss =
      CssElement(Id("link"))(
        PaddingLeft(20 px),
        'boxShadow -> "auto",
        'boxShadow -> "0 2px 5px rgba(0,0,0,.3)",
        WidthPx(340),
        Height(30.px),
        Margin(30.px, Auto, 0.px),
        Color.hsla(260, 100, 100, 0),
        PaddingPx(30),
        TextAlign.Center,
        FontSizePx(18),
        FontFamily.websafe.serif.Georgia,
        BackgroundColor.hex("#00F5F5"))
    val css =
      CssElement(H1, Class("tst"), A)(
        Width.Inherit,
        Color.Green,
        MarginPx(10, 20, 10, 20),
        MarginLeft.Auto,
        "margin-left" -> "auto",
        'paddingLeft -> "10px",
        FontSizeEm(1.3))(linkCss)
    val css2 =
      CssElement(H2, Class("tast"), A)(
        Color.Green,
        MarginPx(10, 20, 10, 20),
        'marginLeft -> "auto",
        "margin-left" -> "auto",
        'paddingLeft -> "10px",
        FontSizeEm(1.3))(linkCss)

  }

}
