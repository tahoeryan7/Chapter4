package Chapter4;

//*******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
//*******************************************************
public class Account
{
  private double balance;
  private String name;
  private long acctNum;
  private double Withdraw;
  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, long number)
  {
      this.balance=initBal;
      this.name= owner;
      this.acctNum= number;
  }
  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount)
  {
      this.balance=balance-amount;
      if (this.balance<0){
          System.out.println("insufficient funds");
        }
      else{
          System.out.println("new amount is " + this.balance);
          }
      
      }
  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
      this.balance = balance + amount;
      System.out.println("new amount is " + this.balance);
  }
  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance()
  {
      return this.balance; 
  }
  //----------------------------------------------
  // Returns a string containing the name, account number, and balance.
  //----------------------------------------------
  public String toString()
  {
      System.out.println("this is the balance " + this.balance);
      System.out.println("this is the account number " + this.acctNum);
      return this.name;
     
  }
  //----------------------------------------------
  // Deducts $10 service fee
  //----------------------------------------------
  public void chargeFee()
  {
      this.balance= balance-10;
      System.out.println("this is the balance " + this.balance);
  }
  //----------------------------------------------
  // Changes the name on the account
  //----------------------------------------------
  
  public void changeName(String newName)
                         
  {
      name = newName;
  }
}