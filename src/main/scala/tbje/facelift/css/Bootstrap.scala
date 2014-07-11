package tbje.facelift.css

import tbje.facelift.attr.Class

/* (Some) Bootstrap 3 classes - requires an import like: 
 *   Script(Type.TextJavaScript, Src(s"//netdna.bootstrapcdn.com/bootstrap/$bootstrapVerison/js/bootstrap.min.js"), Id("bootstrap"))
 * usage example:
 * import tbje.facelift.css.{ BootstrapClasses => Bs }
 * Button(Bs.btn & Bs.btnInfo)("Click me")
 * */

object BootstrapClasses {
  val active = Class("active")
  val affix = Class("affix")
  val alert = Class("alert")
  val alertDanger = Class("alert-danger")
  val alertDismissable = Class("alert-dismissable")
  val alertInfo = Class("alert-info")
  val alertLink = Class("alert-link")
  val alertSuccess = Class("alert-success")
  val alertWarning = Class("alert-warning")
  val arrow = Class("arrow")
  val badge = Class("badge")
  val bottom = Class("bottom")
  val breadcrumb = Class("breadcrumb")
  val btn = Class("btn")
  val btnBlock = Class("btn-block")
  val btnDanger = Class("btn-danger")
  val btnDefault = Class("btn-default")
  val btnGroup = Class("btn-group")
  val btnGroupJustified = Class("btn-group-justified")
  val btnGroupLg = Class("btn-group-lg")
  val btnGroupSm = Class("btn-group-sm")
  val btnGroupVertical = Class("btn-group-vertical")
  val btnGroupXs = Class("btn-group-xs")
  val btnInfo = Class("btn-info")
  val btnLg = Class("btn-lg")
  val btnLink = Class("btn-link")
  val btnPrimary = Class("btn-primary")
  val btnSuccess = Class("btn-success")
  val btnWarning = Class("btn-warning")
  val btnXs = Class("btn-xs")
  val caption = Class("caption")
  val caret = Class("caret")
  val carousel = Class("carousel")
  val carouselCaption = Class("carousel-caption")
  val carouselControl = Class("carousel-control")
  val carouselIndicators = Class("carousel-indicators")
  val carouselInner = Class("carousel-inner")
  val checkbox = Class("checkbox")
  val checkboxInline = Class("checkbox-inline")
  val clearfix = Class("clearfix")
  val close = Class("close")
  val col = Class("col")
  val colLg1 = Class("col-lg-1")
  val colLg10 = Class("col-lg-10")
  val colLg11 = Class("col-lg-11")
  val colLg12 = Class("col-lg-12")
  val colLg2 = Class("col-lg-2")
  val colLg3 = Class("col-lg-3")
  val colLg4 = Class("col-lg-4")
  val colLg5 = Class("col-lg-5")
  val colLg6 = Class("col-lg-6")
  val colLg7 = Class("col-lg-7")
  val colLg8 = Class("col-lg-8")
  val colLg9 = Class("col-lg-9")
  val colLgOffset0 = Class("col-lg-offset-0")
  val colLgOffset1 = Class("col-lg-offset-1")
  val colLgOffset10 = Class("col-lg-offset-10")
  val colLgOffset11 = Class("col-lg-offset-11")
  val colLgOffset2 = Class("col-lg-offset-2")
  val colLgOffset3 = Class("col-lg-offset-3")
  val colLgOffset4 = Class("col-lg-offset-4")
  val colLgOffset5 = Class("col-lg-offset-5")
  val colLgOffset6 = Class("col-lg-offset-6")
  val colLgOffset7 = Class("col-lg-offset-7")
  val colLgOffset8 = Class("col-lg-offset-8")
  val colLgOffset9 = Class("col-lg-offset-9")
  val colLgPull0 = Class("col-lg-pull-0")
  val colLgPull1 = Class("col-lg-pull-1")
  val colLgPull10 = Class("col-lg-pull-10")
  val colLgPull11 = Class("col-lg-pull-11")
  val colLgPull2 = Class("col-lg-pull-2")
  val colLgPull3 = Class("col-lg-pull-3")
  val colLgPull4 = Class("col-lg-pull-4")
  val colLgPull5 = Class("col-lg-pull-5")
  val colLgPull6 = Class("col-lg-pull-6")
  val colLgPull7 = Class("col-lg-pull-7")
  val colLgPull8 = Class("col-lg-pull-8")
  val colLgPull9 = Class("col-lg-pull-9")
  val colLgPush0 = Class("col-lg-push-0")
  val colLgPush1 = Class("col-lg-push-1")
  val colLgPush10 = Class("col-lg-push-10")
  val colLgPush11 = Class("col-lg-push-11")
  val colLgPush2 = Class("col-lg-push-2")
  val colLgPush3 = Class("col-lg-push-3")
  val colLgPush4 = Class("col-lg-push-4")
  val colLgPush5 = Class("col-lg-push-5")
  val colLgPush6 = Class("col-lg-push-6")
  val colLgPush7 = Class("col-lg-push-7")
  val colLgPush8 = Class("col-lg-push-8")
  val colLgPush9 = Class("col-lg-push-9")
  val colMd1 = Class("col-md-1")
  val colMd10 = Class("col-md-10")
  val colMd11 = Class("col-md-11")
  val colMd12 = Class("col-md-12")
  val colMd2 = Class("col-md-2")
  val colMd3 = Class("col-md-3")
  val colMd4 = Class("col-md-4")
  val colMd5 = Class("col-md-5")
  val colMd6 = Class("col-md-6")
  val colMd7 = Class("col-md-7")
  val colMd8 = Class("col-md-8")
  val colMd9 = Class("col-md-9")
  val colMdOffset0 = Class("col-md-offset-0")
  val colMdOffset1 = Class("col-md-offset-1")
  val colMdOffset10 = Class("col-md-offset-10")
  val colMdOffset11 = Class("col-md-offset-11")
  val colMdOffset2 = Class("col-md-offset-2")
  val colMdOffset3 = Class("col-md-offset-3")
  val colMdOffset4 = Class("col-md-offset-4")
  val colMdOffset5 = Class("col-md-offset-5")
  val colMdOffset6 = Class("col-md-offset-6")
  val colMdOffset7 = Class("col-md-offset-7")
  val colMdOffset8 = Class("col-md-offset-8")
  val colMdOffset9 = Class("col-md-offset-9")
  val colMdPull0 = Class("col-md-pull-0")
  val colMdPull1 = Class("col-md-pull-1")
  val colMdPull10 = Class("col-md-pull-10")
  val colMdPull11 = Class("col-md-pull-11")
  val colMdPull2 = Class("col-md-pull-2")
  val colMdPull3 = Class("col-md-pull-3")
  val colMdPull4 = Class("col-md-pull-4")
  val colMdPull5 = Class("col-md-pull-5")
  val colMdPull6 = Class("col-md-pull-6")
  val colMdPull7 = Class("col-md-pull-7")
  val colMdPull8 = Class("col-md-pull-8")
  val colMdPull9 = Class("col-md-pull-9")
  val colMdPush0 = Class("col-md-push-0")
  val colMdPush1 = Class("col-md-push-1")
  val colMdPush10 = Class("col-md-push-10")
  val colMdPush11 = Class("col-md-push-11")
  val colMdPush2 = Class("col-md-push-2")
  val colMdPush3 = Class("col-md-push-3")
  val colMdPush4 = Class("col-md-push-4")
  val colMdPush5 = Class("col-md-push-5")
  val colMdPush6 = Class("col-md-push-6")
  val colMdPush7 = Class("col-md-push-7")
  val colMdPush8 = Class("col-md-push-8")
  val colMdPush9 = Class("col-md-push-9")
  val colSm1 = Class("col-sm-1")
  val colSm10 = Class("col-sm-10")
  val colSm11 = Class("col-sm-11")
  val colSm12 = Class("col-sm-12")
  val colSm2 = Class("col-sm-2")
  val colSm3 = Class("col-sm-3")
  val colSm4 = Class("col-sm-4")
  val colSm5 = Class("col-sm-5")
  val colSm6 = Class("col-sm-6")
  val colSm7 = Class("col-sm-7")
  val colSm8 = Class("col-sm-8")
  val colSm9 = Class("col-sm-9")
  val colSmOffset1 = Class("col-sm-offset-1")
  val colSmOffset10 = Class("col-sm-offset-10")
  val colSmOffset11 = Class("col-sm-offset-11")
  val colSmOffset2 = Class("col-sm-offset-2")
  val colSmOffset3 = Class("col-sm-offset-3")
  val colSmOffset4 = Class("col-sm-offset-4")
  val colSmOffset5 = Class("col-sm-offset-5")
  val colSmOffset6 = Class("col-sm-offset-6")
  val colSmOffset7 = Class("col-sm-offset-7")
  val colSmOffset8 = Class("col-sm-offset-8")
  val colSmOffset9 = Class("col-sm-offset-9")
  val colSmPull1 = Class("col-sm-pull-1")
  val colSmPull10 = Class("col-sm-pull-10")
  val colSmPull11 = Class("col-sm-pull-11")
  val colSmPull2 = Class("col-sm-pull-2")
  val colSmPull3 = Class("col-sm-pull-3")
  val colSmPull4 = Class("col-sm-pull-4")
  val colSmPull5 = Class("col-sm-pull-5")
  val colSmPull6 = Class("col-sm-pull-6")
  val colSmPull7 = Class("col-sm-pull-7")
  val colSmPull8 = Class("col-sm-pull-8")
  val colSmPull9 = Class("col-sm-pull-9")
  val colSmPush1 = Class("col-sm-push-1")
  val colSmPush10 = Class("col-sm-push-10")
  val colSmPush11 = Class("col-sm-push-11")
  val colSmPush2 = Class("col-sm-push-2")
  val colSmPush3 = Class("col-sm-push-3")
  val colSmPush4 = Class("col-sm-push-4")
  val colSmPush5 = Class("col-sm-push-5")
  val colSmPush6 = Class("col-sm-push-6")
  val colSmPush7 = Class("col-sm-push-7")
  val colSmPush8 = Class("col-sm-push-8")
  val colSmPush9 = Class("col-sm-push-9")
  val colXs1 = Class("col-xs-1")
  val colXs10 = Class("col-xs-10")
  val colXs11 = Class("col-xs-11")
  val colXs12 = Class("col-xs-12")
  val colXs2 = Class("col-xs-2")
  val colXs3 = Class("col-xs-3")
  val colXs4 = Class("col-xs-4")
  val colXs5 = Class("col-xs-5")
  val colXs6 = Class("col-xs-6")
  val colXs7 = Class("col-xs-7")
  val colXs8 = Class("col-xs-8")
  val colXs9 = Class("col-xs-9")
  val collapse = Class("collapse")
  val collapsing = Class("collapsing")
  val container = Class("container")
  val controlLabel = Class("control-label")
  val disabled = Class("disabled")
  val divider = Class("divider")
  val dropdown = Class("dropdown")
  val dropdownBackdrop = Class("dropdown-backdrop")
  val dropdownHeader = Class("dropdown-header")
  val dropdownMenu = Class("dropdown-menu")
  val dropdownToggle = Class("dropdown-toggle")
  val fade = Class("fade")
  val formControl = Class("form-control")
  val formControlStatic = Class("form-control-static")
  val formGroup = Class("form-group")
  val formInline = Class("form-inline")
  val formHorizontal = Class("form-horizontal")
  val glyphicon = Class("glyphicon")
  val glyphiconChevronRight = Class("glyphicon-chevron-right")
  val h1 = Class("h1")
  val h2 = Class("h2")
  val h3 = Class("h3")
  val h4 = Class("h4")
  val h5 = Class("h5")
  val h6 = Class("h6")
  val hasError = Class("has-error")
  val hasSuccess = Class("has-success")
  val hasWarning = Class("has-warning")
  val helpBlock = Class("help-block")
  val hidden = Class("hidden")
  val hiddenLg = Class("hidden-lg")
  val hiddenMd = Class("hidden-md")
  val hiddenPrint = Class("hidden-print")
  val hiddenSm = Class("hidden-sm")
  val hiddenXs = Class("hidden-xs")
  val hide = Class("hide")
  val iconBar = Class("icon-bar")
  val iconNext = Class("icon-next")
  val imgCircle = Class("img-circle")
  val imgResponsive = Class("img-responsive")
  val imgRounded = Class("img-rounded")
  val imgThumbnail = Class("img-thumbnail")
  val in = Class("in")
  val initialism = Class("initialism")
  val inputGroup = Class("input-group")
  val inputGroupAddon = Class("input-group-addon")
  val inputGroupBtn = Class("input-group-btn")
  val inputLg = Class("input-lg")
  val inputSm = Class("input-sm")
  val invisible = Class("invisible")
  val item = Class("item")
  val jumbotron = Class("jumbotron")
  val label = Class("label")
  val labelDanger = Class("label-danger")
  val labelDefault = Class("label-default")
  val labelInfo = Class("label-info")
  val labelPrimary = Class("label-primary")
  val labelSuccess = Class("label-success")
  val labelWarning = Class("label-warning")
  val lead = Class("lead")
  val left = Class("left")
  val listGroup = Class("list-group")
  val listGroupItem = Class("list-group-item")
  val listGroupItemHeading = Class("list-group-item-heading")
  val listGroupItemText = Class("list-group-item-text")
  val listInline = Class("list-inline")
  val listUnstyled = Class("list-unstyled")
  val media = Class("media")
  val mediaBody = Class("media-body")
  val mediaHeading = Class("media-heading")
  val mediaList = Class("media-list")
  val mediaObject = Class("media-object")
  val modal = Class("modal")
  val modalBackdrop = Class("modal-backdrop")
  val modalBody = Class("modal-body")
  val modalContent = Class("modal-content")
  val modalDialog = Class("modal-dialog")
  val modalFooter = Class("modal-footer")
  val modalHeader = Class("modal-header")
  val modalOpen = Class("modal-open")
  val modalTitle = Class("modal-title")
  val nav = Class("nav")
  val navDivider = Class("nav-divider")
  val navJustified = Class("nav-justified")
  val navTabs = Class("nav-tabs")
  val navTabsJustified = Class("nav-tabs-justified")
  val navbar = Class("navbar")
  val navbarBrand = Class("navbar-brand")
  val navbarBtn = Class("navbar-btn")
  val navbarCollapse = Class("navbar-collapse")
  val navbarDefault = Class("navbar-default")
  val navbarFixedBottom = Class("navbar-fixed-bottom")
  val navbarFixedTop = Class("navbar-fixed-top")
  val navbarForm = Class("navbar-form")
  val navbarHeader = Class("navbar-header")
  val navbarInverse = Class("navbar-inverse")
  val navbarLeft = Class("navbar-left")
  val navbarLink = Class("navbar-link")
  val navbarNav = Class("navbar-nav")
  val navbarRight = Class("navbar-right")
  val navbarStaticTop = Class("navbar-static-top")
  val navbarText = Class("navbar-text")
  val navbarToggle = Class("navbar-toggle")
  val next = Class("next")
  val pageHeader = Class("page-header")
  val pager = Class("pager")
  val pagination = Class("pagination")
  val panel = Class("panel")
  val panelBody = Class("panel-body")
  val panelDanger = Class("panel-danger")
  val panelDefault = Class("panel-default")
  val panelFooter = Class("panel-footer")
  val panelHeading = Class("panel-heading")
  val panelInfo = Class("panel-info")
  val panelPrimary = Class("panel-primary")
  val panelSuccess = Class("panel-success")
  val panelTitle = Class("panel-title")
  val panelWarning = Class("panel-warning")
  val pillPane = Class("pill-pane")
  val popover = Class("popover")
  val popoverContent = Class("popover-content")
  val popoverTitle = Class("popover-title")
  val preScrollable = Class("pre-scrollable")
  val prettyprint = Class("prettyprint")
  val prev = Class("prev")
  val progress = Class("progress")
  val progressBar = Class("progress-bar")
  val progressBarDanger = Class("progress-bar-danger")
  val progressBarInfo = Class("progress-bar-info")
  val progressBarSuccess = Class("progress-bar-success")
  val progressBarWarning = Class("progress-bar-warning")
  val pullLeft = Class("pull-left")
  val pullRight = Class("pull-right")
  val right = Class("right")
  val row = Class("row")
  val show = Class("show")
  val small = Class("small")
  val srOnly = Class("sr-only")
  val table = Class("table")
  val tableBordered = Class("table-bordered")
  val tableResponsive = Class("table-responsive")
  val tableStriped = Class("table-striped")
  val textCenter = Class("text-center")
  val textDanger = Class("text-danger")
  val textHide = Class("text-hide")
  val textInfo = Class("text-info")
  val textLeft = Class("text-left")
  val textMuted = Class("text-muted")
  val textPrimary = Class("text-primary")
  val textRight = Class("text-right")
  val textSuccess = Class("text-success")
  val textWarning = Class("text-warning")
  val thumbnail = Class("thumbnail")
  val tooltip = Class("tooltip")
  val tooltipArrow = Class("tooltip-arrow")
  val tooltipInner = Class("tooltip-inner")
  val top = Class("top")
  val visibleLg = Class("visible-lg")
  val visibleMd = Class("visible-md")
  val visiblePrint = Class("visible-print")
  val visibleSm = Class("visible-sm")
  val visibleXs = Class("visible-xs")
  val well = Class("well")
  val wellLg = Class("well-lg")
  val wellSm = Class("well-sm")
}

