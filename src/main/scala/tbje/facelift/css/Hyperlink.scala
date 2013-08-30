package tbje.facelift.css

/**
 * A shorthand property for setting the target-name, target-new, and target-position properties
 * Available from CSS version 3
 */
case class Target(target: String) extends CssDeclaration {
  val property = "target"
  val value = target
}

object Target {
  // TODO: target values
}

/**
 * Specifies where to open links (target destination
 * Available from CSS version 3
 */
case class TargetName(targetName: String) extends CssDeclaration {
  val property = "target-name"
  val value = targetName
}

object TargetName {
  // TODO: target-name values
}

/**
 * Specifies whether new destination links should open in a new window or in a new tab of an existing window
 * Available from CSS version 3
 */
case class TargetNew(targetNew: String) extends CssDeclaration {
  val property = "target-new"
  val value = targetNew
}

object TargetNew {
  // TODO: target-new values
}

/**
 * Specifies where new destination links should be placed
 * Available from CSS version 3
 */
case class TargetPosition(targetPosition: String) extends CssDeclaration {
  val property = "target-position"
  val value = targetPosition
}

object TargetPosition {
  // TODO: target-position values
}
