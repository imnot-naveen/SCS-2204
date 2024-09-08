package Practical_10

object Five extends App{
    val words = List("apple", "banana", "cherry", "date")
    val result = countLetterOccurrences(words)
    println(s"Total count of letter occurrences: $result")

}

def countLetterOccurrences(words: List[String]): Int = {

  val lengths = words.map(_.length)

  val totalLetterCount = lengths.reduce(_ + _)

  totalLetterCount
}