package Multithreding;
 class First1 extends Thread{
     public void run(){
         for (int i =1; i<=5; i++){
             System.out.println("Extend class: " + i);
         }
     }

 }

 class Second2 implements Runnable{
     public void run(){
         for(int i=1; i<=5; i++){
             System.out.println("Implementing class:" + i);
         }
     }
 }
public class Both_class {
    public static void main(String[] args) {


        First1  t1= new First1();
        t1.start();


        Second2 runnable = new Second2();
        Thread t2 = new Thread(runnable);
        t2.start();




    }
}
