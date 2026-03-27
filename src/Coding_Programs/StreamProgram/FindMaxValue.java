package Coding_Programs.StreamProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxValue {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,2,3,4,5,5,50,80);
        Integer maxValue=list.stream().max(Integer::compare).get();
        System.out.println(maxValue);
    }
}
