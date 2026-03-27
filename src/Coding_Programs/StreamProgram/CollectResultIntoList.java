package Coding_Programs.StreamProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectResultIntoList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,30,40,50);
       List<Integer> even=list.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(even);
    }
}
