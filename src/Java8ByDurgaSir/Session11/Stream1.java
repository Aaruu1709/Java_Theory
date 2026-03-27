package Java8ByDurgaSir.Session11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {
        ArrayList<Integer> marks=new ArrayList<>();
        marks.add(0);
        marks.add(5);
        marks.add(10);
        marks.add(30);
        marks.add(3);
        marks.add(50);

        System.out.println("list of marks is:"+ marks);
        List<Integer>updatedMarks=marks.stream().map(n->n+5).collect(Collectors.toList());
        System.out.println(updatedMarks);
        System.out.println("_______________default sorting order)_____________________");

        System.out.println(marks);
        List<Integer>defaultSortedList=marks.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("default sorting is: "+defaultSortedList);

        System.out.println("_________________descending sorting_______________");
        System.out.println(marks);
        List<Integer>descendingSortedList=marks.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("default sorting is: "+descendingSortedList);
    }
}
