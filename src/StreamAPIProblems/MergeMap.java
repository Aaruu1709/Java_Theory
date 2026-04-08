package StreamAPIProblems;
//Merging Maps with Conflict Resolution
//Given two Map<String, Integer>, merge them into a single map. If a key exists in both, the value should be the sum of the values from both maps.
import java.util.*;
import java.util.stream.*;

public class MergeMap {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 10);
        map1.put("B", 20);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 30);
        map2.put("C", 40);

        Map<String, Integer> result =
                Stream.concat(map1.entrySet().stream(), map2.entrySet().stream())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (v1, v2) -> v1 + v2   // conflict resolution
                        ));

        System.out.println(result);
    }
}
