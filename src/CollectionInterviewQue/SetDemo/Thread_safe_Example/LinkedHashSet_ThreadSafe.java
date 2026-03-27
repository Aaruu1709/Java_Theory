package CollectionInterviewQue.SetDemo.Thread_safe_Example;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_ThreadSafe {
    public static void main(String[] args) throws InterruptedException {
        Set<Integer> set= Collections.synchronizedSet(new LinkedHashSet<>());
        Runnable task=()->{
            for(int i=0;i<=5;i++){
                set.add(i);
                System.out.println(Thread.currentThread().getName()+ "added...");
            }
        };

        Thread t1=new Thread(task);
        Thread t2=new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // IMPORTANT: manual synchronization during iteration
        synchronized (set) {
            System.out.println("Final Set: " + set);
        }
    }
}
