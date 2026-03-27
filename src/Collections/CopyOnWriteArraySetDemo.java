package Collections;

import java.util.concurrent.CopyOnWriteArraySet;
//        basic example of CopyOnWriteArraySet
public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set=new CopyOnWriteArraySet<>();
        set.add(10);
        set.add(20);
        set.add(40);
        set.add(30);
        set.add(5);
        System.out.println("set : "+ set);
        set.remove(10);
        System.out.println("after remove: "+ set);
        System.out.println("contains 20? "+ set.contains(20));
    }
}
