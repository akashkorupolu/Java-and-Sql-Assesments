// Write a program to create an interface called account operation with methods deposit(), getBalance().Implement this interface in Account class.

interface AccountsMethods {
    void deposit(int amount);
    int getBalance();
    
}

class Account implements AccountsMethods
{
    private int amount;
    public void deposit(int amount)
    {
        this.amount=amount;
        
    }
    public int getBalance()
    {
        return amount;
    }
   
}



public class Accounts
{
    public static void main(String[] args) {
        AccountsMethods acc=new Account();
        acc.deposit(1000);
        System.out.println(acc.getBalance());
        acc.deposit(10000);
        acc.getBalance();
    }
}