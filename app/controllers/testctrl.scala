package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.json.Json

@Singleton
class testctrl @Inject() extends Controller {

  def index =  Action {
    val a = """{"hello": "world", "age": 42}"""
    Ok("object json manualy sting "+a)
  }


  ///return json and make object json in play scala
  def objjson = Action{
    var name = "gerald"
    var age = 21
    val obj = Json.obj(
      "name" ->name ,
      "age" -> age
    )
    Ok(obj)
  }

  //retun json and get params as json property
  def objjsonparams(name :String , age : Int)= Action{
    val obj = Json.obj(
      "name" ->name ,
      "age" -> age
    )
    Ok(obj)
  }


  //post data in play scala
  def postdata = Action(parse.tolerantFormUrlEncoded){
    request =>
    val name =  request.body.get("name").map(_.head).getOrElse("")
    val age =  request.body.get("age").map(_.head).getOrElse("0")

    val obj = Json.obj(
      "name" -> name ,
      "age" ->  age
    )
    if(name == ""){

      //get json object
      var x = obj.value("name").toString()
    }
    Created(obj)
  }

}