package Java8ByDurgaSir.Session7;

import java.util.function.Predicate;

public class isEvenPredicate {
    public static void main(String[] args) {
        Predicate<Integer> isEven=x->x%2==0;

        System.out.println(isEven.test(10));//true
        System.out.println(isEven.test(7));//false
    }
}
