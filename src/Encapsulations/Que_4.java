package Encapsulations;
//write only Encapsulation (no getter method )

class BankAc {
    private double balance; // private variable

    //setter methodd
    public void setBalance(double amount){
        if(amount > 0){
            balance = amount;
        }
    }
}

public class Que_4 {
    public static void main(String[] args) {
        BankAc b = new BankAc();
        b.setBalance(7000);//sestting values
        // in this case output is not possible because ther eno getter ethod it has only setter method so cant get output.

    }

}
