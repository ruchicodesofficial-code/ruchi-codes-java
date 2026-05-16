package abstraction;

public class GooglePay implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment using google pay");
    }
}
