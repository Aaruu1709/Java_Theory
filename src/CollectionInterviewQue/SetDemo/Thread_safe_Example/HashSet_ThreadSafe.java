package CollectionInterviewQue.SetDemo.Thread_safe_Example;
//🔹 1. HashSet → Thread-safe

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashSet_ThreadSafe {
    public static void main(String[] args) throws InterruptedException {
        Set<Integer> set= ConcurrentHashMap.newKeySet();//first way

//        Set<Integer> set = Collections.synchronizedSet(new HashSet<>());//second way-slow

        Runnable task=()->{
            for(int i=0;i<=5;i++){
                set.add(i);
                System.out.println(Thread.currentThread().getName()+"added....");
            }
        };

        Thread t1=new Thread(task,"thread 1");
        Thread t2=new Thread(task,"thread 2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Final Set: " + set);


    }
}
