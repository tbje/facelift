Facelift
========
Facelift is an experiment in creating a DSL for CSS in Scala. Goals are discoverability, type safety and ease of use.

Writing Html:

    val titleId = Id("title")
    val titleClass = Class("cool")
    val titleStyle = Style(Color.Green, Margin(45 px, 20 px, 10 px, 10 px), 'paddingLeft -> "10px")

    val html1 =
      Html {
        Body(Style('backgroundColor -> "#F5F5F5")) {
          // Most bootstrap classes are built in, let's bind them to Bs
          import com.github.tbje.facelift.css.{ BootstrapClasses => Bs }
          // Calling apply multiple times will add children to the node
          H1(titleId, titleClass, titleStyle, 'funkyAttr -> "very-funky"){
            "Welcome to FaceLift" // you can pass a String
            }{B("my friend")} ++  // or another NodeSeq
            // Combine multiple styles easily using &
            Div(Bs.colMd4 & Bs.pullRight) { 
              // Access glyphs from Glyhicon in a typesafe manner
              Glyphicon.Cloud % Style(FontSize(1.6 em), LineHeight(20.px)) ++ 
              Span(Bs.h3, Style(MarginLeft(10.px)))("my title")
          }
        }
      }

Inline with Scala XML-litterals:

    val html3 = <html><body>{ <h1/> % titleId % titleClass % titleStyle } </body></html>

Please also have a look at the [examples](https://github.com/tbje/facelift/blob/master/src/test/scala/com/github/tbje/facelift/Example.scala).

In a CSS file:

    import CssSelector._
    val css2 =
      new CssElement(Id("link"))(
        'paddingLeft -> "20px",
        'boxShadow -> "auto",
        'boxShadow -> "0 2px 5px rgba(0,0,0,.3)",
        Width(340.px),
        Margin("30px auto 0"),
        Color.Chartreuse,
        Padding(30.px),
        TextAlign.Center,
        FontSize(1.2 em),
        FontFamily.websafe.serif.Georgia,
        BackgroundColor("#F5F5F5"))

Nesting:

    val linkCss =
      CssElement(Id("link"))(
        Width(140.px),
        Color.Blue)

    val wideCss =
      CssElement(Class("wide"))(
        Width(340.px))(linkCss)

    println(wideCss)

    .wide {
      width: 340px;
    }

    .wide #link {
      width: 140px;
      color: blue;
    }

Required imports:

    import com.github.tbje.facelift.imports._

In your project (SBT-settings):

    libraryDependencies ++= Seq(
        "com.github.tbje" %% "facelift" % "0.1"
    )

Build it locally:

    git clone git@github.com:tbje/facelift.git
    cd facelift
    sbt
    > + publishLocal  // + publish-local for sbt pre 0.13
