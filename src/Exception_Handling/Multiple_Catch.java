package Exception_Handling;

public class Multiple_Catch {

    public static void main(String[] args) {
        try{
            int arr[]={10,20,30};
            System.out.println(arr[5]);//this array index is outoff boundry
        }catch (ArithmeticException e){
            System.out.println("Arthematic Exception occurred");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception occured");
        }catch (Exception e){
            System.out.println("some other exception occrured.");
        }
    }
}
