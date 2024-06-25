package Practical_2

object two extends App{
  var a = 2
  var b = 3
  var c = 4
  var d = 5
  var k = 4.3f

  b -= 1 // pre-decrement of b
  val result1 = b * a + c * d
  println(result1)
  d -= 1 //post decrement of d

  println(a)
  a -= 1 //post decrement of a
}
