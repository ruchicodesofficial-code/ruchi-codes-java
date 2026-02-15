package java8features;

public class LambdaExpression {
    public static void main(String[] args) {
        //Anonymous class
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am Anonymous class");
            }
        };
        //lambda Expression
        Runnable r2 = ()-> System.out.println("I am lambda Expression");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
