package Basics_of_Multithreading_Part_2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ques3 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Runnable> tasks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int taskId = i + 1;
            tasks.add(() -> {
                System.out.println("Task #" + taskId + " is running...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Task #" + taskId + " has been interrupted.");
                }
                System.out.println("Task #" + taskId + " has completed.");
            });
        }

        runTasksWithSingleThreadExecutor(tasks);
        runTasksWithNewCachedThreadPool(tasks);
        runTasksWithNewFixedThreadPool(tasks, 3);
    }

    private static void runTasksWithSingleThreadExecutor(List<Runnable> tasks) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (Runnable task : tasks) {
            executorService.submit(task);
        }

        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("All tasks have completed with SingleThreadExecutor.");
    }

    private static void runTasksWithNewCachedThreadPool(List<Runnable> tasks) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (Runnable task : tasks) {
            executorService.submit(task);
        }

        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("All tasks have completed with newCachedThreadPool.");
    }

    private static void runTasksWithNewFixedThreadPool(List<Runnable> tasks, int poolSize) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(poolSize);

        for (Runnable task : tasks) {
            executorService.submit(task);
        }

        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("All tasks have completed with newFixedThreadPool.");
    }
}
