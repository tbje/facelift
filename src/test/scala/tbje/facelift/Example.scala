package tbje.facelift

class Example {

  import Html._
  import css._

  object FirstPage {
    val titleId = Id("title")
    val titleClass = Class("wide", "cool")
    val titleStyle = Style(Color.Green, MarginPx(45, 20, 10, 10), 'paddingLeft -> "10px")
    val html = <html><body>{ <h1></h1> % titleId % titleClass % titleStyle } </body></html>
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
        Color.Chartreuse,
        PaddingPx(30),
        TextAlign.Center,
        FontSizePx(18),
        FontFamily.websafe.serif.Georgia,
        BackgroundColor("#F5F5F5"))
    val css =
      CssElement(H1, Class("tst"), A)(
        Color.Green,
        MarginPx(10, 20, 10, 20),
        MarginLeft(Auto),
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