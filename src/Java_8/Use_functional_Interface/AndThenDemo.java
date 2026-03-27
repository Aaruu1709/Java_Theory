package Java_8.Use_functional_Interface;

import java.util.function.Function;

public class AndThenDemo {
    public static void main(String[] args) {
        Function<Integer,Integer>multiplyBy2=x->x*2;
        Function<Integer,Integer> square=x->x*x;
        Function<Integer,Integer>result=multiplyBy2.andThen(square);
        System.out.println(result.apply(3));
    }
}
