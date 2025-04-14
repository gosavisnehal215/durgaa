package Multithreding;
class D extends Thread {

    public void run(){
        String n= Thread.currentThread().getName();
        for (int i=1; i<=3; i++){
            System.out.println(n);
        }

    }
}
public class Thread_Schedular {
    public static void main(String[] args) {
        D d1= new D();
        D d2= new D();
        D d3= new D();

        d1.setName("thread 1");
        d2.setName("thread 2");
        d3.setName("thread 3");

        d1.start();
        d2.start();
        d3.start();
    }
}
