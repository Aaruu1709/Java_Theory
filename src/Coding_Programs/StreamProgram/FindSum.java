package Coding_Programs.StreamProgram;

import java.util.Arrays;
import java.util.List;

public class FindSum {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,2,30,40,50,60,8,9);
        System.out.println("original list is: "+ list);
        Integer sum=list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
