package tbje.facelift.css

// Sets all the background properties in one declaration
// From CSS version 1
case class Background(background: String) extends CssDeclaration {
  val property = "background"
  val value = background
}

// Sets whether a background image is fixed or scrolls with the rest of the page
// From CSS version 1
case class BackgroundAttachment(backgroundAttachment: String) extends CssDeclaration {
  val property = "background-attachment"
  val value = backgroundAttachment
}

// Sets the background color of an element
// From CSS version 1
case class BackgroundColor(backgroundColor: String) extends CssDeclaration {
  val property = "background-color"
  val value = backgroundColor
}

// Sets the background image for an element
// From CSS version 1
case class BackgroundImage(backgroundImage: String) extends CssDeclaration {
  val property = "background-image"
  val value = backgroundImage
}

// Sets the starting position of a background image
// From CSS version 1
case class BackgroundPosition(backgroundPosition: String) extends CssDeclaration {
  val property = "background-position"
  val value = backgroundPosition
}

// Sets how a background image will be repeated
// From CSS version 1
case class BackgroundRepeat(backgroundRepeat: String) extends CssDeclaration {
  val property = "background-repeat"
  val value = backgroundRepeat
}

// Specifies the painting area of the background
// From CSS version 3
case class BackgroundClip(backgroundClip: String) extends CssDeclaration {
  val property = "background-clip"
  val value = backgroundClip
}

// Specifies the positioning area of the background images
// From CSS version 3
case class BackgroundOrigin(backgroundOrigin: String) extends CssDeclaration {
  val property = "background-origin"
  val value = backgroundOrigin
}

// Specifies the size of the background images
// From CSS version 3
case class BackgroundSize(backgroundSize: String) extends CssDeclaration {
  val property = "background-size"
  val value = backgroundSize
}

