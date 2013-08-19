package tbje.facelift.css

/**
 * Permits the specification of a source color profile other than the default
 * Available from CSS version 3
 */
// TODO: color-profile

/**
 * Sets the opacity level for an element
 * Available from CSS version 3
 *
 */
// TODO: opacity

/**
 * Permits the specification of a color profile rendering intent other than the default
 * Available from CSS version 3
 */
// TODO: rendering-intent
case class Color(color: String) extends CssDeclaration {
  val property = "color"
  val value = color
}

object Color extends BaseColorObject("color")

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

  /**
   * Hexadecimal color values are supported in all major browsers.
   *
   * A hexadecimal color is specified with: #RRGGBB, where the RR (red), GG (green) and BB (blue) hexadecimal integers specify the components of the color. All values must be between 0 and FF.
   *
   * For example, the #0000ff value is rendered as blue, because the blue component is set to its highest value (ff) and the others are set to 0.
   *
   */
  def hex(hexColor: String) = new BaseColor(hexColor, property) {
    // TODO: Add macro check on hex format
    require(hexColor.size == 7, "Hex color format must be #RRGGBB")
    require(hexColor.head == '#', "Hex color format must be #RRGGBB")
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
  def rgb(red: Int, green: Int, blue: Int) = new BaseColor(s"rgb($red, $green, $blue)", property) {
    // TODO: Add macro check on rgb values
    require(red >= 0 && red <= 256, "Red rgb value must be between 0 and 255.")
    require(green >= 0 && green <= 256, "Green rgb value must be between 0 and 255.")
    require(blue >= 0 && blue <= 256, "Blue rgb value must be between 0 and 255.")
  }
}

