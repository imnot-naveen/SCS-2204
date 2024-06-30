object Four extends App {
  def sumOfEven(numbers: Array[Int]): Int = {
    var sum: Int = 0
    val evenNumbers: Array[Int] = numbers.filter(_ % 2 == 0)
    var i = 0
    while (i < evenNumbers.length) {
      sum = sum + evenNumbers(i)
      i = i + 1
    }
    sum
  }

  val numbers = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val result = sumOfEven(numbers)
  println(s"The sum of even numbers is = " + result)
}
