package Encapsulations;
class First{
    private String name;
     public String getName(){
         return  name;
     }
     public void setName( String name){
         this.name=name;
     }
}
public class Basic {
    public static void main(String[] args) {
        First obj= new First();
        obj.setName("krushna");
        System.out.println(obj.getName());
    }
}
