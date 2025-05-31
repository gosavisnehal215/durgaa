package CollectionPractiseProgramns.ListInterFace;
import java.util.LinkedList;
//add revmove by linklist
public class Linklist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Chery");
        list.add("Kaju");
        list.add("Apple");


        list.remove("Kaju");

        for (String fruit : list) {
            System.out.println(fruit);
        }
    }


}
