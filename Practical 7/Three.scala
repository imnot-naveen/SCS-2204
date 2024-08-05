object Three extends App{
  def filterPrime(numbers:List[Int]):List[Int] = {
    def isPrime(num: Int): Boolean = {
      if (num <= 1) false
      else !(2 until num).exists(i => num % i == 0)
    }
    val filterPrimeNum = (nums:List[Int]) => nums.filter(isPrime)
    filterPrimeNum(numbers)
  }

  //sample usage
  val numbers = List(1,2,3,4,5,6,7,8,9,10)
  val primeNumbers = filterPrime(numbers)
  println("Prime Numbers = " + primeNumbers)
}
