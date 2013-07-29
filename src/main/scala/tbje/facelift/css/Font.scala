package tbje.facelift.css

/**
 * Sets all the font properties in one declaration
 * Available from CSS version 1
 */
// TODO: font

/**
 * Specifies the font style for text
 * Available from CSS version 1
 */
// TODO: font-style

/**
 * Specifies whether or not a text should be displayed in a small-caps font
 * Available from CSS version 1
 */
// TODO: font-variant

/**
 * Specifies the weight of a font
 * Available from CSS version 1
 */
// TODO: font-weight

/**
 * A rule that allows websites to download and use fonts other than the "web-safe" fonts
 * Available from CSS version 3
 */
// TODO: @font-face

/**
 * Preserves the readability of text when font fallback occurs
 * Available from CSS version 3
 */
// TODO: font-size-adjust

/**
 * Selects a normal, condensed, or expanded face from a font family
 * Available from CSS version 3
 */
// TODO: font-stretch

/**
 * Specifies the font family for text
 * Available from CSS version 1
 */
class FontFamily(val value: String) extends CssDeclaration {
  val property = "font-family"
}

object FontFamily {
  object websafe {
    object serif {
      object Georgia extends FontFamily("""Georgia, serif""")
      object PalatinoLinotype extends FontFamily(""""Palatino Linotype", "Book Antiqua", Palatino, serif""")
      object TimesNewRoman extends FontFamily(""""Times New Roman", Times, serif""")
    }
    object sansSerif {
      object ArialHelvetica extends FontFamily("""Arial, Helvetica, sans-serif""")
      object ArialBlack extends FontFamily(""""Arial Black", Gadget, sans-serif""")
      object ComicSansMS extends FontFamily(""""Comic Sans MS", cursive, sans-serif""")
      object ImpactCharcoal extends FontFamily("""Impact, Charcoal, sans-serif""")
      object LucidaSansUnicode extends FontFamily(""""Lucida Sans Unicode", "Lucida Grande", sans-serif""")
      object TahomaGeneva extends FontFamily("""Tahoma, Geneva, sans-serif""")
      object TrebuchetMS extends FontFamily(""""Trebuchet MS", Helvetica, sans-serif""")
      object VerdanaGeneva extends FontFamily("""Verdana, Geneva, sans-serif""")
    }

    object monospace {
      object CourierNew extends FontFamily(""""Courier New", Courier, monospace""")
      object LucidaConsole extends FontFamily(""""Lucida Console", Monaco, monospace""")
    }
  }
}

/**
 * Specifies the font size of text
 * Available from CSS version 1
 */
class FontSize(val value: String) extends CssDeclaration {
  val property = "font-size"
}

object FontSize {
  def apply(value: String) = new FontSize(value)
  def apply(measure: CssMeasure) = new FontSize(measure.value)
}

case class FontSizeEm(size: Double) extends FontSize(s"${size}em")

case class FontSizePx(size: Int) extends FontSize(s"${size}px")
