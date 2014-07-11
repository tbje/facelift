Facelift
========
Facelift is an experiment in creating a DSL for CSS in Scala. Goals are discoverability, type safety and ease of use.

Inline with Scala XML-litterals:

    val titleId = Id("title")
    val titleClass = Class("wide", "cool")
    val titleStyle = Style(Color.Green, MarginPx(45, 20, 10, 10), 'paddingLeft -> "10px")
    val html = <html><body>{ <h1/> % titleId % titleClass % titleStyle } </body></html>

Please also have a look at the [examples](https://github.com/tbje/facelift/blob/master/src/test/scala/tbje/facelift/Example.scala).

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

    import tbje.facelift.Html._
    import tbje.facelift.css._

Start using it:

    git clone git@github.com:tbje/facelift.git
    cd facelift
    sbt
    > + publishLocal  // + publish-local for sbt pre 0.13
    
In your project (SBT-settings):
    
    libraryDependencies ++= Seq(
        "tbje" %% "facelift" % "0.1-SNAPSHOT"
    )

Next steps:
-----------
1. Direct support for more css properties (you can always *'property -> "value"* or *"property" -> "value"* )
    * Contributions are welcome and I stubbed up missing properties and added TODO tasks.  
2. CSS file generator plugin for SBT
3. String interpolation Selector macro for CSS.
