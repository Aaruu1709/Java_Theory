package Coding_Programs.StreamProgram;

import java.util.ArrayList;
import java.util.List;

public class CountElement {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(60);
        list.add(10);
        list.add(3);

        long count=list.stream().count();
        System.out.println(count);
    }
}
