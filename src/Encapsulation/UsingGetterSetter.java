package Encapsulation;

//2️⃣ Encapsulation using Getter & Setter with Validation
class BankAccount{
    private double balance;

    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
        }
        else {
            System.out.println("invalid amount");
        }
    }

    public double getBalance() {
        return balance;
    }
}
public class UsingGetterSetter {
    public static void main(String[] args) {
        BankAccount acc=new BankAccount();
        acc.deposit(-1000);
        acc.deposit(800);
        System.out.println(acc.getBalance());
    }
}
