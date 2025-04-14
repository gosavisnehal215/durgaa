package Multithreding;
class Z implements Runnable{
    public void run(){
        for (int i=1; i<=5; i++){
            System.out.println("My Child Thread");
        }
    }
}
public class SecondType {
    public static void main(String[] args) {
        Z z= new Z();

        Thread t= new Thread(z);
        t.start();
        for(int i=1; i<=5; i++){
            System.out.println("Main Thre  d");
        }
    }
}
