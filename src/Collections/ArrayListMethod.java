package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethod {
    public static void main(String[] args) {
        //creating an arraylist
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(5);
        list.add(null);

        System.out.println("after adding our list is:"+ list);

        System.out.println("__________add elemetn at specific index_______");

        list.add(1,15);
        System.out.println("after add(index,element):"+ list);

        System.out.println("___________addAll()___________");
        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(100);
        list2.add(200);

        list.addAll(list2);
        System.out.println("after AddAll():"+ list);

        System.out.println("___________get()__________");
        System.out.println("get element at index 2: "+ list.get(2));

        System.out.println("_____________set()____________");
        list.set(2,99);
        System.out.println("after set():"+ list);

        System.out.println("___________contains()_____________");
        System.out.println("contains 20?"+ list.contains(20));


        System.out.println("_____________indexOf()______________");
        System.out.println("first index of:"+ list.indexOf(20));

        System.out.println("___________last index of____________");
        System.out.println("last index is :"+ list.lastIndexOf(20));

        System.out.println("__________________size()_____________");
        System.out.println("size of list is:"+ list.size());

        System.out.println("___________remove index____________");
        list.remove(1);
        System.out.println("after remove index:"+ list);

        System.out.println("______________remove object____________");
        list.remove(Integer.valueOf(20));
        System.out.println("after remove(Object ):"+ list);









    }
}
