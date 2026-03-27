package Collections;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(40);
        list.add(50);

        System.out.println(list);

        for (Integer num: list){
            System.out.println(num);
        }

        System.out.println("find maximum no in element");
        int max=list.get(0);
        for (Integer num: list){
            if(num>max){
                max=num;
            }

        }        System.out.println("maximum number is:"+ max);
        System.out.println("________reverse of the number______________");

        Collections.reverse(list);
        System.out.println(list);

        System.out.println("____________remove duplicate from element________________");
        Set<Integer>set=new HashSet<>(list);
        list=new ArrayList<>(set);
        System.out.println(set);
    }



}
