package Encapsulations;

class ATM{
    private double balance;

    //constructor
    public ATM(double initialBalance){
        this.balance=initialBalance;
    }
    //Getting for balance
    public double getBalance(){
        return balance;
    }
    //Desposit method
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited:$"+ amount);}
        else{
            System.out.println("Insufficient blalnce or invaild amount !");

        }
    }
    public void withdraw(int i) {
    }
}


public class EncasulationEx {
    public static void main(String[] args) {
        ATM myATM = new ATM(5000);

        System.out.println("Current Balance: $" + myATM.getBalance());

        myATM.deposit(1500);
        System.out.println("Balance after deposit: $" + myATM.getBalance());

        myATM.withdraw(3000);
        System.out.println("Balance after withdrawal: $" + myATM.getBalance());

        // Attempting an invalid transaction
        myATM.withdraw(4000);
    }
}
