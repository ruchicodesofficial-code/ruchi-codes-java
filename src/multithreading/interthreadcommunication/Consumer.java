package multithreading.interthreadcommunication;

public class Consumer extends Thread{
    SharedResources resources;
    Consumer(SharedResources resources){
        this.resources = resources;
    }
    public void run(){
        for(int i =1;i<=5;i++){
            resources.consume();
        }
    }
}
