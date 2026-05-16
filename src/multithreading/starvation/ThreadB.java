package multithreading.starvation;

//low priority
public class ThreadB extends Thread{
    public void run(){
        while (true){
            System.out.println("Low priority thread executed");
        }
    }
}
