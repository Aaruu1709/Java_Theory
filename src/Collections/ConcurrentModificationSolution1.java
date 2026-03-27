package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationSolution1 {
    //2⃣ Solution 1 (Using Iterator.remove()) ✅
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator<Integer> iterator=list.iterator();
        while (iterator.hasNext()){
            Integer num= iterator.next();

            if(num==20){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
