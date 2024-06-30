package Practical_3

object Three extends App {
  def averageOfTwo(num1:Double, num2:Double): Double = {
    printf("Average = %.2f", ((num1 + num2) / 2))
    ((num1 + num2) / 2)
  }

  averageOfTwo(3.14 , 43.656)
}
