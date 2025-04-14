package Multithreding;
class E extends Thread {

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

    public class Thread_Sleep {
        public static void main(String[] args) {
            E e1 = new E();
            E e2 = new E();
            E e3 = new E();

            e1.setName("thread 1");
            e2.setName("thread 2");
            e3.setName("thread 3");

            e1.start();
            e2.start();
            e3.start();
        }
    }
}