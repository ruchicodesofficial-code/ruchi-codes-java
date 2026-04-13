package multithreading.interthreadcommunication;

public class SharedResources {
    int data;
    boolean available = false;
    synchronized void produce(int value){
        if(available){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        data = value;
        System.out.println("Produced: "+data);
        available = true;
        notify();
    }
    synchronized void consume(){
        if(!available){
            try{
                wait();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consumed:"+ data );
        available = false;
        notify();
    }
}
