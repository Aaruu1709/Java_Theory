package Java8ByDurgaSir.Session11;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
public class ClassPracticeEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 8, 5, 55, 65, 55, 99, 15);
         List<Integer> result=list.stream().filter(i->i%2==0).distinct().sorted((a,b)->-a.compareTo(b)).toList();
        System.out.println("result is:" + result);
    }
}
//
//     even, descending, distinct
//List<Integer> inlist = Arrays.asList(10, 15, 8, 5, 55, 65, 55, 99, 15);
//
//List<Integer> res = inlist.stream()
//        .filter(x -> x % 2 == 0)
//        .sorted((a, b) -> b - a)
//        .distinct()
//        .toList();
//
//        System.out.println("result : "  + res);