package Practical_10

object Three extends App{
  val acc1 = new Account(1000.0)
  val acc2 = new Account(500.0)

  println(acc1)
  println(acc2)

  acc1.Deposit(200)
  acc1.Withdraw(300)

  acc1.transfer(acc2, 400)
  println(acc1)
  println(acc2)
}

class Account(private var balance: Double) {
  def Deposit(amount: Double) : Unit = {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
    println(s"Deposited: $$${amount}, New Balance: $$${balance}")
  }

  def Withdraw(amount: Double) : Unit = {
    require(amount > 0, "Withdrawal amount must be positive")
    if (amount <= balance){
      balance -= amount
      println(s"Withdrew: $$${amount}, New Balance: $$${balance}")
    }
    else{
      println("Insufficient Balance")
    }
  }

  def transfer(target: Account, amount: Double): Unit = {
    require(amount > 0, "Transfer amount must be positive")
    if (amount <= balance) {
      this.Withdraw(amount)
      target.Deposit(amount)
      println(s"Transferred: $$${amount} to target account, Your New Balance: $$${balance}")
    }
    else{
      print("Insufficient balance to transfer")
    }
  }
  
  def applyInterest(): Unit = {
    if (balance > 0) {
      balance += balance * 0.05 
    } else {
      balance -= balance * 0.10 
    }
  }

  def getBalance : Double = balance

  override def toString: String = s"Account Balance: $$${balance}"
}