package CollectionInterviewQue.SetDemo.Thread_safe_Example;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UsingCoolections_Synchronized_Set {
    public static void main(String[] args) {
        Set<Integer> set= Collections.synchronizedSet(new HashSet<>());
        Runnable task=()->{
            for(int i=0;i<5;i++){
                set.add(i);
                System.out.println(Thread.currentThread().getName()+ " added ");

            }
        };

        Thread t1=new Thread(task);
        Thread t2=new Thread(task);

        t1.start();
        t2.start();
    }
}
