package Multithreding;
class Alive extends Thread{
    public void run(){
        System.out.println("isAlive method ");
    }
}
public class IsAlive_Method {
    public static void main(String[] args) {
        Alive a=new Alive();
        Alive a2=new Alive();


        a.start();
        System.out.println(a.isAlive());
        System.out.println(a2.isAlive());
        a2.start();
    }
}
