package Practical_2

object three extends App{
  def takeHomeSalary(workingHours: Int, OTHours: Int):Double = {
    val salaryBeforeTax = workingHours * 250 + OTHours * 30
    salaryBeforeTax * 0.88
  }

  //example use of function
  println("Example use of function\nNo of Working Hours = 40\nNo of OT hours = 12")
  println("Take Home Salary = Rs. " + takeHomeSalary(40, 12))
}



