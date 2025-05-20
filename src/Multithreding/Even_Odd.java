package Multithreding;
class Even_Thread extends Thread{
    public void run(){
        for (int i=1; i<=5; i++){
            System.out.println("print Even:" +i);
        }
    }
}
class Odd_Thread extends Thread{
    public void run(){
        for (int i=1; i<=5; i++){
            System.out.println("Print Odd:" + i);
        }
    }
}
public class Even_Odd {
    public static void main(String[] args) {
        Even_Thread t1= new Even_Thread();
        Odd_Thread  t2=new Odd_Thread();

        t1.start();

        t2.interrupt();
        t2.start();

    //    t2.setPriority(8);


        System.out.println(t2.isAlive());

    }
}
