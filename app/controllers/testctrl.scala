package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.json.Json
import java.io.File
import play.api.Play.current
import play.api.libs.json._
//models import
import models.test_models

//import be.cafeba.cors.filters.CorsFilter


@Singleton
class testctrl @Inject() extends Controller {





  def index =  Action {
    val a = """{"hello": "world", "age": 42}"""
    val b =  test_models.test_str.toString()
    val c =  Json.toJson(a);
    //Ok("object json manualy sting "+a+"model test :"+b+"  obj json from model :"+c)
    Ok(a)
  }


  ///return json and make object json in play scala
  def objjson = Action{
    val name = "gerald"
    val age = 21
    val obj = Json.obj(
      "name" ->name ,
      "age" -> age
    )
    //Ok(obj)
    Ok(obj)
  }

  //retun json and get params as json property
  def objjsonparams(name :String , age : Int)= Action{
    val obj = Json.obj(
      "name" ->name ,
      "age" -> age
    )
    Ok(obj).withHeaders(ACCESS_CONTROL_ALLOW_ORIGIN -> "*",
        ALLOW -> "*",
        ACCESS_CONTROL_ALLOW_HEADERS -> "Origin, X-Requested-With, Content-Type, Accept, Referer, User-Agent"
      )
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
      val x = obj.value("name").toString()
    }
    Created(obj)
  }


  //post file
  def post_multipart_data = Action(parse.multipartFormData) { request =>
     var image_name = ""
     request.body.file("fileUpload").map { picture =>
       image_name = picture.filename
       //path to upload can to all path in server with user permision level
       picture.ref.moveTo(new File(Play.application.path+"/upload/"+picture.filename))
     }
     Ok("File has been uploaded "+image_name)
   }

   //post multiple file
   def post_multiple_file = Action{
     Ok("get it");
   }
}
