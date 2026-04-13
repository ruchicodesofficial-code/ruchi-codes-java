package custom.exception;

public class Main {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        try{
            bank.withdraw(-1000);

        }catch (MinimumBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
