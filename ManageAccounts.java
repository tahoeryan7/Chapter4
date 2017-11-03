package Chapter4;


// ****************************************************************
//   ManageAccounts.java
//
//   Use Account class to create and manage Sally and Joe's
//   bank accounts      
// extends Account ****************************************************************
public class ManageAccounts
{
    public static void main(String[] args)
    {
        Account acct1, acct2;
        //create account1 for Sally with $1000
        acct1 = new Account(1000, "Sally", 1111);
        Account Sally= new Account(1000, "Sally", 1111);
        //create account2 for Joe with $500
        Account Joe=  new Account(500, "Joe",1);
        //deposit $100 to Joe's account
        Joe.deposit(100);
        //print Joe's new balance (use getBalance())
        System.out.println("Joe's new balance is " + Joe.getBalance());
        //withdraw $50 from Sally's account
        Sally.withdraw(50);
        //print Sally's new balance (use getBalance())
        System.out.println("Sally's new balance is " + Sally.getBalance());
        //charge fees to both accounts
        Sally.chargeFee();
        Joe.chargeFee();
        //change the name on Joe's account to Joseph
        Joe.changeName("Joseph");
        //print summary for both accounts
        System.out.println("Joe's final Balance " + Joe.getBalance());
        System.out.println("Sally's final Balance " + Sally.getBalance());
    }
}