package Java_8.Use_functional_Interface;

import java.util.function.Function;

public class FunctionDemo2 {
    public static void main(String[] args) {
        Function<Integer,String> getGrade=marks-> {
            if (marks >= 90) return "A";
            else if (marks >= 75) return "B";
            else return "C";
        };

        System.out.println(getGrade.apply(80));
    }
}
