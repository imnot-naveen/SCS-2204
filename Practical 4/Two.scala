package Practical_4

object Two extends App {
  print("Enter an integer: ");
  var x = scala.io.StdIn.readInt();

  def matchPattern(x: Int): Unit = {
    x match {
      case x if x <= 0 => println("Zero/Negative")
      case x if x % 2 == 0 => println("Even")
      case _ => println("Odd")
    }
  }

  matchPattern(x);
}
