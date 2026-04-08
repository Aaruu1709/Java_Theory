package StreamAPIProblems;
//Finding First Non-Repeating Character
//Find the first non-repeating character in a string using Streams. If all characters repeat, return an empty Optional.
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharFromString {

    public static Optional<Character> findFirstNonRepeating(String str) {

        Map<Character, Long> freqMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        return freqMap.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
    }

    public static void main(String[] args) {
        System.out.println(findFirstNonRepeating("aabbcdde")); // Optional[c]
    }
}

