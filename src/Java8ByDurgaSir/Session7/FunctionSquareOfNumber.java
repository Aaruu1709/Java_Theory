package Java8ByDurgaSir.Session7;

import java.util.function.Function;

public class FunctionSquareOfNumber {
    public static void main(String[] args) {
        Function<Integer,Integer> square=x->x*x;

        System.out.println(square.apply(5));//25
        System.out.println(square.apply(10));//100
    }
}
