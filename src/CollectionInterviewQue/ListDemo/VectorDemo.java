package CollectionInterviewQue.ListDemo;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Mango");

        System.out.println("Vector: " + vector);
        vector.add(1, "Orange");
        System.out.println("After adding at index 1: " + vector);
        vector.remove("Banana");
        System.out.println("After removing Banana: " + vector);
    }
}

//Definition / Overview
//------------------------------------------
//Vector is a resizable array in Java.
//Part of java.util package.(java 1.0 v)
//Legacy class (introduced before Java Collections Framework) but still widely used.
//Synchronized, meaning thread-safe.
//Characteristics / Features
//Stores ordered collection of elements (insertion order is maintained).
//Allows duplicate elements.
//Dynamic size: grows automatically when needed.
//Synchronized: safe in multithreaded environments.
//Implements List interface, so supports all List operations.
//Allows null elements.

//Important Methods:
//| Method                      | Description                              |
//| --------------------------- | ---------------------------------------- |
//| `add(E e)`                  | Adds element at end                      |
//| `add(int index, E element)` | Adds element at specific index           |
//| `remove(int index)`         | Removes element at index                 |
//| `remove(Object o)`          | Removes first occurrence of object       |
//| `get(int index)`            | Returns element at index                 |
//| `set(int index, E element)` | Replaces element at index                |
//| `size()`                    | Returns number of elements               |
//| `contains(Object o)`        | Checks if element exists                 |
//| `isEmpty()`                 | Checks if vector is empty                |
//| `iterator()`                | Returns an iterator to traverse elements |

//_____________________________________________


//🔹 4. Capacity Example (Vector)
//import java.util.Vector;
//
//public class VectorCapacityExample {
//    public static void main(String[] args) {
//        Vector<Integer> vec = new Vector<>(3); // initial capacity = 3
//        vec.add(1);
//        vec.add(2);
//        vec.add(3);
//        System.out.println("Size: " + vec.size());       // 3
//        System.out.println("Capacity: " + vec.capacity()); // 3
//
//        vec.add(4); // exceeds capacity → doubles internally
//        System.out.println("Size after adding 4th: " + vec.size());   // 4
//        System.out.println("Capacity after adding 4th: " + vec.capacity()); // 6
//    }
//}

//Size: 3
//Capacity: 3
//Size after adding 4th: 4
//Capacity after adding 4th: 6

//Vector doubles capacity automatically when full.
//ArrayList increases capacity by 1.5 times internally

//🔹 5. Interview Key Points
//ArrayList / Vector / Stack: Have capacity and size; LinkedList only has size.
//Load factor is only for hash-based collections (HashMap, HashSet), not List interface implementations.
//Vector vs ArrayList growth:
//Vector doubles capacity
//ArrayList grows by 50%
//Stack inherits Vector capacity because it extends Vector.
//LinkedList: No capacity concept; dynamic memory allocation.

//?“In List implementations like ArrayList, Vector, or Stack,
//? we have size and capacity. Capacity is the maximum number of
// ?elements the array can hold before resizing. Vector doubles capacity,
// ?ArrayList grows by 1.5 times. LinkedList has no capacity because it
// ?uses nodes. Load factor exists only in hash-based collections like
// ?HashMap and HashSet,
// ?not in List interface implementations.”