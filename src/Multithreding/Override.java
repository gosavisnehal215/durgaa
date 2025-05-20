package Multithreding;

//can we override the start() method ?
class MyThread extends Thread {


    public void run() {
        System.out.println("run method called");
    }

    public void start() {
        System.out.println("start method overridden");
    }
}

public class Override {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); // Only prints "start method overridden"
        t.run();
    }
}
