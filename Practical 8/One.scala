package Practical_8
import scala.io.StdIn.readLine
object One extends App{
  print("Enter 1 to Encrypt a string OR enter 2 to Decrypt a string: ")
  val choice = readLine().toInt;
  print("Enter the string: ")
  var myString: String = readLine();
  myString = myString.toLowerCase
  print("Enter the shift: ")
  val shift:Int = readLine().toInt;

  def encryptCaesar(word: String, shift: Int): String = {
    val result = word.map(c => ((c - 'a' + shift) % 26 + 'a').toChar)
    result
  }

  def decryptCaesar(word: String, shift: Int): String = {
    val result = word.map(c => ((c - 'a' - shift + 26) % 26 + 'a').toChar)
    result
  }

  def cipher(encrypt: (String, Int) => String, decrypt: (String, Int) => String, choice: Int, word: String, shift: Int): String = {
    choice match {
      case 1 => encrypt(word, shift)
      case 2 => decrypt(word, shift)
      case _ => "Invalid Choice"
    }
  }

  //using the function
  println("result string is: " + cipher(encryptCaesar, decryptCaesar, choice, myString, shift))
}
