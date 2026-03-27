package Java8ByDurgaSir.Session11;

import java.util.Arrays;
import java.util.List;

public class AsList {
    public static void main(String[] args) {
        Integer[] arr={10,20,30,40};
//        String[] arr2={"aaruu", "saruu","paruu"};
        List<Integer> list= Arrays.asList(arr);

        arr[0]=100;
        System.out.println("print address directly:"+arr);//memory address
        System.out.println("Array:"+ Arrays.toString(arr));
        //In Java, Arrays.toString() is a static utility method used to convert
        // a one-dimensional array into a human-readable string
        System.out.println("List :"+ list);

        System.out.println("___________________________________");


        //change array
        //Changing array also changed list ✅
        list.set(1,500);
        System.out.println("our final updated list is:"+ list);//this original list also change
        System.out.println("Arrays After setting value:"+ Arrays.toString(arr));
        System.out.println("list"+ list);

        System.out.println("________________________");
        list.add(500);
        System.out.println("myList:"+ list);//.UnsupportedOperationException

//        ❗ Why add/remove not allowed?
//                Because:
//👉 Array size is fixed
//👉 So list size is also fixed
//        list.add(40); // ❌ Error


    }
}

//The list created by Arrays.asList() is directly connected to the original array.
//So:
//If you change the array → list also changes
//If you change the list → array also changes
//They are sharing same memory/data.