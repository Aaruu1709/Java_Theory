package Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Iterate_Map_Elem {
    public static void main(String args[]){

        // Initialization of a Map using Generics
        Map<Integer, String> hm1=new HashMap<>();

        // Inserting the Elements
        hm1.put(1, "Geeks");
        hm1.put(2, "For");
        hm1.put(3, "Geeks");

        for (Map.Entry mapElement : hm1.entrySet()) {
            int key = (int)mapElement.getKey();

            // Finding the value
            String value = (String)mapElement.getValue();
            //👉 getKey() returns Object type (Integer)
            //So we convert it into primitive int
            //This is called:
            //👉 Unboxing + Type casting

            System.out.println(key + " : " + value);
        }
    }
}


//Entry = one key-value pair inside a Map
//Example:
//1 = "Geeks"

//What is Map.Entry?
//👉 It is an interface inside Map
//“A structure that holds one key and one value together”
//Map.Entry = (key, value) pair

//What is entrySet()?
//👉 entrySet() returns ALL entries of the Map as a Set
//hm1.entrySet()
//If Map is
//{1=Geeks, 2=For, 3=Geeks}
//Then entrySet gives:
//[1=Geeks, 2=For, 3=Geeks]
//👉 A SET of Entry objects

//why we use entrySet()?"
//✔ Fast
//✔ Efficient
//✔ Gives both key + value together
//✔ Better than keySet + get()

//🔑 What is getKey()?
//👉 It returns the key of that Entry
//Entry = (1, "Geeks")
//getKey() → 1

//🔑 What is getValue()?
//👉 It returns the value of that Entry
//Entry = (1, "Geeks")
//getValue() → "Geeks"