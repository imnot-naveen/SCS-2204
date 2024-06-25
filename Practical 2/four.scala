package Practical_2

object four extends App{

  def revenue(ticketPrice: Int, attendance:Int) = {
    ticketPrice * attendance
  }
  def cost(attendance: Int) = {
    500 + 3 * attendance
  }
  def attendance(ticketPrice:Int) = {
    120 + (15-ticketPrice) / 5 * 20
  }

  def profit(ticketPrice:Int) = {
    val attendees = attendance(ticketPrice)
    val totalCost = cost(attendees)
    val totalRevenue = revenue(ticketPrice, attendees)
    totalRevenue - totalCost
  }

  print(profit(5), profit(10), profit(15), profit(20), profit(25), profit(30), profit(35))
}
