package Java_8.Lambda_Expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpression {
    public static void main(String[] args) {
        List<Integer> marks= Arrays.asList(35,60,20,80,50,90);
        System.out.println("student who passed:");
        marks.stream().filter(m-> m>=50).forEach(System.out::println);



        List<String>names=new ArrayList<>();
        names.add("aaruu");
        names.add("rahul");
        names.add("amit");
        names.add("meerab");

        System.out.println("element in list: "+ names);

        names.sort((a,b)->a.compareTo(b));//lambda
        System.out.println("sorted names: ");

        names.forEach(System.out::println);
    }
}
