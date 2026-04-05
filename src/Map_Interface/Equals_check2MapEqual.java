package Map_Interface;
import java.beans.Introspector;
import java.util.Map;
import java.util.HashMap;
public class Equals_check2MapEqual {
    public static void main(String[] args) {
        //create first hashmap
        //add key-value pairs
        Map<Integer,String>hm1=new HashMap<>();
        hm1.put(1,"hm1");
        hm1.put(2,"hm2");
        hm1.put(3,"hm3");
        hm1.put(4,"hm4");


        //create second hashmap
        //add key-value pair
        Map<Integer,String> hm2=new HashMap<>();
        hm2.put(1,"hm1");
        hm2.put(2,"hm2");
        hm2.put(3,"hm3");
        hm2.put(4,"hm4");

        Map<Integer,String>hm3=new HashMap<>();
        hm3.put(1,"hm1");
        hm3.put(2,"hm3");
        hm3.put(3,"hm2");
        hm3.put(4,"hm4");

        System.out.println("first HashMap:"+hm1);
        System.out.println("second HashMap: "+hm2);
        System.out.println("second HashMap: "+hm3);



        //now comapre the first and second hashMap for equality
        System.out.println("hm1===hm2  Are the Map equal? "+hm1.equals(hm2));

        //now compare first and the third hashmap for equality

        System.out.println("hm1===hm3  Are the map are equals? "+ hm1.equals(hm3));

    }
}


//The equals() method of Map interface in Java is used to check if
// two maps are equal. Two maps are considered equal if they meet the following
// conditions:
//Both maps must have the same size.
//Both maps must contain identical key-value pairs.
//“Two Maps are equal only if they have the same size and
// exactly the same key-value pairs. The order does not matter,
// but every key must map to the same value in both maps.”

//hm1===hm2  Are the Map equal? true
//hm1===hm3  Are the map are equals? false