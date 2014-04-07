package tbje.facelift

import tbje.facelift.html.Glyphicon

class Example {

  import tbje.facelift.imports._

  object FirstPage {

    val titleId = Id("title")
    val titleClass = Class("cool")
    val titleStyle = Style(Color.Green, Margin(45 px, 20 px, 10 px, 10 px), 'paddingLeft -> "10px")
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
        Width(340.px),
        Height(30.px),
        Margin(30.px, Auto, 0.px),
        Color.hsla(260, 100, 100, 0),
        Padding(30 px),
        TextAlign.Center,
        FontSize(1.5 em),
        FontFamily.websafe.serif.Georgia,
        BackgroundColor.hex("#00F5F5"))
    val css =
      CssElement(H1, Class("tst"), A)(
        Width.Inherit,
        Color.Green,
        Margin(10.px, Auto, 10.px, 20.px),
        MarginLeft.Auto,
        "margin-left" -> "auto",
        'paddingLeft -> "10px",
        FontSize(1.3 em))(linkCss)
    val css2 =
      CssElement(H2, Class("tast"), A)(
        Color.Green,
        Margin(10.px, 20.px, 10.px, 20.px),
        'marginLeft -> "auto",
        "margin-left" -> "auto",
        'paddingLeft -> "10px",
        FontSize(1.3 em))(linkCss)

  }

}
