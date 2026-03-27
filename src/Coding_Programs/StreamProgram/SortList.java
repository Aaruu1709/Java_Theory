package Coding_Programs.StreamProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(30,40,50,60,9,8,7);
      List <Integer> result=  list.stream().sorted().collect(Collectors.toList());
        System.out.println(result);
    }
}
