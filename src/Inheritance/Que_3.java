package Inheritance;
//super keyword ????

class SuperParent {
    int num = 100;
    void show() {
        System.out.println("Parent Method");
    }
}
class SuperChild extends SuperParent {
    int num = 200;
    void display() {
        System.out.println(super.num);  // Access parent variable
        super.show();  // Call parent method
    }
}

public class Que_3 {
    public static void main(String[] args) {
        SuperChild myChild = new SuperChild();

        myChild.display();
    }
}


// conculsion - by using super keyword we won't need to call both
// method parent and child when we use super keyword in child class then
// onlycreate child class object and call child class method automatically vall both class methods.