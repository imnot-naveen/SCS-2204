package Practical_10

object Four extends App{
  val acc1 = new Account(1000.0)
  val acc2 = new Account(-500.0)
  val acc3 = new Account(300.0)
  val acc4 = new Account(-100.0)
  
  val bank = new Bank(List(acc1, acc2, acc3, acc4))
  
  println("Accounts with negative balances:")
  bank.listNegativeBalances.foreach(println)
  
  println(f"\nTotal Balance: $$${bank.totalBalance}%.2f")
  
  bank.applyInterestToAll()

  println("\nFinal balances after applying interest:")
  bank.getAccounts.foreach(println)
}

class Bank(accounts: List[Account]) {

  def listNegativeBalances: List[Account] = {
    accounts.filter(_.getBalance < 0)
  }

  def totalBalance: Double = {
    accounts.map(_.getBalance).sum
  }

  def applyInterestToAll(): Unit = {
    accounts.foreach(_.applyInterest())
  }

  def getAccounts: List[Account] = accounts
}