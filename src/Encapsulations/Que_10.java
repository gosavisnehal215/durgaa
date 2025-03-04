package Encapsulations;
// Can we achieve Encapsulation without getters and setters?

class  BankAcc{
    private double balance;

    public BankAcc( double balance){
        this.balance=balance;
    }
    
    public void deposit( double amount){
        if( amount>0){
            balance+= amount;
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount<=balance ){
            balance-=amount;
        }
        else{
            System.out.println("Insufficient funds");

        }

    }
    public void showBalance(){
        System.out.println("Current Balance:" + balance);

    }
}
public class Que_10 {
    public static void main(String[] args) {
        BankAcc obj = new BankAcc(500);
        obj.deposit(200);
        obj.withdraw(100);
        obj.showBalance();
    }
}
