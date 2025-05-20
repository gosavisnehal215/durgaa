package Exception_Handling;

public class Ex3 {
    public static void main(String[] args) {
        try {
            int[]numbers={1,2,3};
            System.out.println("Array length:" + numbers.length);
            System.out.println(numbers[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array index is outof bound");
        }
    }
}
