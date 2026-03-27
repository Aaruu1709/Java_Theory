package Collections;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationExcesolu2 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        for(Integer num: list){
            if(num==20){
                list.remove(num);
            }
        }
        System.out.println(list);

    }
}
