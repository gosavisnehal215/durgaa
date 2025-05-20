package Multithreding;

import java.util.concurrent.CompletableFuture;

public class ThreadJoinAndCompletableFuture {
    public static void main(String[] args) throws InterruptedException {

        // 1st Thread using Thread class
        Thread thread1 = new Thread(() -> {
            try {
                System.out.println("Thread 1 is running...");
                Thread.sleep(2000); // Simulate work with 2 seconds delay
                System.out.println("Thread 1 is done.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // 2nd Thread using Thread class
        Thread thread2 = new Thread(() -> {
            try {
                System.out.println("Thread 2 is running...");
                Thread.sleep(1000); // Simulate work with 1 second delay
                System.out.println("Thread 2 is done.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // 3rd Thread using CompletableFuture
        CompletableFuture<Void> thread3 = CompletableFuture.runAsync(() -> {
            try {
                System.out.println("Thread 3 is running...");
                Thread.sleep(1500); // Simulate work with 1.5 seconds delay
                System.out.println("Thread 3 is done.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start thread1 and thread2
        thread1.start();
        thread2.start();

        // Use join() to wait for thread1 and thread2 to finish
     //   thread1.join();  // Waits for thread1 to finish
     //   thread2.join();  // Waits for thread2 to finish

        // After thread1 and thread2 are done, start thread3 (CompletableFuture)
        thread3.join();  // Wait for thread3 (CompletableFuture) to finish

        // All threads are done, now main thread can continue
        System.out.println("All threads are done, now main thread can continue.");
    }
}
