package Practical_5

object Three extends App {
  def fibonacci(n: Int): Int = {
    if (n == 0) {
      return 0;
    }
    else if (n == 1) {
      return 1;
    }
    else {
      return (fibonacci(n - 1) + fibonacci(n - 2));
    }
  }

  println("Fibonacci(8) == " + fibonacci(8))
}

