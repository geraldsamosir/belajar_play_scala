package models

import javax.persistence._
import play.api.db._
import play.api.libs.json.Json


object test_models{

  def test_str: Int= {
    return 0
  }

  def json_dt : String ={
    val obj_test = Json.obj(
      "id" ->1,
      "user" ->"test"
    )
    return obj_test.toString()
  }

}
