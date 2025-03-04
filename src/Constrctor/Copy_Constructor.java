package Constrctor;
class Std2{
    String name;
    int age;

    public void stdInfo(){ //method
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Std2( Std2 s3){// copy construcotr
        this.name=s3.name;
        this.age=s3.age;
    }
    Std2(){

    }
}



public class Copy_Constructor {
    public static void main(String[] args) {
        Std2 s2=new Std2();
        s2.name="krushna";
        s2.age=12;
    }

}
