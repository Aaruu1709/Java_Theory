package Java8ByDurgaSir.Session11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Sorting {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("suny");
        l.add("sauruu");
        l.add("piuu");
        l.add("rani");
        l.add("balli");

        //original list
        System.out.println("_______________original list____________");
        System.out.println("original list: "+l);

        //1.normal sorting(Ascending)
        List<String> sortedList=l.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Ascending sorted list: "+ sortedList);

        //2.reverse sorting(Method 2-Lambda)
        List<String> reverse1=l.stream()
                .sorted((s1,s2)->s2.compareTo(s1))
                .collect(Collectors.toList());
        System.out.println("reverse sorted(Lambda):"+ reverse1);

        //3.revere sorting (Method 2-Comparator)
        List<String> reverse2 = l.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("reverse sorted(comparator):"+ reverse2);

        // 4️⃣ Reverse Sorting (Method 3 - Java 16 toList())
        List<String> reverse3 = l.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Reverse Sorted (toList): " + reverse3);

        // 5️⃣ Custom Sorting (Based on Length - Descending)
        List<String> custom = l.stream()
                .sorted((s1, s2) -> s2.length() - s1.length())
                .collect(Collectors.toList());

        System.out.println("Sorted by Length (Desc): " + custom);


    }
}


//.collect(Collectors.toList());
//collect(Collectors.toList()) → Java 8
//toList() → Java 16+
//👉 Both to convert stream → List
//____________________________________________________

//🔸 collect()
//reverse2.add("new"); // ✅ works
//✔️ List is mutable

//🔸 toList()
//reverse3.add("new"); // ❌ error
//❌ List is immutable (read-only)

//"collect(Collectors.toList()) is used in Java 8 to convert
// a stream into a mutable list, whereas toList() is a newer method
// introduced in Java 16 that
// returns an unmodifiable list and provides a shorter syntax."



//"collect(Collectors.toList()) is used to convert the processed
// stream back into a List because streams do not store
// data and require a terminal operation to produce a result."