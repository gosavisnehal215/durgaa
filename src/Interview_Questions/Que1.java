package Interview_Questions;

//using this prperty set name and get name print output
class Emp{
    int Salary;
    String name;
    public int getSalalry(){
        return Salary;
    }
    public String getname(){
        return name;
    }
    public void setName(String n){
        name =n;
    }

}
public class Que1 {
    public static void main(String[] args) {
        //problem 1
        Emp harry =new Emp();
        harry.setName("my name harry");
        System.out.println(  harry.getname());
    }
}
