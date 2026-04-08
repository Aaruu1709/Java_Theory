package StreamAPIProblems;
//Flatten nested list using flatMap
//Like this: [[a,b],[c,d],[e]] —> [a,b,c,d,e]
import java.util.*;
import java.util.stream.*;

public class FlattenMap {
    public static void main(String[] args) {

        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e")
        );

        List<String> flatList = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flatList);
    }
}
