package Coding_Programs.StreamProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareEx {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,30,20,3,04,05,60);
        List <Integer> square=list.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(square);
    }
}
