object three extends App{
  def volume(r : Int): Unit = {
    val Volume = 4 / 3 * Math.PI * r * r * r
    println("Volume is ")
    println(Volume)
  }
  volume(5)
}
