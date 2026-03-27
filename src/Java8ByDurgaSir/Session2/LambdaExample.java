package Java8ByDurgaSir.Session2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        //creating a list of collection
        List<Integer> numbers=new ArrayList<>();
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(30);
        numbers.add(10);

        // ----------------------------------------------------
        // 1. ITERATING COLLECTION
        // ----------------------------------------------------
        // old way (before java 8)
        System.out.println("old -way: - iterating using for loop:");
        for(Integer n:numbers){
            System.out.println(n);
        }

        //new way(lambda expression)
        System.out.println("lambda way-Iterating");
        numbers.forEach(n-> System.out.println(n));

        // ----------------------------------------------------
        // 2. SORTING COLLECTION
        // ----------------------------------------------------

        //old way(using comapratoe with anonymous class)
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a-b;
            }
        });

        System.out.println("old way- sorted list:");
        System.out.println(numbers);

        //new way(lambda)
        numbers.sort((a,b)->a-b);
        System.out.println("lambda way- sorted list");
        System.out.println(numbers);
        // ----------------------------------------------------
        // 3. FILTERING DATA
        // ----------------------------------------------------

        // OLD WAY (Using Loop)
        System.out.println("old way-number greater than 10:");
        for(Integer n: numbers){
            if(n>10){
                System.out.println(n);
            }
        }

        System.out.println("lambda way- Number greater than 10");
        numbers.stream()
                .filter(n->n>10)
                .forEach(n-> System.out.println(n));


        // ----------------------------------------------------
        // 4. TRANSFORM DATA (MAP)
        // ----------------------------------------------------

        // OLD WAY
        System.out.println("old way-square of numbers:");
        for(Integer n: numbers){
            System.out.println(n*n);
        }

        //new way
        System.out.println("lambda way - sqaure of numbers");
        numbers.stream()
                .map(n->n*n)
                .forEach(n-> System.out.println(n));

        // ----------------------------------------------------
        // 5. PARALLEL PROCESSING
        // ----------------------------------------------------

        // OLD WAY
        System.out.println("old way - sequencial processing");
        for(Integer n: numbers){
            System.out.println(n);
        }

        //new way
        System.out.println("lambda way-parallel processing");
        numbers.parallelStream()
                .forEach(n-> System.out.println(n));


        // ----------------------------------------------------
        // 6. FUNCTIONAL INTERFACE IMPLEMENTATION
        // ----------------------------------------------------

        // OLD WAY (Anonymous Class)
        interface AddOperation{
            int add(int a,int b);
        }


        AddOperation add1=new AddOperation(){
            public int add(int a,int b){
                return a+b;
            }
        };
        System.out.println("old way of addition:"+ add1.add(10,20));

        //new way
        AddOperation add2=(a,b)->a+b;
        System.out.println("lambda way"+ add2.add(10,20));

    }
}

//functional interface
