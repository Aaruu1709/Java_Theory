package Java8ByDurgaSir.Session11;

import java.util.List;
import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,5,55,65,55,99,15);


        int xy = list.stream()
                .sorted((x, y) -> y - x)
                .distinct()
                .skip(2)
                .findFirst()
                .get();
        System.out.println(xy);
    }
}


