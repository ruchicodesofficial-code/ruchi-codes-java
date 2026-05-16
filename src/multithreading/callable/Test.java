package multithreading.callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future<Integer> future = executorService.submit(new SumTask());
        System.out.println("Main thread doing other work....");
        Integer result = future.get();
        System.out.println("Result= "+result);
        executorService.shutdown();
    }
}
