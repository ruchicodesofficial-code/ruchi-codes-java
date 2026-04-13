package custom.exception;

public class BankAccount {
    int balance = 6000;
    void withdraw(int amount) throws MinimumBalanceException{
        if(amount<=0){
            throw new InvalidWithdrawAmountException("Withdraw amount must be greater than zero");
        }
        if(balance - amount<5000)
        {
            throw new MinimumBalanceException("Minimum balance must be 5000");
        }else{
            balance -= amount;
            System.out.println("Withdrawal successful");
        }
    }
}
