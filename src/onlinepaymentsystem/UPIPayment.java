package onlinepaymentsystem;

public class UPIPayment implements Payment{
    @Override
    public void pay(double amount,User user) {
        System.out.println("User name: "+user.getName()+"\n"+" Payment of "+amount +" done via UPI"+"\n"+ "From Account Number: " +
                user.getAccountNumber());
    }
}
