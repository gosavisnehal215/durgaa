package Inheritance;
// types of inheritance ?????????


// Single Inheritance
class A {
    void methodA() {
        System.out.println("Method of class A");
    }
}
class B extends A {
    void methodB() {
        System.out.println("Method of class B");
    }
}

// Multilevel Inheritance
class C extends B {
    void methodC() {
        System.out.println("Method of class C");
    }
}

// Hierarchical Inheritance
class D extends A {
    void methodD() {
        System.out.println("Method of class D");
    }
}
public class Que_2 {
    public static void main(String[] args) {
        C myc = new C();

        myc.methodA();
        myc.methodB();
        myc.methodC();

        D myd = new D();

        myd.methodD();
        myd.methodA();

    }
}
