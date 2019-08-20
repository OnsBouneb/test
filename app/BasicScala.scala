package com.particeep.test

/**
  * This is basic language questions so don't use external library or build in function
  */
object BasicScala {


  /**
    * Encode parameter in url format
    *
    * Example:
    *
    * input  : Map("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12")
    * output : "?sort_by=name&order_by=asc&user_id=12"
    *
    * input  : Map()
    * output : ""
    */
  def encodeParamsInUrl(params: Map[String, String]): String = ???
def encodeParamsInUrl(params: Map[String, String]): String = {

    if (params.isEmpty) {
        return("")
    }
    else{
    
  var result = "?"
     for ((k,v) <- params) {
    result = result + (s"$k=$v&")
}

    val newResult = new StringBuilder(result).deleteCharAt(result.length()-1).toString();

  return(newResult)
}

   

}

  /**
    * Test if a String is an email
    */
  def isEmail(maybeEmail: String): Boolean = 

	maybeEmail.contains("@")


  /**
    * Compute i ^ n
    *
    * Example:
    *
    * input : (i = 2, n = 3) we compute 2^3 = 2x2x2
    * output : 8
    *
    * input : (i = 99, n = 38997)
    * output : 1723793299
    */
  def power(i:Int, n:Int):Int = 
		scala.math.pow(i,n).toInt 


}
