package multithreading.starvation;
//high priority
public class ThreadA extends Thread{
    public void run(){
        while (true){
            System.out.println("High priority thread running...");
        }
    }

}
