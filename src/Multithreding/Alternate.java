package Multithreding;
//Write a program where two threads print "Hello" and "World" alternatively.

class HelloThread extends Thread{
    public void run(){
        for(int i=1; i<=6; i++){
            System.out.println("Hello");
        }
            try {
                Thread.sleep(100);
        }catch (InterruptedException i){
                i.printStackTrace();
            }
    }
}

class WorldThread extends Thread{
    public void run(){
        for(int i=1; i<6; i++){
            System.out.println("World");
        }
        try {
            Thread.sleep(100);
        }catch (InterruptedException i){
            i.printStackTrace();
        }
    }
}
public class Alternate {
    public static void main(String[] args) throws InterruptedException {

        HelloThread t1= new HelloThread();
        WorldThread t2 = new WorldThread();

        t1.start();
        t2.start();

    }

}
