package Java8ByDurgaSir.Session11;

import java.util.Arrays;
import java.util.List;

public class EvenNo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        List<Integer> result= list.stream().filter(n->n%2==0).toList();
        System.out.println(result);
    }
}
