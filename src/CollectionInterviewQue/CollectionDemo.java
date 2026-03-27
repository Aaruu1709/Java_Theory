package CollectionInterviewQue;


//*-----------------------------------------------------------------
//“Array is a fixed-size data structure,
// while Collection is dynamic and can grow or shrink at runtime.”

//✅ ARRAY (Point-wise)
//Fixed size (cannot grow/shrink) ❌
//Can store primitives + objects
//Faster performance (no extra overhead) ⚡
//Less memory usage
//Limited methods (no built-in operations)
//Not part of Collection Framework
//Can cause runtime errors (not type-safe)


//✅ COLLECTION (Point-wise)
//Dynamic size (can grow/shrink) ✅
//Stores only objects (use wrapper classes)
//Slightly slower (due to extra features)
//More memory usage
//Many built-in methods (add(), remove(), etc.)
//Part of Collection Framework
//Easy to use (ready-made operations)
//Type-safe (with Generics)

//“Arrays are fixed and faster,
// while Collections are dynamic, flexible, and easier to use.”

//? Collections use more memory because they store objects
//? instead of primitives and also extra features like dynamic resizing,
//? storing objects instead of primitives, and they have to manage extra
//? information (like order, uniqueness, or capacity),
//? which adds work every time you add, remove, or search for items."
//? 👉 Array → only data
//? 👉 Collection → data + extra info
//*****************************************************************


//collection:
//collection is group of individual object
//taht are stored and handled together as single unit
//insteed of handling one by one we kept it together and perfrom operation togherth

//________________________________________
//framework:
//set of classes and interface
//provide ready made architecture
//____________
//Java Collection Framework is a set of classes and interfaces
//-it is API
//perform operation
// used to store, manage, and manipulate groups of objects dynamically.
//👉 Before collections:
//Arrays were used
//Problem:
//Fixed size ❌
//No built-in methods ❌
//Not flexible ❌
//👉 So Java introduced Collections to:
//Handle dynamic data
//Provide ready-made data structures
//✅ 2. Key Interfaces (VERY IMPORTANT)
//Collection (root interface)

//   |---- List (ordered, duplicates allowed)
//   |---- Set (no duplicates)
//   |---- Queue (FIFO)
//👉 Map is separate (not part of Collection)
//✅ 3. Characteristics of Collection Framework
//1.dynamic size->grow/shrinks automatically
//2. Stores Objects Only
//Works with Objects (use wrappers for primitives)
//3. Provides Standard Methods
//add, remove, contains, size, etc.
//4. Multiple Data Structures
//List → ordered
//Set → unique
//Queue → processing order
//🔹 5. Supports Iteration
//Using iterator()
//🔹 6. Generic Support
//List<Integer> list = new ArrayList<>();
//🔹 7. Not Thread Safe (by default)
//Need synchronization manually
//_____________________________________________
//✅ 4. Common Methods in Collection
//add(E e)          // insert is used to insert an element in this collection
//remove(Object o)  // It is used to delete an element from the collection
//contains(Object o)// check presence
//size()            //It returns the total number of elements in the collection.
//isEmpty()         // check empty
//clear()           //It removes the total number of elements from the collection.
//addAll()            //It adds all the items from one collection into another collection.
//removeAll()         //deletes all matching elements from your main collection
//removeIf()      //"It removes all items from a collection that match a certain condition
//retainAll()     //"It keeps only the items that are also in another collection and removes everything else
//containsAll()
//🔹 Traversal
//iterator()
//forEach()
//hashCode()  :When you store collections in HashMap or HashSet, Java uses hashCode()
// to quickly locate them.
//Helps in efficient searching, storing, and comparison.
//default Stream<E> parallelStream()  :
//splits the work into multiple threads. For large lists or heavy
// computations, this can finish...
// faster because multiple elements are processed simultaneously.
//Automatic thread management.ex.complex calcualtion and large dataset
//👉 Use collections when:
//
//when we dont know Data size
//Need dynamic storage
//Need built-in operations
//✅ 6. Benefits (VERY IMPORTANT)
//🔥 1. Ready-made Data Structures
//No need to implement manually
//2. Optimized algorithms
//3.Built-in methods
//4.Flexibility
//Switch easily (List → Set)
//✅ 7. Important Implementations
//🔹 List
//ArrayList → fast access
//LinkedList → fast insert/delete
//🔹 Set
//HashSet → fast, no order
//TreeSet → sorted
//🔹 Queue
//PriorityQueue → priority-based
//*_____________________________________________________
//✅ 9. Interview Traps

//*❓ Can we store primitives?
//*👉 ❌ No → use wrapper classes
//*Collections store objects only, not primitive values.
// *🔄 What happens internally?
//*Java does AutoBoxing
//*list.add(10);
//*Actually becomes:
//*list.add(Integer.valueOf(10));

//*🔁 And reverse?
//*int x = list.get(0);
//*👉 Java does Unboxing
//*int x = list.get(0).intValue();



public class CollectionDemo {

}
