package Practical_3

object Two extends App {
  def stringsGreaterThanFive(strings: Array[String]): Array[String] = {
    strings.filter(_.length > 5)
  }

  var strings = Array("Hello", "My", "Name", "Is", "Marshall", "Mathers")
  var filteredStrings = stringsGreaterThanFive(strings)
  println(filteredStrings.mkString(" "))
}
