package Encapsulations;

class SecureData{
     private String password; //private variable (cannot be accessed directly)
public void setPassword(String password){
    this.password=password;
}
}
public class Que_4_1 {
    public static void main(String[] args) {
        SecureData obj = new SecureData();
        obj.setPassword("krushna999");
    }
}
