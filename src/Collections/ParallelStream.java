package Collections;
import java.util.*;

public class ParallelStream {
        public static void main(String[] args) {

            List<Integer> list = List.of(1,2,3,4,5);

            System.out.println("Sequential Stream:");
            list.stream().forEach(System.out::println);

            System.out.println("Parallel Stream:");
            list.parallelStream().forEach(System.out::println );
        }

}
