package CollectionInterviewQue.SetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        //creating set
        Set<Integer> set1=new HashSet<>();

        //add()
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(10);// duplicates are ignored
//        set1.add("aaruu");//only integer allowed , compile time error

        System.out.println("set1:"+ set1);

        //contains()
        System.out.println("Contains 20 :"+ set1.contains(20));

        //size()
        System.out.println("Size:"+ set1.size());

        //remove
        set1.remove(20);
        System.out.println("After remoin 20: "+ set1);

        //addAll()
        Set<Integer> set2=new HashSet<>();
        set2.add(30);
        set2.add(40);
        set2.add(50);


        set1.addAll(set2);
        System.out.println("After addAll:"+ set1);

        //containsAll
        System.out.println("containsAll Set2? :"+ set1.containsAll(set2));

        //retainAll()
        set1.retainAll(set2);
        System.out.println("After retainAll: " + set1);

        // removeAll()
        set1.removeAll(set2);
        System.out.println("After removeAll: " + set1);

        // isEmpty()
        System.out.println("Is Empty? " + set1.isEmpty());

        // add again for iteration
        set1.add(100);
        set1.add(200);
        // iterator()
        System.out.println("Iterating:");
        Iterator<Integer> it = set1.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());

            // clear()
            set1.clear();
            System.out.println("After clear: " + set1);
        }
        }

    }

