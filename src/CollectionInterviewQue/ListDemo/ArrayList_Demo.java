package CollectionInterviewQue.ListDemo;

import java.util.ArrayList;

public class ArrayList_Demo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add(1, "Orange"); // Add at index 1
        System.out.println("ArrayList: " + fruits);

        // Access element
        System.out.println("Element at index 2: " + fruits.get(2));

        // Update element
        fruits.set(0, "Grapes");
        System.out.println("After set: " + fruits);

        // Remove element
        fruits.remove("Banana");
        System.out.println("After remove: " + fruits);

        // Iterate
        System.out.println("Iterating ArrayList:");
        for(String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
//*Use Iterator’s remove() method for safe modification.
//*Or use CopyOnWriteArrayList for concurrent modification.

//🔹 2. ArrayList – Interview Points
//Definition
//ArrayList is a resizable array implementation of List interface.
//Part of java.util package.
//Dynamic size, maintains insertion order, allows duplicates.
//Key Characteristics / Features
//Backed by a dynamic array.
//Allows null values.
//Indexed access – get, set operations are fast (O(1)).
//Non-synchronized – not thread-safe (use Vector if needed).
//Capacity increases automatically when the array is full (growth factor 1.5x).
//Implements RandomAccess interface – fast access by index.
//Important Methods
//Inherited from List interface:
//add(), get(), set(), remove(), size(), contains(), subList(), iterator().
//ArrayList-specific:
//ensureCapacity(int minCapacity) → Increase capacity manually
//trimToSize() → Reduce capacity to match size
//_______________________________________________________________


//| Exception                         | Cause                     | Example                    |
//| --------------------------------- | ------------------------- | -------------------------- |
//| `IndexOutOfBoundsException`       | Access invalid index      | list.get(size)             |
//| `NullPointerException`            | Operation on null element | list.get(0).length()       |
//| `ConcurrentModificationException` | Modify while iterating    | for-each loop + list.add() |
//| `ClassCastException`              | Wrong type casting        | raw ArrayList              |
//| `OutOfMemoryError`                | Too many elements         | infinite add() loop        |


//____________________________________________________________________
//🔹 1. What is Capacity in ArrayList?
//Capacity = maximum number of elements the ArrayList can hold
// internally before resizing.
//Size = number of elements actually stored in the ArrayList.
//Default capacity = 10 (if not specified).
//
//Example:
//
//ArrayList<String> list = new ArrayList<>();
//System.out.println("Size: " + list.size());       // 0
// Capacity is internal (default 10)


//🔹 2. What is ensureCapacity()?
//Purpose: Ensure ArrayList can hold at least the specified number of elements without resizing.
//Why use it? To improve performance if you know a large number of elements will be added, so ArrayList doesn’t resize multiple times.
//
//Syntax:
//
//list.ensureCapacity(minCapacity);

//import java.util.ArrayList;
//
//public class EnsureCapacityExample {
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(5); // initial capacity 5
//        System.out.println("Initial capacity: 5 (implicit)");
//
        // Ensure capacity at least 20
//        list.ensureCapacity(20);
//
//        for(int i = 1; i <= 15; i++) {
//            list.add(i);
//        }
//
//        System.out.println("Size: " + list.size()); // 15
//        System.out.println("Elements: " + list);
//    }
//}



//🔹 3. Automatic Capacity Increase (Growth Factor)
//?Growth factor = 1.5× current capacity
//?Example: current capacity = 10 → new capacity = 10 * 1.5 = 15 (internally rounded to int).
//?Vector behaves differently: doubles capacity.
//If ArrayList runs out of capacity, it resizes automatically.
//Growth factor = 1.5 times the current capacity (approx).
//Vector doubles capacity; ArrayList grows by 50%.
//
//Example:

//import java.util.ArrayList;

 class CapacityIncreaseExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(3); // initial capacity = 3

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Size: " + list.size());   // 3
        // Capacity internally = 3 (initial)

        list.add(4); // exceeds capacity → grows automatically
        // New capacity = 3 * 1.5 = 4 (rounded to integer internally)

        list.add(5); // exceeds new capacity → grows again
        // New capacity = previous capacity * 1.5

        System.out.println("Size after adding elements: " + list.size());
        System.out.println("Elements: " + list);
    }
}
