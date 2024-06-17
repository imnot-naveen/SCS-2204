object five extends App {
  def totalRunningTime(easy:Int, tempo:Int) = {
    val easyTime = easy * 8
    val tempoTime = tempo * 7
    easyTime + tempoTime
  }
  val Time = totalRunningTime(4, 3)
  printf("Total Running Time = %d minutes", Time)
}
