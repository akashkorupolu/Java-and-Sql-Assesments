class InsufficientBalanceException extends Exception
{
    public  InsufficientBalanceException(double balance,double amount)
    {
        super("Insufficient Balance " + balance +
              " for withdrawal of " + amount);
    }
}


class Withdraw
{
    double balance=10000;
    public Withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

}

public class InsuffecientBalance {
    public static void main(String[] args) {
        try{
        Withdraw w = new Withdraw(200000.0);
        }
        catch(InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
