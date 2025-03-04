package Inheritance;
//method override is work in inheritance ??


class OverrideParent {
    void display() {
        System.out.println("Parent Display");
    }
}
class OverrideChild extends OverrideParent {
    @Override
    void display() {
        System.out.println("Child Display");  // Overriding
    }
}
public class Que_6 {
    public static void main(String[] args) {
        OverrideChild mychild = new OverrideChild();

        mychild.display();
    }
}
