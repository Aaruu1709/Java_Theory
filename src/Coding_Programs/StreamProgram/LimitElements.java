package Coding_Programs.StreamProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LimitElements {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(9);
        list.add(4);

      List result=  list.stream().limit(3).collect(Collectors.toList());
        System.out.println(result);
    }
}
