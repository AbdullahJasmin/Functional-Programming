object Code {
  def main(args: Array[String]) = {
    val account1 = new Account("12345", 10000)
    val account2 = new Account("67890", 30000)

    account2.transfer(account1, 5000)
    
    println(account1)
    println(account2)
  }
}

class Account(id: String, initialBalance: Double){
  var balance = initialBalance
  def deposit(amount: Double) = {
    balance += amount
  }
  def withdraw(amount: Double) = {
    balance -= amount
  }
  def transfer(account: Account, amount: Double) = {
    this.withdraw(amount)
    account.deposit(amount)
  }

  override def toString(): String = {
    return "Account: " + id + " Balance: " + balance
  }
}
