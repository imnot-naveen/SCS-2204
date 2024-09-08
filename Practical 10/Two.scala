package Practical_10

object Two extends App{
  val x = new RationalNumber(3, 4)
  val y = new RationalNumber(5,8)
  val z = new RationalNumber(2, 7)

  println("x - y- z = " + x.sub(y.sub(z)))
}



