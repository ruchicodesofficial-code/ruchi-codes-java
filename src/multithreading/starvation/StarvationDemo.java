package multithreading.starvation;

public class StarvationDemo {
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();
        t1.setPriority(Thread.MAX_PRIORITY); //10
        t2.setPriority(Thread.MIN_PRIORITY);//1
        t1.start();
        t2.start();
    }

}
