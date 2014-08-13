package com.github.tbje.facelift.css

/**
 * A shorthand property for setting the mark-before and mark-after properties
 * Available from CSS version 3
 */
case class Mark(mark: String) extends CssDeclaration {
  val property = "mark"
  val value = mark
}

object Mark {
  // TODO: mark values
}

/**
 * Allows named markers to be attached to the audio stream
 * Available from CSS version 3
 */
case class MarkAfter(markAfter: String) extends CssDeclaration {
  val property = "mark-after"
  val value = markAfter
}

object MarkAfter {
  // TODO: mark-after values
}

/**
 * Allows named markers to be attached to the audio stream
 * Available from CSS version 3
 */
case class MarkBefore(markBefore: String) extends CssDeclaration {
  val property = "mark-before"
  val value = markBefore
}

object MarkBefore {
  // TODO: mark-before values
}

/**
 * Specifies a phonetic pronunciation for the text contained by the corresponding element
 * Available from CSS version 3
 */
case class Phonemes(phonemes: String) extends CssDeclaration {
  val property = "phonemes"
  val value = phonemes
}

object Phonemes {
  // TODO: phonemes values
}

/**
 * A shorthand property for setting the rest-before and rest-after properties
 * Available from CSS version 3
 */
case class Rest(rest: String) extends CssDeclaration {
  val property = "rest"
  val value = rest
}

object Rest {
  // TODO: rest values
}

/**
 * Specifies a rest or prosodic boundary to be observed after speaking an element's content
 * Available from CSS version 3
 */
case class RestAfter(restAfter: String) extends CssDeclaration {
  val property = "rest-after"
  val value = restAfter
}

object RestAfter {
  // TODO: rest-after values
}

/**
 * Specifies a rest or prosodic boundary to be observed before speaking an element's content
 * Available from CSS version 3
 */
case class RestBefore(restBefore: String) extends CssDeclaration {
  val property = "rest-before"
  val value = restBefore
}

object RestBefore {
  // TODO: rest-before values
}

/**
 * Specifies the balance between left and right channels
 * Available from CSS version 3
 */
case class VoiceBalance(voiceBalance: String) extends CssDeclaration {
  val property = "voice-balance"
  val value = voiceBalance
}

object VoiceBalance {
  // TODO: voice-balance values
}

/**
 * Specifies how long it should take to render the selected element's content
 * Available from CSS version 3
 */
case class VoiceDuration(voiceDuration: String) extends CssDeclaration {
  val property = "voice-duration"
  val value = voiceDuration
}

object VoiceDuration {
  // TODO: voice-duration values
}

/**
 * Specifies the average pitch (a frequency) of the speaking voice
 * Available from CSS version 3
 */
case class VoicePitch(voicePitch: String) extends CssDeclaration {
  val property = "voice-pitch"
  val value = voicePitch
}

object VoicePitch {
  // TODO: voice-pitch values
}

/**
 * Specifies variation in average pitch
 * Available from CSS version 3
 */
case class VoicePitchRange(voicePitchRange: String) extends CssDeclaration {
  val property = "voice-pitch-range"
  val value = voicePitchRange
}

object VoicePitchRange {
  // TODO: voice-pitch-range values
}

/**
 * Controls the speaking rate
 * Available from CSS version 3
 */
case class VoiceRate(voiceRate: String) extends CssDeclaration {
  val property = "voice-rate"
  val value = voiceRate
}

object VoiceRate {
  // TODO: voice-rate values
}

/**
 * Indicates the strength of emphasis to be applied
 * Available from CSS version 3
 */
case class VoiceStress(voiceStress: String) extends CssDeclaration {
  val property = "voice-stress"
  val value = voiceStress
}

object VoiceStress {
  // TODO: voice-stress values
}

/**
 * Refers to the amplitude of the waveform output by the speech synthesises
 * Available from CSS version 3
 */
case class VoiceVolume(voiceVolume: String) extends CssDeclaration {
  val property = "voice-volume"
  val value = voiceVolume
}

object VoiceVolume {
  // TODO: voice-volume values
}
