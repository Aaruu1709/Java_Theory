package Collections;
//uses hashtable internally
//no duplicated
//no order guarantee
//fast operation
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer>set =new HashSet<>();
        //add()
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(5);
        set.add(5);
        set.add(null);
        set.add(null);

        //duplicate ignored

        System.out.println("hashset: "+ set);

        //contains()
        System.out.println("contains 20?"+ set.contains(20));

        //size()
        System.out.println("size of set :"+set.size());

        //remove
        set.remove(10);

        //isEmpty
        System.out.println("is empty?"+ set.isEmpty());

        //clear()
        set.clear();
        System.out.println("After clear:"+ set);
    }
}
