package innerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Runnable r1 = new Runnable(){
            @Override
            public void run(){
                System.out.println("anonymous inner class");
            }
        };
        r1.run();
        Runnable r2 =()->{
            System.out.println("lambda expression");
        };
        r2.run();
    }
}
