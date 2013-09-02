package tbje.facelift.css

import scala.reflect.macros.Context

/**
 * Permits the specification of a source color profile other than the default
 * Available from CSS version 3
 */
case class ColorProfile(colorProfile: String) extends CssDeclaration {
  val property = "color-profile"
  val value = colorProfile
}

object ColorProfile {
  // TODO: color-profile values
}

/**
 * Sets the opacity level for an element
 * Available from CSS version 3
 *
 */
case class Opacity(opacity: String) extends CssDeclaration {
  val property = "opacity"
  val value = opacity
}

object Opacity {
  // TODO: opacity values
}

/**
 * Permits the specification of a color profile rendering intent other than the default
 * Available from CSS version 3
 */
case class RenderingIntent(renderingIntent: String) extends CssDeclaration {
  val property = "rendering-intent"
  val value = renderingIntent
}

object RenderingIntent {
  // TODO: rendering-intent values
}

case class BaseColor(color: String, property: String) extends CssDeclaration {
  val value = color
}

class BaseColorObject(property: String) {
  object AliceBlue extends BaseColor("aliceblue", property)
  object AntiqueWhite extends BaseColor("antiquewhite", property)
  object Aqua extends BaseColor("aqua", property)
  object Aquamarine extends BaseColor("aquamarine", property)
  object Azure extends BaseColor("azure", property)
  object Beige extends BaseColor("beige", property)
  object Bisque extends BaseColor("bisque", property)
  object Black extends BaseColor("black", property)
  object BlanchedAlmond extends BaseColor("blanchedalmond", property)
  object Blue extends BaseColor("blue", property)
  object BlueViolet extends BaseColor("blueviolet", property)
  object Brown extends BaseColor("brown", property)
  object BurlyWood extends BaseColor("burlywood", property)
  object CadetBlue extends BaseColor("cadetblue", property)
  object Chartreuse extends BaseColor("chartreuse", property)
  object Chocolate extends BaseColor("chocolate", property)
  object Coral extends BaseColor("coral", property)
  object CornflowerBlue extends BaseColor("cornflowerblue", property)
  object Cornsilk extends BaseColor("cornsilk", property)
  object Crimson extends BaseColor("crimson", property)
  object Cyan extends BaseColor("cyan", property)
  object DarkBlue extends BaseColor("darkblue", property)
  object DarkCyan extends BaseColor("darkcyan", property)
  object DarkGoldenRod extends BaseColor("darkgoldenrod", property)
  object DarkGray extends BaseColor("darkgray", property)
  object DarkGreen extends BaseColor("darkgreen", property)
  object DarkKhaki extends BaseColor("darkkhaki", property)
  object DarkMagenta extends BaseColor("darkmagenta", property)
  object DarkOliveGreen extends BaseColor("darkolivegreen", property)
  object DarkOrange extends BaseColor("darkorange", property)
  object DarkOrchid extends BaseColor("darkorchid", property)
  object DarkRed extends BaseColor("darkred", property)
  object DarkSalmon extends BaseColor("darksalmon", property)
  object DarkSeaGreen extends BaseColor("darkseagreen", property)
  object DarkSlateBlue extends BaseColor("darkslateblue", property)
  object DarkSlateGray extends BaseColor("darkslategray", property)
  object DarkTurquoise extends BaseColor("darkturquoise", property)
  object DarkViolet extends BaseColor("darkviolet", property)
  object DeepPink extends BaseColor("deeppink", property)
  object DeepSkyBlue extends BaseColor("deepskyblue", property)
  object DimGray extends BaseColor("dimgray", property)
  object DodgerBlue extends BaseColor("dodgerblue", property)
  object FireBrick extends BaseColor("firebrick", property)
  object FloralWhite extends BaseColor("floralwhite", property)
  object ForestGreen extends BaseColor("forestgreen", property)
  object Fuchsia extends BaseColor("fuchsia", property)
  object Gainsboro extends BaseColor("gainsboro", property)
  object GhostWhite extends BaseColor("ghostwhite", property)
  object Gold extends BaseColor("gold", property)
  object GoldenRod extends BaseColor("goldenrod", property)
  object Gray extends BaseColor("gray", property)
  object Green extends BaseColor("green", property)
  object GreenYellow extends BaseColor("greenyellow", property)
  object HoneyDew extends BaseColor("honeydew", property)
  object HotPink extends BaseColor("hotpink", property)
  object IndianRed extends BaseColor("indianred", property)
  object Indigo extends BaseColor("indigo", property)
  object Ivory extends BaseColor("ivory", property)
  object Khaki extends BaseColor("khaki", property)
  object Lavender extends BaseColor("lavender", property)
  object LavenderBlush extends BaseColor("lavenderblush", property)
  object LawnGreen extends BaseColor("lawngreen", property)
  object LemonChiffon extends BaseColor("lemonchiffon", property)
  object LightBlue extends BaseColor("lightblue", property)
  object LightCoral extends BaseColor("lightcoral", property)
  object LightCyan extends BaseColor("lightcyan", property)
  object LightGoldenRodYellow extends BaseColor("lightgoldenrodyellow", property)
  object LightGray extends BaseColor("lightgray", property)
  object LightGreen extends BaseColor("lightgreen", property)
  object LightPink extends BaseColor("lightpink", property)
  object LightSalmon extends BaseColor("lightsalmon", property)
  object LightSeaGreen extends BaseColor("lightseagreen", property)
  object LightSkyBlue extends BaseColor("lightskyblue", property)
  object LightSlateGray extends BaseColor("lightslategray", property)
  object LightSteelBlue extends BaseColor("lightsteelblue", property)
  object LightYellow extends BaseColor("lightyellow", property)
  object Lime extends BaseColor("lime", property)
  object LimeGreen extends BaseColor("limegreen", property)
  object Linen extends BaseColor("linen", property)
  object Magenta extends BaseColor("magenta", property)
  object Maroon extends BaseColor("maroon", property)
  object MediumAquaMarine extends BaseColor("mediumaquamarine", property)
  object MediumBlue extends BaseColor("mediumblue", property)
  object MediumOrchid extends BaseColor("mediumorchid", property)
  object MediumPurple extends BaseColor("mediumpurple", property)
  object MediumSeaGreen extends BaseColor("mediumseagreen", property)
  object MediumSlateBlue extends BaseColor("mediumslateblue", property)
  object MediumSpringGreen extends BaseColor("mediumspringgreen", property)
  object MediumTurquoise extends BaseColor("mediumturquoise", property)
  object MediumVioletRed extends BaseColor("mediumvioletred", property)
  object MidnightBlue extends BaseColor("midnightblue", property)
  object MintCream extends BaseColor("mintcream", property)
  object MistyRose extends BaseColor("mistyrose", property)
  object Moccasin extends BaseColor("moccasin", property)
  object NavajoWhite extends BaseColor("navajowhite", property)
  object Navy extends BaseColor("navy", property)
  object OldLace extends BaseColor("oldlace", property)
  object Olive extends BaseColor("olive", property)
  object OliveDrab extends BaseColor("olivedrab", property)
  object Orange extends BaseColor("orange", property)
  object OrangeRed extends BaseColor("orangered", property)
  object Orchid extends BaseColor("orchid", property)
  object PaleGoldenRod extends BaseColor("palegoldenrod", property)
  object PaleGreen extends BaseColor("palegreen", property)
  object PaleTurquoise extends BaseColor("paleturquoise", property)
  object PaleVioletRed extends BaseColor("palevioletred", property)
  object PapayaWhip extends BaseColor("papayawhip", property)
  object PeachPuff extends BaseColor("peachpuff", property)
  object Peru extends BaseColor("peru", property)
  object Pink extends BaseColor("pink", property)
  object Plum extends BaseColor("plum", property)
  object PowderBlue extends BaseColor("powderblue", property)
  object Purple extends BaseColor("purple", property)
  object Red extends BaseColor("red", property)
  object RosyBrown extends BaseColor("rosybrown", property)
  object RoyalBlue extends BaseColor("royalblue", property)
  object SaddleBrown extends BaseColor("saddlebrown", property)
  object Salmon extends BaseColor("salmon", property)
  object SandyBrown extends BaseColor("sandybrown", property)
  object SeaGreen extends BaseColor("seagreen", property)
  object SeaShell extends BaseColor("seashell", property)
  object Sienna extends BaseColor("sienna", property)
  object Silver extends BaseColor("silver", property)
  object SkyBlue extends BaseColor("skyblue", property)
  object SlateBlue extends BaseColor("slateblue", property)
  object SlateGray extends BaseColor("slategray", property)
  object Snow extends BaseColor("snow", property)
  object SpringGreen extends BaseColor("springgreen", property)
  object SteelBlue extends BaseColor("steelblue", property)
  object Tan extends BaseColor("tan", property)
  object Teal extends BaseColor("teal", property)
  object Thistle extends BaseColor("thistle", property)
  object Tomato extends BaseColor("tomato", property)
  object Turquoise extends BaseColor("turquoise", property)
  object Violet extends BaseColor("violet", property)
  object Wheat extends BaseColor("wheat", property)
  object White extends BaseColor("white", property)
  object WhiteSmoke extends BaseColor("whitesmoke", property)
  object Yellow extends BaseColor("yellow", property)
  object YellowGreen extends BaseColor("yellowgreen", property)

  import scala.language.experimental.macros

  /**
   * Hexadecimal color values are supported in all major browsers.
   *
   * A hexadecimal color is specified with: #RRGGBB, where the RR (red), GG (green) and BB (blue) hexadecimal integers specify the components of the color. All values must be between 0 and FF.
   *
   * For example, the #0000ff value is rendered as blue, because the blue component is set to its highest value (ff) and the others are set to 0.
   *
   */
  def hex(hexColor: String) = macro ColorHelper.hexMacroImpl
  def hexImpl(hexColor: String) = new BaseColor(hexColor, property) {
    import ColorHelper._
    // TODO: Add macro check on hex format
    require(hexFormatCheck(hexColor), hexFormatErrorMsg(hexColor))
    def testValue(value: String, part: String): Option[String] = {
      try {
        Integer.parseInt(value, 16)
        None
      } catch {
        case e: NumberFormatException =>
          Some(s"$value is not a legal value for $part, should be between 00 and FF")
      }
    }
    val lst = (hexColor.tail.sliding(2, 2).toList zip Seq("RR", "GG", "BB"))

    lst foreach {
      case (value, part) =>
        testValue(value, part) match {
          case Some(msg) => throw new IllegalArgumentException(msg)
        }
    }
  }

  /**
   * RGB color values are supported in all major browsers.
   *
   * An RGB color value is specified with: rgb(red, green, blue). Each parameter (red, green, and blue) defines the intensity of the color and can be an integer between 0 and 255 or a percentage value (from 0% to 100%).
   *
   * For example, the rgb(0,0,255) value is rendered as blue, because the blue parameter is set to its highest value (255) and the others are set to 0.
   *
   * Also, the following values define the same color: rgb(0,0,255) and rgb(0%,0%,100%).
   */
  def rgb(red: Int, green: Int, blue: Int) = macro ColorHelper.rgbMacroImpl

  def rgbOld(red: Int, green: Int, blue: Int) = new BaseColor(s"rgb($red, $green, $blue)", property) {
    require(red >= 0 && red <= 255, "Red rgb value must be between 0 and 255.")
    require(green >= 0 && green <= 255, "Green rgb value must be between 0 and 255.")
    require(blue >= 0 && blue <= 255, "Blue rgb value must be between 0 and 255.")
  }

  def rgbPct(red: Int, green: Int, blue: Int) = macro ColorHelper.rgbPctMacroImpl

  def rgbPctOld(red: Int, green: Int, blue: Int) = new BaseColor(s"rgb($red%, $green%, $blue%)", property) {
    require(red >= 0 && red <= 100, "Red rgb % value must be between 0 and 100.")
    require(green >= 0 && green <= 100, "Green rgb % value must be between 0 and 100.")
    require(blue >= 0 && blue <= 100, "Blue rgb % value must be between 0 and 100.")
  }

  /**
   * RGBA color values are supported in IE9+, Firefox 3+, Chrome, Safari, and in Opera 10+.
   *
   * RGBA color values are an extension of RGB color values with an alpha channel - which specifies the opacity of the object.
   *
   * An RGBA color value is specified with: rgba(red, green, blue, alpha). The alpha parameter is a number between 0.0 (fully transparent) and 1.0 (fully opaque).
   */
  def rgba(red: Int, green: Int, blue: Int, transparency: Double) = macro ColorHelper.rgbaMacroImpl

  def rgbaOld(red: Int, green: Int, blue: Int, transparency: Double) = new BaseColor(s"rgb($red, $green, $blue, $transparency)", property) {
    import ColorHelper._
    require(octetByteCheck(red), octetByteErrorMsg("red rgb", red))
    require(octetByteCheck(green), octetByteErrorMsg("green rgb", green))
    require(octetByteCheck(blue), octetByteErrorMsg("blue rgb", blue))
    require(zeroToOneCheck(transparency), zeroToOneErrorMsg("Transparency", transparency))
  }

  def rgbaPct(red: Int, green: Int, blue: Int, transparency: Double) = macro ColorHelper.rgbaPctMacroImpl

  def rgbaPctOld(red: Int, green: Int, blue: Int, transparency: Double) = new BaseColor(s"rgb($red%, $green%, $blue%, $transparency)", property) {
    import ColorHelper._
    require(percentCheck(red), percentErrorMsg("red rgb %", red))
    require(percentCheck(green), percentErrorMsg("green rgb %", green))
    require(percentCheck(blue), percentErrorMsg("blue rgb %", blue))
    require(zeroToOneCheck(transparency), zeroToOneErrorMsg("Transparency", transparency))
  }

  /**
   * HSL color values are supported in IE9+, Firefox, Chrome, Safari, and in Opera 10+.
   *
   * HSL stands for hue, saturation, and lightness - and represents a cylindrical-coordinate representation of colors.
   *
   * An HSL color value is specified with: hsl(hue, saturation, lightness).
   *
   * Hue is a degree on the color wheel (from 0 to 360) - 0 (or 360) is red, 120 is green, 240 is blue. Saturation is a percentage value;
   * 0% means a shade of gray and 100% is the full color. Lightness is also a percentage; 0% is black, 100% is white.
   */
  def hsl(hue: Int, saturation: Int, lightness: Int): CssDeclaration = macro ColorHelper.hslMacroImpl

  def hslOld(hue: Int, saturation: Int, lightness: Int) = new BaseColor(s"hsl($hue, $saturation, $lightness)", property) {
    import ColorHelper._
    require(degreesCheck(hue), degreesErrorMsg("hue", hue))
    require(percentCheck(saturation), percentErrorMsg("saturation", saturation))
    require(percentCheck(lightness), percentErrorMsg("lightness", lightness))
  }

  /**
   * HSLA color values are supported in IE9+, Firefox 3+, Chrome, Safari, and in Opera 10+.
   *
   * HSLA color values are an extension of HSL color values with an alpha channel - which specifies the opacity of the object.
   *
   * An HSLA color value is specified with: hsla(hue, saturation, lightness, alpha), where the alpha parameter defines the opacity.
   * The alpha parameter is a number between 0.0 (fully transparent) and 1.0 (fully opaque).
   */
  def hsla(hue: Int, saturation: Int, lightness: Int, transparency: Double) = macro ColorHelper.hslaMacroImpl

  def hslaOld(hue: Int, saturation: Int, lightness: Int, transparency: Double) = new BaseColor(s"hsl($hue, $saturation%, $lightness%, $transparency)", property) {
    import ColorHelper._
    require(degreesCheck(hue), degreesErrorMsg("hue", hue))
    require(percentCheck(saturation), percentErrorMsg("saturation", saturation))
    require(percentCheck(lightness), percentErrorMsg("lightness", lightness))
    require(zeroToOneCheck(transparency), zeroToOneErrorMsg("Transparency", transparency))
  }

}

object ColorHelper {

  def checkMacroVar[T](c: Context)(x: c.Expr[T], req: T => Boolean, errorMsg: T => String) = {
    import c.universe._
    x.tree match {
      case Literal(Constant(value: T)) =>
        if (!req(value)) c.abort(x.tree.pos, errorMsg(value))
      case _ =>
    }
  }
  val degreesCheck = (x: Int) => x >= 0 && x <= 360
  val percentCheck = (x: Int) => x >= 0 && x <= 100
  val zeroToOneCheck = (x: Double) => x >= 0.0 && x <= 1.0
  val octetByteCheck = (x: Int) => x >= 0 && x <= 255

  def degreesErrorMsg(name: String, was: Int) = s"The $name value must be between 0 and 360 degrees, but was $was."
  def percentErrorMsg(name: String, was: Int) = s"The $name value must be between 0 and 100%, but was $was%."
  def zeroToOneErrorMsg(name: String, was: Double) = s"$name must be between 0.0 and 1.0, but was $was."
  def octetByteErrorMsg(name: String, was: Int) = s"The $name value must be between 0 and 255, but was $was."
  def hexFormatErrorMsg(was: String) = s"Hex color format must be #RRGGBB, but was $was."

  val hexFormatCheck = (x: String) => x.size == 7 && x.head == '#'

  private def testHex(value: String, part: String): Option[String] = {
    try {
      Integer.parseInt(value, 16)
      None
    } catch {
      case e: NumberFormatException =>
        Some(s"$value is not a legal value for $part")
    }
  }

  def hexMacroImpl(c: Context { type PrefixType = BaseColorObject })(hexColor: c.Expr[String]): c.Expr[CssDeclaration] = {
    import c.universe._
    checkMacroVar[String](c)(hexColor, hexFormatCheck, hexFormatErrorMsg(_))
    hexColor.tree match {
      case Literal(Constant(value: String)) =>
        value.tail.sliding(2, 2).toList zip Seq("RR", "GG", "BB") foreach {
          case (value, part) =>
            testHex(value, part) match {
              case Some(msg) => c.abort(hexColor.tree.pos, msg)
              case _ =>
            }
        }
      case _ =>
    }
    reify { c.prefix.splice.hexImpl(hexColor.splice) }
  }

  def rgbMacroImpl(c: Context { type PrefixType = BaseColorObject })(red: c.Expr[Int], green: c.Expr[Int], blue: c.Expr[Int]): c.Expr[CssDeclaration] = {
    import c.universe._
    checkMacroVar[Int](c)(red, octetByteCheck, octetByteErrorMsg("red rgb %", _))
    checkMacroVar[Int](c)(green, octetByteCheck, octetByteErrorMsg("green rgb %", _))
    checkMacroVar[Int](c)(blue, octetByteCheck, octetByteErrorMsg("blue rgb %", _))
    reify { c.prefix.splice.rgbOld(red.splice, green.splice, blue.splice) }
  }

  def rgbPctMacroImpl(c: Context { type PrefixType = BaseColorObject })(red: c.Expr[Int], green: c.Expr[Int], blue: c.Expr[Int]): c.Expr[CssDeclaration] = {
    import c.universe._
    checkMacroVar[Int](c)(red, percentCheck, percentErrorMsg("red rgb %", _))
    checkMacroVar[Int](c)(green, percentCheck, percentErrorMsg("green rgb %", _))
    checkMacroVar[Int](c)(blue, percentCheck, percentErrorMsg("blue rgb %", _))
    reify { c.prefix.splice.rgbPctOld(red.splice, green.splice, blue.splice) }
  }

  def rgbaMacroImpl(c: Context { type PrefixType = BaseColorObject })(red: c.Expr[Int], green: c.Expr[Int], blue: c.Expr[Int], transparency: c.Expr[Double]): c.Expr[CssDeclaration] = {
    import c.universe._
    checkMacroVar[Int](c)(red, octetByteCheck, octetByteErrorMsg("red rgba %", _))
    checkMacroVar[Int](c)(green, octetByteCheck, octetByteErrorMsg("green rgba %", _))
    checkMacroVar[Int](c)(blue, octetByteCheck, octetByteErrorMsg("blue rgba %", _))
    checkMacroVar[Double](c)(transparency, zeroToOneCheck, zeroToOneErrorMsg("Transparency", _))
    reify { c.prefix.splice.rgbaOld(red.splice, green.splice, blue.splice, transparency.splice) }
  }

  def rgbaPctMacroImpl(c: Context { type PrefixType = BaseColorObject })(red: c.Expr[Int], green: c.Expr[Int], blue: c.Expr[Int], transparency: c.Expr[Double]): c.Expr[CssDeclaration] = {
    import c.universe._
    checkMacroVar[Int](c)(red, percentCheck, percentErrorMsg("red rgba %", _))
    checkMacroVar[Int](c)(green, percentCheck, percentErrorMsg("green rgba %", _))
    checkMacroVar[Int](c)(blue, percentCheck, percentErrorMsg("blue rgba %", _))
    checkMacroVar[Double](c)(transparency, zeroToOneCheck, zeroToOneErrorMsg("Transparency", _))
    reify { c.prefix.splice.rgbaPctOld(red.splice, green.splice, blue.splice, transparency.splice) }
  }

  def hslMacroImpl(c: Context { type PrefixType = BaseColorObject })(hue: c.Expr[Int], saturation: c.Expr[Int], lightness: c.Expr[Int]): c.Expr[CssDeclaration] = {
    import c.universe._
    checkMacroVar[Int](c)(hue, degreesCheck, degreesErrorMsg("hue", _))
    checkMacroVar[Int](c)(saturation, percentCheck, percentErrorMsg("saturation", _))
    checkMacroVar[Int](c)(lightness, percentCheck, percentErrorMsg("lightness", _))
    reify { c.prefix.splice.hslOld(hue.splice, saturation.splice, lightness.splice) }
  }

  def hslaMacroImpl(c: Context { type PrefixType = BaseColorObject })(hue: c.Expr[Int], saturation: c.Expr[Int], lightness: c.Expr[Int], transparency: c.Expr[Double]): c.Expr[CssDeclaration] = {
    import c.universe._
    checkMacroVar[Int](c)(hue, degreesCheck, degreesErrorMsg("hue", _))
    checkMacroVar[Int](c)(saturation, percentCheck, percentErrorMsg("saturation", _))
    checkMacroVar[Int](c)(lightness, percentCheck, percentErrorMsg("lightness", _))
    checkMacroVar[Double](c)(transparency, zeroToOneCheck, zeroToOneErrorMsg("Transparency", _))
    reify { c.prefix.splice.hslaOld(hue.splice, saturation.splice, lightness.splice, transparency.splice) }
  }

}

