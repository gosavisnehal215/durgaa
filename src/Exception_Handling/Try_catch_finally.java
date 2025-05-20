package Exception_Handling;

public class Try_catch_finally {
    public static void main(String[] args) {
        try {
            String text = null;
            System.out.println(text.length());
        }catch (NullPointerException e){
            System.out.println("Null cannot be used like an object!");
        }finally {
            System.out.println("this is always run ");

        }
    }
}
