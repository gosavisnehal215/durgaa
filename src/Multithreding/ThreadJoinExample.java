package Multithreding;

public class ThreadJoinExample {
    public static void main(String[] args) throws InterruptedException {

        // Thread 1: Simulate a task
        Thread thread1 = new Thread(() -> {
            try {
                System.out.println("Thread 1 is running...");
                Thread.sleep(2000); // Simulate a task that takes time (2 seconds)
                System.out.println("Thread 1 is done.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread 2: Simulate another task
        Thread thread2 = new Thread(() -> {
            try {
                System.out.println("Thread 2 is running...");
                Thread.sleep(1000); // Simulate a task that takes time (1 second)
                System.out.println("Thread 2 is done.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Main thread waits for thread1 and thread2 to complete using join()
        thread1.join();  // Waits for thread1 to finish
        thread2.join();  // Waits for thread2 to finish

        // After both threads finish, the main thread continues
        System.out.println("Both threads are done, now main thread can continue.");
    }
}

