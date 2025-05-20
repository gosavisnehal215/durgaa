package Exception_Handling;

public class NullPointerFixed {
    public static void main(String[] args) {
        String name= "krushna";
      //  name.length();

        if (name !=null){
            System.out.println("name length:"  +  name.length());

        }else {
            System.out.println("name is null , can't get lemgth");
        }
    }
}

