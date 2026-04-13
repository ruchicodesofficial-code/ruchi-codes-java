package abstraction;

public class Main {
    public static void main(String[] args) {
        Payment p;
        p = new GooglePay();
        p.pay();
        p = new PhonePe();
        p.pay();
    }
}
