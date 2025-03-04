package Encapsulations;

class Std{
    private String stdName;
    private int stdID;

    //construcotr
    public Std(String name ,int id){
        this.stdName=name;
        this.stdID=id;
    }
    public String getStdName(){
        return stdName;
    }
    public int getStdID(){
        return stdID;
    }
}

public class ReadOnly {
    public static void main(String[] args) {
        Std d= new Std("vaish",22);
 //accessing values via getters only (no setter aviable)
 //Cannot access private variable directly
        System.out.println("student name:"+ d.getStdName());
        System.out.println("student id:"+ d.getStdID());
    }
}
