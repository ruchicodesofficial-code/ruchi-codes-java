package multithreading;

public class ThreadMethods extends Thread{
    public void run(){
        try {
            //getName()
//            System.out.println("Thread name: " + Thread.currentThread().getName());
//            //getPriority()
//            System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
            //sleep()
            System.out.println("thread is going to sleep..");
            Thread.sleep(1000);
            System.out.println("start");

//            System.out.println(Thread.currentThread().getName());

        }catch(InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadMethods t1 = new ThreadMethods();
        t1.start();
//       t1.join();
//        t1.setName("MyThread");
//        t1.setPriority(Thread.MAX_PRIORITY);
//        if(t1.isAlive()){
//            System.out.println("Thread is still running");
//        }else{
//            System.out.println("Thread is terminated");
//        }


//        System.out.println("main thread resume");

    }
}
