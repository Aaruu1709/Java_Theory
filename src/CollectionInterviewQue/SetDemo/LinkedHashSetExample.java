package CollectionInterviewQue.SetDemo;

import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        // Creating LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // add()
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple"); // duplicate (ignored)

        System.out.println("After adding elements:");
        System.out.println(set); // Maintains insertion order

        // contains()
        System.out.println("Contains Banana? " + set.contains("Banana"));

        // remove()
        set.remove("Mango");
        System.out.println("After removing Mango:");
        System.out.println(set);

        // size()
        System.out.println("Size: " + set.size());

        // addAll()
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("Orange");
        set2.add("Grapes");

        set.addAll(set2);
        System.out.println("After addAll:");
        System.out.println(set);

        // iteration (for-each loop)
        System.out.println("Iterating using for-each:");
        for(String fruit : set) {
            System.out.println(fruit);
        }

        // iterator()
        System.out.println("Iterating using iterator:");
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // isEmpty()
        System.out.println("Is Empty? " + set.isEmpty());

        // clear()
        set.clear();
        System.out.println("After clear:");
        System.out.println(set);

        System.out.println("Is Empty now? " + set.isEmpty());
    }
}

