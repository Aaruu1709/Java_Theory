package Java8ByDurgaSir.Session11;

import java.util.ArrayList;
import java.util.Comparator;

public class MinMax {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(0);
        list.add(15);
        list.add(5);
        list.add(20);
        System.out.println(list);
//        Integer min=list.stream().min((i1,i2)->-i1.compareTo(i2)).get();
       Integer min=list.stream().min(Comparator.reverseOrder()).get();
        System.out.println(min);

//        Integer max=list.stream().max((i1,i2)->-i1.compareTo(i2)).get();
        Integer max=list.stream().max(Comparator.reverseOrder()).get();
        System.out.println(max);


    }
}

//"When we reverse the comparator, the behavior of min() and max() also reverses.
// So min() gives the maximum value and max() gives the minimum value."

//👉 Comparator decides the ORDER
//👉 min() / max() decide WHAT to pick from that order

//🔥 Without comparator
//list.stream().min(Integer::compareTo); // smallest
//list.stream().max(Integer::compareTo); // largest
//
//🔥 With reverse comparator
//list.stream().min(reverseComparator); // largest
//list.stream().max(reverseComparator); // smallest
//
//🧠 Final Understanding
//
//👉 -i1.compareTo(i2)
//= HOW to compare
//
//👉 min() / max()
//= WHAT to return
//
//🎯 Interview Answer
//
//"Comparator defines the ordering logic,
// while min() and max() decide whether
// to pick the smallest or largest element based on that logic."
//
//⚡ One-Line Memory Trick
//Comparator = rule
//min/max = decision

//_______________________________________________________
