package Inheritance;

class OverloadingExample {
    void display(int a) {
        System.out.println("Integer: " + a);
    }
    void display(String a) {
        System.out.println("String: " + a);
    }
}
public class Que_7 {
    public static void main(String[] args) {

        OverloadingExample myover= new OverloadingExample();
        int a = 90;
        myover.display( a);
    }
}
