package Java8ByDurgaSir.Session11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectToList {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(10,20,30,40);
        List<Integer> result=l.stream().map(n->n*2).collect(Collectors.toList());

    result.add(100);
    result.add(200);
        System.out.println(result);
    }
}
