package Exception_Handling;
//this is simpple example of try catch block
public class EX_2 {
    public static void main(String[] args) {

    try{
        int num = Integer.parseInt("11");
        System.out.println("Number is: "+ num);
    }catch (NumberFormatException e){
        System.out.println("not a valid number");
    }
        System.out.println("program continue");
    }
}
