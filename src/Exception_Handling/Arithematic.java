package Exception_Handling;

public class Arithematic {
    public static void main(String[] args) {
        try {
            int a= 10/0;
        } catch (ArithmeticException e){
            System.out.println("wait, you can't diivde by zero");
        }
    }
}
