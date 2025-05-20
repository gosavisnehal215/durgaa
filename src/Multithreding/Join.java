package Multithreding;

class F extends Thread {

    public void run() {
        String n = Thread.currentThread().getName();
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException i) {

        }
    }
}
    public class Join {
        public static void main(String[] args) {
            H f1 = new H();
            H f2 = new H();
            H f3 = new H();

            f1.setName("Raj ");
            f2.setName("Gill  ");
            f3.setName("sen");



            f2.start();

           try{
                f2.join();
            }
            catch(InterruptedException i)
            {

            }
            f1.start();

            f3.start();
        }
    }
