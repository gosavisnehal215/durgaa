package CollectionPractiseProgramns.ListInterFace;
// add element

public class ArrayList {

    public static void main(String[] args) {

        java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();

        //add element
        list.add(99);
        list.add(98);
        list.add(96);

        System.out.println(list);

        //get element
        int element=list.get(2);
        System.out.println(element);
    }
}
