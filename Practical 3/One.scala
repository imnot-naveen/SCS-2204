package Practical_3

object One extends App {
  def reverseString( myString : String): String = {
    if (myString.length <= 1)
      myString
    else
    {
      val c = myString.charAt(myString.length - 1)
      val newString = myString.dropRight(1)
      c + reverseString(newString)
    }
  }

  println(reverseString("Hello"));



}

