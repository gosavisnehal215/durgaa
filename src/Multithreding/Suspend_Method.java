/*


package Multithreding;

class F1 extends Thread {

    public void run() {
        String name = Thread.currentThread().getName();

            for (int i = 1; i <= 3; i++) {
                System.out.println(name);
            }

    }

    public class Suspend_Method {
        public static void main(String[] args) {
            F1 f1 = new F1();
            F1 f2 = new F1();
            F1 f3 = new F1();

            f1.setName("Raj ");
            f2.setName("Gill  ");
            f3.setName("sen");

            f1.start();

            f2.start();
            f2.suspend(); //pause

            f3.start();

            f2.resume(); //restart


            //unsuported method



        }
    }
}*/
