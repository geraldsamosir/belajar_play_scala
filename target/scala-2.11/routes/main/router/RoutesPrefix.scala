
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/gerald/scala/play/belajar_play_scala/conf/routes
// @DATE:Sun Aug 28 15:43:51 WIB 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
