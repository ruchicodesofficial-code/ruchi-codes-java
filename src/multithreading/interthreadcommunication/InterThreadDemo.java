package multithreading.interthreadcommunication;

public class InterThreadDemo {
    public static void main(String[] args) {
        SharedResources resources = new SharedResources();
        Producer p = new Producer(resources);
        Consumer c = new Consumer(resources);
        p.start();
        c.start();
    }
}
