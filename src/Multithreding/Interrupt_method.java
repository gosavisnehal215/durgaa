package Multithreding;
class J extends Thread{
    public void run(){
        try {
            for(int i=1; i<=3; i++){
                System.out.println("t1 is runining");
                Thread.sleep(1000);//here we stop for 1 secomd then direct it interperupt method
            }
        }
        catch (InterruptedException i){
            System.out.println("t1 thread tremineted");
        }

    }
}
public class Interrupt_method {
    public static void main(String[] args) throws InterruptedException{
        J t1 = new J();
        t1.start();

        //t1.interrupt(); //this method only work when thread is waiting or sleep mode
    }
}
