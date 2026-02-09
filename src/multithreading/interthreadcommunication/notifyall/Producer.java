package multithreading.interthreadcommunication.notifyall;



public class Producer extends Thread{
    SharedResources resources;
    Producer(SharedResources resources){
        this.resources = resources;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            resources.produce(i);

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
