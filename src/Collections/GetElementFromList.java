package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class GetElementFromList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(30);
        list.add(null);
        System.out.println(list);

        //get the element using ListIterator()

        //method 1-using for loop
                for(int i=0;i<list.size();i++){
                    System.out.println("get element using for loop: "+list.get(i));

        }

                //method 2 : using enhance for loop
        for(Integer value:list){
            System.out.println("get using enhanced for loop:"+ value);
        }

        //method 3: iterator
        Iterator<Integer> it= list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //method 4: listIterator
        ListIterator<Integer> li=list.listIterator();
        System.out.println("_________________Hashnext__________");
        while (li.hasNext()){
            System.out.println(li.next());
        }
        System.out.println("_________________Hashprevious__________");

        while (li.hasPrevious()){
            System.out.println(li.previous());
        }

    }
}
