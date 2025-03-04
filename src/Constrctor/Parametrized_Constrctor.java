package Constrctor;

class Student {
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
}
public class Parametrized_Constrctor {
    public static void main(String[] args) {
        Student s = new Student("krushna", 23);
        s.printInfo();
    }
}
