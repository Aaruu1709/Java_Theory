package Map_Interface.HashMap;

import java.util.HashMap;
import java.util.Map;

//A HashMap is a part of Java’s Collection Framework and implements
// the Map interface. It stores elements in key-value pairs,
// where, Keys are unique. and Values can be duplicated.
//Internally uses Hashing, hence allows efficient key-based retrieval
// , insertion, and removal with an average of O(1) time.
//HashMap is not thread-safe, to make it synchronized, use Collections.
// synchronizedMap().
//Insertion order is not preserved in HashMap.
// To preserve the insertion order, LinkedHashMap is used and
// to maintain sorted order, TreeMap is used.
//Hierarchy of HashMap in Java
//It extends AbstractMap and implements the Map Interface.
//Capacity of HashMap
//The capacity of a HashMap is the number of buckets it can hold for storing entries.
//
//new capacity=old capacity×2
//
//Default capacity: Default capacity of hashmap is 16.
//Load factor: 0.75 (default): when 75% of the capacity is filled, the capacity is doubled.
//------------------------------------------------------
//Constructors of Hashmap:
//----------------------------------------------------
//1. HashMap()
//It is the default constructor which creates an instance of
// HashMap with an initial capacity of 16 and a load factor of 0.75.
//HashMap<K, V> hm = new HashMap<K, V>();
//-------------------------------------------------------------
//2. HashMap(int initialCapacity)
//It creates a HashMap instance with a specified initial capacity and load factor of 0.75.
//HashMap<K, V> hm = new HashMap<K, V>(int initialCapacity);
//---------------------------------------------------------------
//3. HashMap(int initialCapacity, float loadFactor)
//It creates a HashMap instance with a specified initial capacity and specified load factor.
//HashMap<K, V> hm = new HashMap<K, V>(int initialCapacity, float loadFactor);
//----------------------------------------------------------------
//4. HashMap(Map map)
//“Create a new HashMap and copy all data from another Map into it”
//You have one notebook 📒
//You create another notebook and copy everything
//HashMap<K, V> hm = new HashMap<K, V>(Map map);
//public class Main {
//    public static void main(String[] args) {
//
//        Map<Integer, String> oldMap = new HashMap<>();
//        oldMap.put(1, "A");
//        oldMap.put(2, "B");

        // Copy constructor
//        HashMap<Integer, String> newMap = new HashMap<>(oldMap);
//
//        System.out.println(newMap);
//    }
//-------------------------------------------------------------

// Methods inherited from class java.util.AbstractMap
//----------------------------------------------------------
//Method
//Description
//equals()
//Compares the specified object with this map for equality.
//hashCode()
//Returns the hash code value for this map.
//toString()
//Returns a string representation of this map.


public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add elements to the HashMap
        hashMap.put("John", 25);
        hashMap.put("Jane", 30);
        hashMap.put("Jim", 35);
        // Iterate through the HashMap
        for(Map.Entry<String,Integer> entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+ "->"+entry.getValue());
        }

    }
}
