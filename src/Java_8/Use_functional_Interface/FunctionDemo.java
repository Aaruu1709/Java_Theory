package Java_8.Use_functional_Interface;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer,Integer> square=x->x*x;
        System.out.println(square.apply(5));
    }
}
