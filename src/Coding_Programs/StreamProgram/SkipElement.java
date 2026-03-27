package Coding_Programs.StreamProgram;

import java.util.Arrays;
import java.util.List;

public class SkipElement {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,30,40,50,60);
       list.stream().skip(2).forEach(System.out::println);
    }
}
