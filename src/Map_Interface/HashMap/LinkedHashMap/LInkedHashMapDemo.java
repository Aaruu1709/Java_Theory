package Map_Interface.HashMap.LinkedHashMap;

import java.util.LinkedHashMap;

//LinkedHashMap in Java implements the Map interface of the Collections
// Framework. It stores key-value pairs while maintaining the insertion
// order of the entries. It maintains the order in which elements
// are added.
//Stores unique key-value pairs.
//Maintains insertion order.
//Allows one null key and multiple null values.
//It is not thread-safe; to synchronize it, use Collections.synchronizedMap().
//Declaration of LinkedHashMap
//public class LinkedHashMap<K,v> extends HashMap<K,v> implements Map<K,v>
public class LInkedHashMapDemo {
    public static void main(String[] args){

        // Create a LinkedHashMap of Strings (keys) and Integers (values)
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        // Adding key-value pairs
        lhm.put("Apple", 50);
        lhm.put("Banana", 30);
        lhm.put("Mango", 70);
        lhm.put("Orange", 40);

        // Displaying the LinkedHashMap
        System.out.println("LinkedHashMap: " + lhm);
    }
}
//Internal Working of LinkedHashMap
///LinkedHashMap extends HashMap and implements the Map interface:
//It stores data as nodes similar to a doubly-linked list, maintaining insertion order. Each node contains:
//Before-> key->Value->After
//previous: points to previous element
//next-point to next element
//key-unque identifier
//value- actual data

//--------------------------------------------
//It extends HashMap and maintains a doubly-linked list to preserve the insertion order of elements
