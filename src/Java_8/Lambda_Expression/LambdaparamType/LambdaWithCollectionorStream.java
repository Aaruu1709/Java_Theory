package Java_8.Lambda_Expression.LambdaparamType;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaWithCollectionorStream {
    public static void main(String[] args) {
        ArrayList<String> numbers=new ArrayList<>(Arrays.asList("aaruu","merab","kayra"));

        System.out.println("all list:"+ numbers);
        System.out.println("list with lambda: ");
        numbers.forEach(num-> System.out.println(num));

        System.out.println("list with additional features: ");
        System.out.println("\nNames starting with 'A':");
        numbers.stream()
                .filter(n -> n.startsWith("A"))
                .map(n -> n.toUpperCase())
                .forEach(System.out::println);
    }
}
