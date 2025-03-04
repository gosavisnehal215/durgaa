package Constrctor;
class Std{
    String name;
    int age ;

  public void   printInfo(){
      System.out.println(this.name);
      System.out.println(this.age);
    }

    Std(){//non-parametrized constructor
        System.out.println("I m Student ");
    }
}
public class Non_Parametrized_Constructor {

    public static void main(String[] args) {
        Std s= new Std();
        s.name="krushna";
        s.age=35; 

        s.printInfo();
    }
}





