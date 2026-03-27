package CollectionInterviewQue.ListDemo;

import java.util.*;

public class List_Interface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add(1, "Orange");
        System.out.println("List: " + list);

        // Access elements
        System.out.println("Element at index 2: " + list.get(2));

        // Update element
        list.set(0, "Grapes");
        System.out.println("After set: " + list);

        // Remove element
        list.remove("Banana");
        System.out.println("After remove: " + list);
        System.out.println("___________iteration for each___________");

        // 1.Iteration using for each loop
        System.out.println("Iterating list:");
        for(String fruit : list) {
            System.out.println(fruit);
        }

        System.out.println("___________iteration Iterator___________");

        // 2.Iteration using Iterator
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("___________iteration Listiterator___________");

//3.Using ListIterator (forward and backward)
        ListIterator<String> listIt = list.listIterator();
        while(listIt.hasNext()) {
            System.out.println(listIt.next());
        }
        System.out.println("_______________");
        while(listIt.hasPrevious()) {
            System.out.println(listIt.previous());
        }



        // Sublist
        List<String> sub = list.subList(0, 2);
        System.out.println("Sublist: " + sub);
    }
}

