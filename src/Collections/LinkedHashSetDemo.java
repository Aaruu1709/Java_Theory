package Collections;

import java.util.LinkedHashSet;

//maintain insertion order
//uses hashtable + linkedList internally
//no duplicates allowed
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet <Integer> set=new LinkedHashSet<>();
        set.add(10);
        set.add(5);
        set.add(20);
        set.add(30);
        set.add(30);
        set.add(null);
        set.add(null);

        System.out.println("linkedlist: "+set);
    }

}
