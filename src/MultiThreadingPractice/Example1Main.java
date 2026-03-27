package MultiThreadingPractice;
class JoinBankAccount{
    int bankBalance=1000;
    synchronized int withdraw(int wAmount){
        bankBalance=bankBalance-wAmount;
        return bankBalance;
    }
}

class Customer extends Thread{
    JoinBankAccount bank;
    Customer(JoinBankAccount bank){
        this.bank=bank;
    }

    public void run(){
        bank.withdraw(600);
        System.out.println("withdraw successfully from"+ Thread.currentThread().getName()+" : "+bank.bankBalance);
    }
}
public class Example1Main {
    public static void main(String[] args) throws InterruptedException {
        JoinBankAccount bank=new JoinBankAccount();
        Customer c1=new Customer(bank);
        Customer c2=new Customer(bank);
        System.out.println("exceutee before start:"+bank.bankBalance);

        c1.start();
        c2.start();

        c1.join();
        c2.join();
        System.out.println("remaininng balance is:"+ bank.bankBalance);
    }
}


//600 withdraw
// 1000-600=400  thread 1 withdraw
//400-600=-200    thread 2 withdraw