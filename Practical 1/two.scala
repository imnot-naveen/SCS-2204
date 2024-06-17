object two extends App {
  def celciusToFahrenheit(c : Int): Unit = {
    val F = c * 1.8000 + 32.00
    println("Temperature in Fahrenheit is ")
    println (F)
  }
  celciusToFahrenheit(35)
}
