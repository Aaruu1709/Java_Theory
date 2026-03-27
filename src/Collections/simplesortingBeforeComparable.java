package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class simplesortingBeforeComparable {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(15);
        list.add(20);
        list.add(50);

        Collections.sort(list);
        System.out.println("simple sortijng logic: "+list);
    }
}
