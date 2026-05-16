package abstraction;

public class Test {
    public static void main(String[] args) {
        Vehicle v;
        v = new Bike();
        v.start();
        v = new Car();
        v.start();
        v.fuel();
    }
}
