package Coding_Programs.StreamProgram;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenFromList {
    public static void main(String[] args) {
        List<Integer> evenNumber= Arrays.asList(10,15,20,25,30,40,35);
         List<Integer> EvenResult=evenNumber.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(EvenResult);
        System.out.println("__________________find sum of this even is_____________");

        Integer sum=EvenResult.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum of even number is: "+sum);
    }
}
