package Practical_7

object One extends App{
  def filterEvenNumbers(numbers :List[Int]):List[Int] = {
    val filterEven = (nums:List[Int]) => nums.filter(_%2 == 0)
    filterEven(numbers)
  }

  //sample usage
  var numbers:List[Int] = List(1,2,3,4,5,6)
  var evenNumbers =  filterEvenNumbers(numbers)
  println("Even numbers = " + evenNumbers)
}
