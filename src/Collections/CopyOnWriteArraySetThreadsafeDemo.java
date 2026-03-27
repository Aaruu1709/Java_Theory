package Collections;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetThreadsafeDemo {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set=new CopyOnWriteArraySet<>();
        Thread t1=new Thread(()->{
            for(int i=1;i<=5;i++){
                set.add(i);
                System.out.println("thread added:"+ i);
            }
        });

        Thread t2=new Thread(()->{
           for(int i=3;i<=7;i++){
               set.add(i);
               System.out.println("thread 2: "+i);
           }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("finalset: "+set);
    }
}
