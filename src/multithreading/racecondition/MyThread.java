package multithreading.racecondition;

public class MyThread extends Thread{
    Counter counter;
    MyThread(Counter counter){
        this.counter = counter;
    }
    public void run(){
       for(int i=0;i<=1000;i++){
           counter.increment();
       }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Final Count: "+ counter.count);

    }
}
