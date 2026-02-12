package multithreading.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

    public static void main(String[] args) {
        //1 create a fixed thread pool of size
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        //2 submit 6 tasks to the thread pool
        for(int i=1;i<=6;i++){
            Task task = new Task(i);
            executorService.execute(task);


        }
        //3 shutdown the executor service
        executorService.shutdown();
    }
}
