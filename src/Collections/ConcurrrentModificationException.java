package Collections;

import java.util.ArrayList;

public class ConcurrrentModificationException {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for(Integer num:list){
            if(num==20){
                list.remove(num);//modify while iterating
            }
        }
        System.out.println(list);
    }
}
