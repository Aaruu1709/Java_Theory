package Synchronization;

class BankAccount{
    private int balance=1000;

    public synchronized void withdraw(int amount){
        if(balance>=amount){
            System.out.println(Thread.currentThread().getName()+ " is widthdrawing "+ amount);
            balance=balance-amount;
            System.out.println("reamining balance :"+ balance);
        }
        else {
            System.out.println(Thread.currentThread().getName()+ " -insufficient balance");
        }
    }
}
public class SynchronizedMethodEx {
    public static void main(String[] args) {
        BankAccount account=new BankAccount();

        //thread 1
        Thread t1=new Thread(()->account.withdraw(700),"Thread 1");

        //thread 2
        Thread t2=new Thread(()->account.withdraw(500),"theard 2");

        t1.start();
        t2.start();
    }
}
