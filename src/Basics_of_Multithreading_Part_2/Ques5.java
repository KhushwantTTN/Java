package Basics_of_Multithreading_Part_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ques5 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            executorService.submit(new WorkerThread(i));
        }

        Thread.sleep(1000);

        System.out.println("Shutting down the executor service...");
        executorService.shutdown();
        executorService.awaitTermination(5000, TimeUnit.MILLISECONDS);
        System.out.println("Executor service has been shut down.");

        System.out.println("Attempting to cancel any remaining tasks...");
        executorService.shutdownNow();
        executorService.awaitTermination(5000, TimeUnit.MILLISECONDS);
        System.out.println("All tasks have been cancelled.");
    }

    private static class WorkerThread implements Runnable {
        private final int taskId;

        public WorkerThread(int taskId) {
            this.taskId = taskId;
        }

        @Override
        public void run() {
            System.out.println("Task #" + taskId + " is running...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Task #" + taskId + " has been interrupted.");
            }
            System.out.println("Task #" + taskId + " has completed.");
        }
    }
}
