package Synchronization;

class BankAccount2{
    private int balance=1000;

    //method using synchronized block
    public void withdraw(int amount){
        // Critical section: only one thread can enter this at a time
 synchronized (this){
     //here..this is the lock object

     if(balance>=amount){
         System.out.println(Thread.currentThread().getName()+ " is withdrawing "+ amount);
         balance=balance-amount;
         System.out.println("reaminng balance is:"+ balance);
     }
     else {
         System.out.println(Thread.currentThread().getName()+ " -insufficient fund");
     }
 }
        // Non-critical code can go here (no lock needed)

        System.out.println(Thread.currentThread().getName()+ "finished trasaction");

    }
}
public class SynchronizedBlockExample {
    public static void main(String[] args) {
        BankAccount2 account2=new BankAccount2();
        Thread t1=new Thread(()->account2.withdraw(700),"Thread1");
        Thread t2=new Thread(()->account2.withdraw(500),"thread 2");
        t1.start();
        t2.start();
    }
}
