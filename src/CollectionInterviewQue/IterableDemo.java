package CollectionInterviewQue;
import java.util.*;

public class IterableDemo {


        public static void main(String[] args) {
            ArrayList<String> fruits = new ArrayList<>();
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Mango");

            Iterator<String> it = fruits.iterator(); // Create Iterator

            while(it.hasNext()) {  // Check if next element exists
                System.out.println(it.next());  // Get next element
            }
        }
    }
//Iterable is a Java interface.
//--Iterable is an interface in Java that allows a collection
// of elements to be traversed one by one,
//typically using a for-each loop.”
//-Represents a collection of elements that can be traversed one by one.
//-Part of the java.lang package.
//-Has one abstract method: iterator(), which returns an Iterator.
//-Enables enhanced for loop (for-each) to iterate over elements.
//-Implemented by most Collection Framework classes like ArrayList, HashSet, LinkedList.
//
//Key Methods of Iterator:
//| Method      | What it Does                                            | Return Type              |
//| ----------- | ------------------------------------------------------- | ------------------------ |
//| `hasNext()` | Checks if there is a **next element** in the collection | boolean                  |
//| `next()`    | Returns the **next element** in the iteration           | Object (or generic type) |
//| `remove()`  | Removes the **current element** from the collection     | void                     |

//remove() is optional; some implementations may
// throw UnsupportedOperationException.
