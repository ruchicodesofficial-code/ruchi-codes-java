package multithreading.threadpool;

public class Task implements Runnable{
    private int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println(
                "task " + taskId +" "+
                        "started by "+Thread.currentThread().getName()
        );
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(
                "task "+ taskId+" "+
                        "completed by "+ Thread.currentThread().getName()
        );

    }
}
