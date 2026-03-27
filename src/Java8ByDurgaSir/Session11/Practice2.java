package Java8ByDurgaSir.Session11;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Practice2 {
    public static void main(String[] args) {

        List<String> strList = Arrays.asList("Chetan","Ram","Om","Pawan","kartik");
        List<String> result = strList.stream()
                                       .filter(e -> e.length() <3 )
                                       .map(e -> e.toUpperCase())
                                       .collect(Collectors.toList());
        System.out.println(result);
    }
}
