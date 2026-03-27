package Collections;
import java.util.*;
public class CollectionsMethod {




        public static void main(String[] args) {

            List<Integer> list = new ArrayList<>();

            // add elements
            list.add(30);
            list.add(10);
            list.add(20);
            list.add(40);
            list.add(20);

            System.out.println("Original List: " + list);

            // sort
            Collections.sort(list);
            System.out.println("Sorted List: " + list);

            // reverse
            Collections.reverse(list);
            System.out.println("Reversed List: " + list);

            // shuffle
            Collections.shuffle(list);
            System.out.println("Shuffled List: " + list);

            // max
            System.out.println("Maximum: " + Collections.max(list));

            // min
            System.out.println("Minimum: " + Collections.min(list));

            // frequency
            System.out.println("Frequency of 20: " + Collections.frequency(list, 20));

            // replaceAll
            Collections.replaceAll(list, 20, 99);
            System.out.println("After Replace: " + list);

            // fill
            //Collections.fill() method to fill every element of a list with the same value.
            List<Integer> fillList = new ArrayList<>(Arrays.asList(1,2,3,4));
            Collections.fill(fillList, 5000);
            System.out.println("Filled List: " + fillList);

            // copy
            List<Integer> dest = new ArrayList<>(Arrays.asList(10,20,30,40));
            Collections.copy(dest, fillList);
            System.out.println("Copied List: " + dest);

            // binarySearch
            Collections.sort(list);
            int index = Collections.binarySearch(list, 30);
            System.out.println("Index of 30: " + index);

            // swap
            System.out.println("list collection: "+list);
            Collections.swap(list, 0, 1);
            System.out.println("After Swap: " + list);

            // rotate
            Collections.rotate(list, 2);
            System.out.println("After Rotate: " + list);

            // disjoint
            List<Integer> list2 = Arrays.asList(100,200);
            System.out.println("Disjoint: " + Collections.disjoint(list, list2));
        }
    }

