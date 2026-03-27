package Coding_Programs.StreamProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToUppercase {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("aaruu","saruu","kalu","soma");
        String result= list.stream().map(String::toUpperCase).collect(Collectors.joining(","));
        System.out.println(result);
    }
}
