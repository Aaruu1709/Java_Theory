package Java8ByDurgaSir.Session11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnlyToList {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(10,20,30,40,50);
        Integer[] arr={01,02,03,04};
        List<Integer> list=Arrays.asList(arr);
        System.out.println("arrays list is:"+ list);

        arr[0]=100;
        System.out.println("list of array is: "+list);

        List<Integer> result=l.stream().map(n->n*2).toList();//java 16

        //modifing list
//        result.add(100);//.UnsupportedOperationException
//        result.add(400); // ❌ Not Allowed (Runtime Error)

        System.out.println(result);
    }
}

//collect(Collectors.toList()) returns a mutable list,
// while toList() returns an unmodifiable list introduced in Java 16."


//these are two ways to create list ...but difference is in only mutability
//🔹 Arrays.asList()
// List<Integer> l= Arrays.asList(10,20,30,40,50);
//-suppose here we are going to add new element we got runtime error ..
//it is fixed size
//can not add/remove elements




//🔹 ArrayList
//List<Integer> list=new ArrayList<>();
//        list.add(200); --works fine
//        list.add(90);  --works fine
//✔️ Fully mutable (dynamic size)
//__________________________________________
//If you want mutable list with initial values, do this:
//
//List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30));
//list.add(40); // ✅ Works

//_____________________________________________
//The list created by Arrays.asList() is directly connected to the original array.
//So:
//If you change the array → list also changes
//If you change the list → array also changes
//They are sharing same memory/data.