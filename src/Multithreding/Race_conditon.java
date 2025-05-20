package Multithreding;
//Create multiple threads that update a shared counter. Use synchronization to prevent race conditions.
//Demonstrate thread-safe increment of a shared variable using synchronized.
class Conter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

}

public class Race_conditon {
    public static void main(String[] args) throws InterruptedException {
        Conter count= new Conter();

        Thread t1= new Thread(()-> {
            for(int i = 0;i<1000;i++)

            {
                count.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0; i<1000; i++){
                count.increment();
            }
        });

        t1.start();
        t1.join();
        t2.start();
        t2.join();

        System.out.println("final counter value:" + count.getCount());

    }
}