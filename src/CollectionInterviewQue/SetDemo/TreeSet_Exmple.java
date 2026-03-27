package CollectionInterviewQue.SetDemo;
import java.util.*;

public class TreeSet_Exmple {

        public static void main(String[] args) {

            TreeSet<Integer> set = new TreeSet<>();

            set.add(10);
            set.add(20);
            set.add(30);
            set.add(40);

            System.out.println("First: " + set.first());
            System.out.println("Last: " + set.last());

            System.out.println("Higher than 20: " + set.higher(20));
            System.out.println("Lower than 20: " + set.lower(20));

            System.out.println("Ceiling 25: " + set.ceiling(25));
            System.out.println("Floor 25: " + set.floor(25));

            System.out.println("Poll First: " + set.pollFirst());
            System.out.println("Poll Last: " + set.pollLast());

            System.out.println("Final Set: " + set);
        }
    }


