package CollectionInterviewQue.ListDemo.ThreadSafe1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedList {
    public static void main(String[] args) throws InterruptedException{
        List<Integer> list= Collections.synchronizedList(new ArrayList<>());

        //thread 1
        Thread t1=new Thread(()->{
            for(int i=0;i<=5;i++){
                list.add(i);
                System.out.println("Thread1 added:"+ i);
            }
        });

        //thread 2
        Thread t2=new Thread(()->{
            for(int i=6;i<=10;i++){
                list.add(i);
                System.out.println("Thread2 added: "+ i);
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // ⚠️ Important: synchronize while iterating

        synchronized (list){
            System.out.println("fianl list:"+ list);
        }
    }
}
