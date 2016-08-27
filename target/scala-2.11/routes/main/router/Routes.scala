
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/gerald/scala/play/belajar_play_scala/conf/routes
// @DATE:Sat Aug 27 11:26:01 WIB 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:8
  testctrl_3: controllers.testctrl,
  // @LINE:26
  CountController_0: controllers.CountController,
  // @LINE:28
  AsyncController_2: controllers.AsyncController,
  // @LINE:31
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:8
    testctrl_3: controllers.testctrl,
    // @LINE:26
    CountController_0: controllers.CountController,
    // @LINE:28
    AsyncController_2: controllers.AsyncController,
    // @LINE:31
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_1, testctrl_3, CountController_0, AsyncController_2, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, testctrl_3, CountController_0, AsyncController_2, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """name""", """controllers.testctrl.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """obj""", """controllers.testctrl.objjson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """params/""" + "$" + """name<[^/]+>/""" + "$" + """age<[^/]+>""", """controllers.testctrl.objjsonparams(name:String, age:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """data""", """controllers.testctrl.postdata"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """uploaded""", """controllers.testctrl.post_multipart_data"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_testctrl_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("name")))
  )
  private[this] lazy val controllers_testctrl_index1_invoker = createInvoker(
    testctrl_3.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.testctrl",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """name"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_testctrl_objjson2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("obj")))
  )
  private[this] lazy val controllers_testctrl_objjson2_invoker = createInvoker(
    testctrl_3.objjson,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.testctrl",
      "objjson",
      Nil,
      "GET",
      """""",
      this.prefix + """obj"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_testctrl_objjsonparams3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("params/"), DynamicPart("name", """[^/]+""",true), StaticPart("/"), DynamicPart("age", """[^/]+""",true)))
  )
  private[this] lazy val controllers_testctrl_objjsonparams3_invoker = createInvoker(
    testctrl_3.objjsonparams(fakeValue[String], fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.testctrl",
      "objjsonparams",
      Seq(classOf[String], classOf[Int]),
      "GET",
      """""",
      this.prefix + """params/""" + "$" + """name<[^/]+>/""" + "$" + """age<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_testctrl_postdata4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("data")))
  )
  private[this] lazy val controllers_testctrl_postdata4_invoker = createInvoker(
    testctrl_3.postdata,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.testctrl",
      "postdata",
      Nil,
      "POST",
      """""",
      this.prefix + """data"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_testctrl_post_multipart_data5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uploaded")))
  )
  private[this] lazy val controllers_testctrl_post_multipart_data5_invoker = createInvoker(
    testctrl_3.post_multipart_data,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.testctrl",
      "post_multipart_data",
      Nil,
      "POST",
      """post upload file""",
      this.prefix + """uploaded"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_CountController_count6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count6_invoker = createInvoker(
    CountController_0.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_AsyncController_message7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message7_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:8
    case controllers_testctrl_index1_route(params) =>
      call { 
        controllers_testctrl_index1_invoker.call(testctrl_3.index())
      }
  
    // @LINE:10
    case controllers_testctrl_objjson2_route(params) =>
      call { 
        controllers_testctrl_objjson2_invoker.call(testctrl_3.objjson)
      }
  
    // @LINE:12
    case controllers_testctrl_objjsonparams3_route(params) =>
      call(params.fromPath[String]("name", None), params.fromPath[Int]("age", None)) { (name, age) =>
        controllers_testctrl_objjsonparams3_invoker.call(testctrl_3.objjsonparams(name, age))
      }
  
    // @LINE:16
    case controllers_testctrl_postdata4_route(params) =>
      call { 
        controllers_testctrl_postdata4_invoker.call(testctrl_3.postdata)
      }
  
    // @LINE:19
    case controllers_testctrl_post_multipart_data5_route(params) =>
      call { 
        controllers_testctrl_post_multipart_data5_invoker.call(testctrl_3.post_multipart_data)
      }
  
    // @LINE:26
    case controllers_CountController_count6_route(params) =>
      call { 
        controllers_CountController_count6_invoker.call(CountController_0.count)
      }
  
    // @LINE:28
    case controllers_AsyncController_message7_route(params) =>
      call { 
        controllers_AsyncController_message7_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:31
    case controllers_Assets_versioned8_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned8_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
