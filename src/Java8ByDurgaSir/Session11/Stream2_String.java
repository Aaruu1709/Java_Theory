package Java8ByDurgaSir.Session11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2_String {
    public static void main(String[] args) {
        ArrayList<String> l=new ArrayList<String>();
        l.add("sunny");
        l.add("saruu");
        l.add("paruu");
        l.add("kaluu");
        l.add("ballu");
        System.out.println(l);
        List<String> sortedList=l.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        System.out.println("___________________reverse sorting_______________");

        List<String> reversesortedList=l.stream().sorted((s1,s2)->s2.compareTo(s1))
                .collect(Collectors.toList());
        System.out.println("reverseSortedList:"+ reversesortedList);

        System.out.println("___________________reverse sorting method 2_____________");
        List<String> reverseSortedList = l.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("_______________-method 3____________");
//        🔥 If using Java 16+
                List<String> reverseSortedList2= l.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

//        Bonus (Custom Logic)
//
//        If you want reverse based on length:

//.sorted((s1, s2) -> s2.length() - s1.length())
    }
}
