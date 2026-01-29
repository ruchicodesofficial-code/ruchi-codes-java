package onlinepaymentsystem;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Payment payment;
        payment = new UPIPayment();
        user.setName("supriya");
        user.setAccountNumber("300908");
        payment.pay(5000,user);
        payment = new CardPayment();
        user.setName("Rahul");
        user.setAccountNumber("9008067");
        payment.pay(2000,user);
        System.out.println("Platform: "+PaymentService.PLATFORM_NAME);
        System.out.println("Max Limit: "+TransactionRules.MAX_LIMIT);

    }
}
