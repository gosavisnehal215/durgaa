package Multithreding;

public class First extends Thread {

    public void run() {

        try {
            for (int i = 1; i <= 3; i++) ;
            System.out.println("my thread is running");
            Thread.sleep(5000);
        } catch (InterruptedException i) {
            System.out.println("error remove");
        }
    }

    public static void main(String[] args) throws InterruptedException{
        First f1 = new First();
        First f2 = new First();
        First f3 = new First();

        f1.start();

        f2.start();

        f3.start();

        

    }
}

