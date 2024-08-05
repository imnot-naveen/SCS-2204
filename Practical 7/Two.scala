package Practical_7

object Two extends App{
  def calculateSquare(numbers: List[Int]):List[Int] = {
    val makeSquare = (nums:List[Int]) => nums.map(x => x * x)
    makeSquare(numbers);
  }

  //Sample Usage
  val numbers = List(1,2,3,4,5)
  val squareNumbers = calculateSquare(numbers)
  println("Square Numbers = " + squareNumbers)
}
