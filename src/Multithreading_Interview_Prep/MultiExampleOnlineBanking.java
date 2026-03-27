package Multithreading_Interview_Prep;


class BankTransaction extends Thread{
    private String transactionName;

    BankTransaction(String name){
        this.transactionName=name;
    }

    public void run(){
        System.out.println(transactionName+ ":Satrted....");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(transactionName+ ":completed");
    }

}
public class MultiExampleOnlineBanking {

    public static void main(String[] args) {
        BankTransaction t1=new BankTransaction("Deposit");
        BankTransaction t2=new BankTransaction("withdrawal");

        t1.start();
        t2.start();
    }
}
