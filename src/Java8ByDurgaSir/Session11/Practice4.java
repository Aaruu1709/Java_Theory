package Java8ByDurgaSir.Session11;

import java.util.List;
import java.util.Arrays;

public class Practice4 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10,15,8,5,55,65,55,99,15);
        List<Integer> result = intList.stream()
                .filter(n -> n > 60 && n < 70)
                .toList();

        System.out.println(result);

    }
}
