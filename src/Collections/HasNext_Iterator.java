package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HasNext_Iterator {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(80);
        list.add(80);
        list.add(30);
        list.add(40);
        list.add(null);
        list.add(null);
        Iterator<Integer> iterator=list.iterator();
        while (iterator.hasNext()){
            Integer value= iterator.next();
            System.out.println(value);
        }

    }
}
