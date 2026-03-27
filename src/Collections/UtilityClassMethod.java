package Collections;
import java.util.*;


public class UtilityClassMethod {


        public static void main(String[] args) {

            List<Integer> list = new ArrayList<>();
            list.add(30);
            list.add(10);
            list.add(20);
            list.add(40);

            System.out.println("Original List: " + list);

            // sort()
            Collections.sort(list);
            System.out.println("After sort(): " + list);

            // reverse()
            Collections.reverse(list);
            System.out.println("After reverse(): " + list);

            // shuffle()
            System.out.println("Because shuffle randomly rearranges elements every time.");
            Collections.shuffle(list);
            System.out.println("After shuffle(): " + list);

            // max()
            int max = Collections.max(list);
            System.out.println("Max element: " + max);

            // min()
            int min = Collections.min(list);
            System.out.println("Min element: " + min);

            // binarySearch() (works correctly only on sorted list)
            Collections.sort(list);
            int index = Collections.binarySearch(list, 20);
            System.out.println("Index of 20 using binarySearch(): " + index);

            // frequency()
            list.add(20);
            int freq = Collections.frequency(list, 20);
            System.out.println("Frequency of 20: " + freq);

            // swap()
            Collections.swap(list, 0, 2);
            System.out.println("After swap(): " + list);

            // fill()
            List<Integer> fillList = new ArrayList<>(Arrays.asList(1,2,3,4));
            Collections.fill(fillList, 100);
            System.out.println("After fill(): " + fillList);

            // copy()
            List<Integer> src = Arrays.asList(5,6,7);
            List<Integer> dest = new ArrayList<>(Arrays.asList(0,0,0));
            Collections.copy(dest, src);
            System.out.println("After copy(): " + dest);

            // synchronizedList()
            List<Integer> syncList = Collections.synchronizedList(list);
            System.out.println("Synchronized List: " + syncList);
        }
}
