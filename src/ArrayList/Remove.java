package ArrayList;
import java.util.ArrayList;

public class Remove {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Pen");
        items.add("Book");
        items.add("Notebook");
        items.add("Pencil");

        items.remove("Book");


        System.out.println(items);

    }
}
