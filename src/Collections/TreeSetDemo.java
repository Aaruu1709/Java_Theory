package Collections;

import java.util.TreeSet;

//store element in sortedorder
//uses Red-Black tree internally
//no duplicates
//slower than hashset
public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> set=new TreeSet<>();
        set.add(40);
        set.add(30);
        set.add(10);
        set.add(200);
        System.out.println("treeset , sorted:"+ set);

        //first elememt
        System.out.println("first:"+ set.first());

        //last element
        System.out.println("last :"+ set.last());

        //remove element
        set.remove(30);

        System.out.println("after remove:"+ set);

    }
}
//fast operation: hashset
//maintain insettion orrder: linkedhashset
//sorted element: treeset

