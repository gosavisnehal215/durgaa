package Multithreding;


class H extends Thread {

    public void run() {
        String name = Thread.currentThread().getName();

        for (int i = 1; i <= 3; i++) {
            System.out.println(name);
            H.yield();

        }

    }

    static class H2 extends Thread{
        public void run() {
            String name = Thread.currentThread().getName();

            for (int i = 1; i <= 3; i++) {
                System.out.println(name);
            }


        }

    public static class Yeild_Method {
        public static void main(String[] args) {
          H h1 = new H();
          H2 h2 = new H2();

            h1.start();
            h2.start();

        }
    }}}