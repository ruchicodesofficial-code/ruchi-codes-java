package multithreading.deadlock;

public class Thread1 extends Thread{
    public void run(){
        synchronized (DeadlockDemo.lock1){
            System.out.println("Thread 1 got lock1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (DeadlockDemo.lock2){
                System.out.println("Thread 1 got lock2");
            }
        }
    }
}
