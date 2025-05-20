package Multithreding;

import java.time.LocalTime;

class A extends Thread{

  public void  run(){
            for (int i = 1; i <= 5; i++) {
                try {
                    // Print the second before sleeping
                    System.out.println("Before sleep: Second = " + LocalTime.now().getSecond());

                    // Pause for 1 second
                    Thread.sleep(1000);
                    System.out.println("krushna");

                    // Print the second after sleeping
                    System.out.println("After sleep: Second = " + LocalTime.now().getSecond());

                    // Print your custom message


                } catch (InterruptedException e) {
                    System.out.println("Thread was interrupted");
                }
            }
}
}
public class B {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        a.start();

       /* for ( int i=1; i<=5; i++){
            System.out.println( "Rahul");
             Thread.sleep(1000);
        }*/
    }}



