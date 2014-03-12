package tbje.facelift.css

import tbje.facelift.attr.Class

/* (Some) Bootstrap 3 classes - requires an import like: 
 *   Script(Type.TextJavaScript, Src(s"//netdna.bootstrapcdn.com/bootstrap/$bootstrapVerison/js/bootstrap.min.js"), Id("bootstrap"))
 * usage example:
 * import tbje.facelift.css.{ BootstrapClasses => Bs }
 * Button(Bs.btn & Bs.btnInfo)("Click me")
 * */

object BootstrapClasses {
  val alert = Class("alert")
  val alertDanger = Class("alert-danger")
  val alertDismissable = Class("alert-dismissable")
  val alertInfo = Class("alert-info")
  val alertLink = Class("alert-link")
  val alertSuccess = Class("alert-success")
  val alertWarning = Class("alert-warning")
  val btn = Class("btn")
  val btnBlock = Class("btn-block")
  val btnDefault = Class("btn-default")
  val btnGroup = Class("btn-group")
  val btnInfo = Class("btn-info")
  val btnPrimary = Class("btn-primary")
  val colMd4 = Class("col-md-4")
  val collapse = Class("collapse")
  val container = Class("container")
  val disabled = Class("disabled")
  val dropdownMenu = Class("dropdown-menu")
  val dropdownToggle = Class("dropdown-toggle")
  val formInline = Class("form-inline")
  val formControl = Class("form-control")
  val formGroup = Class("form-group")
  val h1 = Class("h1")
  val h2 = Class("h2")
  val h3 = Class("h3")
  val h4 = Class("h4")
  val h5 = Class("h5")
  val h6 = Class("h6")
  val small = Class("small")
  val iconBar = Class("icon-bar")
  val navbar = Class("navbar")
  val navbarBrand = Class("navbar-brand")
  val navbarCollapse = Class("navbar-collapse")
  val navbarDefault = Class("navbar-default")
  val navbarFixedTop = Class("navbar-fixed-top")
  val navbarFixedBottom = Class("navbar-fixed-bottom")
  val navbarHeader = Class("navbar-header")
  val navbarToggle = Class("navbar-toggle")
  val progress = Class("progress")
  val progressBar = Class("progress-bar")
  val srOnly = Class("sr-only")
  val row = Class("row")
}
