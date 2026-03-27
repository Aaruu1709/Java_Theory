package Collections;

import java.util.*;

public class ArrayListUnsafeExample {

//    static List<String> transactions = new ArrayList<>();


    static List<String> transactions =
            Collections.synchronizedList(new ArrayList<>());
    public static void main(String[] args) {

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                transactions.add(Thread.currentThread().getName() + " Txn " + i);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {}
        synchronized(transactions) {
            for (Object obj : transactions) {
                System.out.println(obj);
            }
        }


        synchronized (transactions){
            System.out.println("totaltransaction:"+transactions.size());
        }
//        System.out.println("Total transactions: " + transactions.size());
    }
}
