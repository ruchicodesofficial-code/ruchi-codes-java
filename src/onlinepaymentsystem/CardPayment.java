package onlinepaymentsystem;

public class CardPayment implements Payment{
    @Override
    public void pay(double amount,User user) {
        System.out.println("User Name"+user.getName()+"\n"+"Payment of "+amount+ " done via Card"+"\n"+"From Account Number: "+
                user.getAccountNumber());
    }
}
