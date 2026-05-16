package multithreading;

public class MyTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable Thread running: "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
    }
}
