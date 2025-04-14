package Multithreding;


class U extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }

}
public class Prirotry {
    public static void main(String[] args) {
         U t1= new U();
        U t2= new U();
        U t3= new U();

        t1.setName("t1 thread ");
        t2.setName("t2 thread");
        t3.setName("t3 thread");



        t1.setPriority(6);
        t2.setPriority(9);

        t1.start();
        t2.start();
        t3.start();




    }
}
