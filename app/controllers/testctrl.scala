package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.json.Json
import java.io.File

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


  //post file
  def post_multipart_data = Action(parse.multipartFormData) { request =>
     var image_name = ""
     request.body.file("fileUpload").map { picture =>
       image_name = picture.filename
       //path to upload can to all path in server with user permision level
       picture.ref.moveTo(new File("/home/gerald/scala/play/belajar_play_scala/upload/" + picture.filename))
     }
     Ok("File has been uploaded "+image_name)
   }
}
