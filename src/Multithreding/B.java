package Multithreding;

class A extends Thread{


    public void run(){
        try{
        for ( int i=1; i<=5; i++){
            System.out.println( "krushna");
            Thread.sleep(1000);
        }
    }
        catch(InterruptedException i){

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
    }
    }

