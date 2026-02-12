package multithreading.callable;

import java.util.concurrent.Callable;

public class SumTask implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Calculation started by "+ Thread.currentThread().getName());
        Thread.sleep(2000);
        return 10+20;
    }
}
