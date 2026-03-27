package Collections;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyonWriteArrayList {



        public static void main(String[] args) {

//            CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

            ArrayList<Integer> list=new ArrayList<>();
            // Adding elements
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);

            System.out.println("Original List: " + list);

            // Iterating and modifying
            for(Integer num : list) {

                System.out.println("Reading: " + num);

                if(num == 20) {
                    list.add(50);   // modifying during iteration
                }
            }

            System.out.println("Final List: " + list);
        }
}
