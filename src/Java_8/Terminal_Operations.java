package Java_8;
import java.util.*;
import java.util.stream.*;
public class Terminal_Operations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 10, 15, 20, 25, 30);

        // 1️⃣ forEach() → When you want to PRINT / side effect
        System.out.println("Using forEach (printing elements):");
        list.stream()
                .filter(x -> x > 10)
                .forEach(x -> System.out.println(x));


        // 2️⃣ collect() → When you want to STORE result
        System.out.println("\nUsing collect (store in list):");
        List<Integer> collectedList = list.stream()
                .filter(x -> x > 10)
                .collect(Collectors.toList());
        System.out.println(collectedList);


        // 3️⃣ collect() → Store in Set (remove duplicates)
        System.out.println("\nUsing collect (store in set):");
        Set<Integer> set = list.stream()
                .collect(Collectors.toSet());
        System.out.println(set);


        // 4️⃣ count() → When you want COUNT
        long count = list.stream()
                .filter(x -> x > 10)
                .count();
        System.out.println("\nCount of elements > 10: " + count);


        // 5️⃣ findFirst() → Get first matching element
        Optional<Integer> first = list.stream()
                .filter(x -> x > 10)
                .findFirst();
        System.out.println("\nFirst element > 10: " + first.orElse(null));


        // 6️⃣ anyMatch() → Check condition
        boolean any = list.stream()
                .anyMatch(x -> x > 25);
        System.out.println("\nAny element > 25: " + any);


        // 7️⃣ allMatch() → Check all elements
        boolean all = list.stream()
                .allMatch(x -> x > 0);
        System.out.println("\nAll elements > 0: " + all);


        // 8️⃣ noneMatch() → Check none match
        boolean none = list.stream()
                .noneMatch(x -> x < 0);
        System.out.println("\nNo element < 0: " + none);


        // 9️⃣ collect() → Grouping (very important 🔥)
        System.out.println("\nUsing collect (grouping):");
        Map<String, List<Integer>> grouped =
                list.stream()
                        .collect(Collectors.groupingBy(x -> (x % 2 == 0) ? "Even" : "Odd"));
        System.out.println(grouped);


        // 🔟 collect() → Joining
        System.out.println("\nUsing collect (joining):");
        String joined = list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(joined);
}
}
