package multithreading.deadlock;

public class Thread2 extends Thread{
    public void run(){
        synchronized (DeadlockDemo.lock2){
            System.out.println("Thread 2 got lock2");
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (DeadlockDemo.lock1){
                System.out.println("Thread 2 got lock1");
            }
        }
    }
}
