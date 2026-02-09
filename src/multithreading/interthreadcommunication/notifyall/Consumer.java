package multithreading.interthreadcommunication.notifyall;


public class Consumer extends Thread {
    SharedResources resources;
    String name;
    Consumer(SharedResources resources,String name){
        this.resources = resources;
        this.name = name;
    }
    public void run(){
        for(int i =1;i<=5;i++){
            resources.consume(name);
        }
    }
}
