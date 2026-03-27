package Coding_Programs.StreamProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,30,40,30,40,60,5,5);
     List<Integer> result=   list.stream().distinct().collect(Collectors.toList());
        System.out.println(result);
    }
}
