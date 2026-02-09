package multithreading.interthreadcommunication.notifyall;
 public class SharedResources {
        int data;
        boolean available = false;
        synchronized void produce(int value){
            while(available){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            data = value;
            System.out.println("Produced: "+data);
            available = true;
            notifyAll();
        }
        synchronized void consume(String name){
            while(!available){
                try{
                    wait();
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Consumed:"+ data );
            available = false;
            notifyAll();
        }
}
