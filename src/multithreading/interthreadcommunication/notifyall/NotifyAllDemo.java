package multithreading.interthreadcommunication.notifyall;



public class NotifyAllDemo  {
        public static void main(String[] args) {
            SharedResources resources = new SharedResources();
            Producer p = new Producer(resources);
            Consumer c1 = new Consumer(resources,"Consumer-1");
            Consumer c2 = new Consumer(resources,"Consumer-2");
            Consumer c3 = new Consumer(resources,"Consumer-3");
            Consumer c4 = new Consumer(resources,"Consumer-4");
            Consumer c5 = new Consumer(resources,"Consumer-5");
            p.start();
            c1.start();c2.start();c3.start();c4.start();c5.start();
        }
    }
    
