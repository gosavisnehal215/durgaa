package Exception_Handling;

import com.sun.security.jgss.GSSUtil;

public class Nested_Try_catch {
    public static void main(String[] args) {
        try {
            try {
                int num = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("inner catch : csnnot divide by zero ");
            }

            int arr[] = new int[5];
            System.out.println(arr[10]);//this will cause an exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("outer catch : Array index put of bund");
        }
    }
}
