package Practical_8
import scala.io.StdIn.readLine
object Two extends App{
  print("Enter an integer: ")
  val num = readLine().toInt
  val isMultipleOfThree: Int => Boolean = _ % 3 == 0
  val isMultipleOfFive: Int => Boolean = _ % 5 == 0

  val message = (num match {
    case _ if isMultipleOfThree(num) && isMultipleOfFive(num) => "Multiple of Both Three and Five"
    case _ if isMultipleOfThree(num) => "Multiple of Three"
    case _ if isMultipleOfFive(num) => "Multiple of Five"
    case _ => "Not a Multiple of Three or Five"
  })

  println(message)

}
