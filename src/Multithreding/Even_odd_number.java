package Multithreding;

class Even implements Runnable {
    public void run() {
        int i;
        for (i = 2; i <= 100; i = i + 2) {
            System.out.println("Even NO:" + i);
        }
    }
}

class Odd implements Runnable {
    public void run() {
        int i;
        for (i = 1; i <= 99; i = i + 2) {
            System.out.println("odd NO" + i);
        }
    }
}
public class Even_odd_number {
    public static void main(String[] args) throws InterruptedException {
        Even evenRunnable = new Even();
        Odd oddRunnable = new Odd();

        Thread t1 = new Thread(evenRunnable);
        Thread t2 = new Thread(oddRunnable);

        t1.start();
        t1.join();
        t2.start();
    }


}
