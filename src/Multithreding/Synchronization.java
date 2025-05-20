package Multithreding;

//synchroniszed method
class Table {
    public synchronized void PrintTable(int n) {
        for (int i = 1; i<= 10; i++)
        {
            System.out.println(n * i);
        }
    }
}
class Thread_1 extends Thread{
    Table t;
    Thread_1(Table t){
        this.t=t;
    }
    public void run(){
        t.PrintTable(5);
    }
}
class Thread_2 extends Thread{
    Table t;
    Thread_2(Table t){
        this.t=t;
    }
    public void run(){
        t.PrintTable(7);
    }
}

public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
        Table obj = new Table();

        Thread_1 t1= new Thread_1(obj);
        Thread_2 t2=new Thread_2(obj);


        t1.start();
       // t1.join();

        t2.start();
    }
}
