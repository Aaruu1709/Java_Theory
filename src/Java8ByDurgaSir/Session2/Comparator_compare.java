import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Comparator_compare {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(10);
        list.add(25);
        list.add(5);
        list.add(30);
        list.add(15);

        System.out.println(list);

        Comparator<Integer> c = (I1, I2) -> (I1 < I2) ? -1 : (I1 > I2) ? 1 : 0;

        Collections.sort(list, c);

        System.out.println(list);

        list.stream().forEach(System.out::println);

        List<Integer> I2 = list.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(I2);
    }
}
