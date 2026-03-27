package CollectionInterviewQue;
import java.util.*;
import java.util.ArrayList;


//“Array and Collection Framework are both used to store data,
// Array is a fixed-size, language-level structure,
// whereas Collection Framework is a dynamic,
// object-based API providing rich data structures and utilities.”
//Array=>Language-level → built-in, part of Java itself → Array
//Collection=>Library/API → needs import, extra features → Collection

//✅ 1. Size (Most Important)
//Array → Fixed size
//Collection → Dynamic (resizable)
// Array
//int[] arr = new int[3];
//arr[0] = 10;
//arr[1] = 20;
//arr[2] = 30;
// arr[3] = 40; // ❌ Runtime error->.ArrayIndexOutOfBoundsException

// Collection
//ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40); // ✅ No issue


//✅ 2. Data Type Support
//Array → Primitive + Object
//Collection → Only Objects (via Generics)

// Array supports primitive
//int[] arr = {1, 2, 3};
//
// Collection requires wrapper
//ArrayList<Integer> list = new ArrayList<>();
//list.add(1); // autoboxing

//✅ 3. Flexibility & Methods
//Array → No built-in methods
//Collection → Rich API (add, remove, contains)
//💻 Code
// Array
//int[] arr = {10, 20, 30};
// Manual logic needed

// Collection
//ArrayList<Integer> list = new ArrayList<>();
//list.add(10);
//list.remove(0);
//System.out.println(list.contains(10));

//✅ 4. Performance
//Array → Faster (no overhead)
//Collection → Slight overhead (objects + methods)
//Extra memory is used to store the object wrapper (Integer)
//CPU must convert primitive to object and back → takes a little more time

//✅ 5. Type Safety
//Array → Runtime type checking
//Collection → Compile-time type safety (Generics)
//💻 Code
// Collection type safety
//ArrayList<String> list = new ArrayList<>();
// list.add(10); // ❌ Compile-time error

//✅ 6. Length vs Size
//Array → arr.length (property)
//Collection → list.size() (method)

//“In real-world applications, we rarely use raw arrays unless
// size is fixed or performance-critical. For most business logic,
// we use Collection Framework like ArrayList or HashMap
// because they provide
// flexibility, better readability, and built-in operations.”

//🔹 5. When to Use What (Important)
//Use Array:
//Fixed size known
//Performance critical (e.g., low-level systems)
//Use Collection:
//Dynamic data
//Frequent insert/remove
//Business applications



public class Diff_Array_Collection {

        public static void main(String[] args) {

            // ===== ARRAY =====
            System.out.println("Array Example:");

            int[] arr = {10, 20, 30};

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

            // ===== COLLECTION =====
            System.out.println("\nCollection Example:");

            ArrayList<Integer> list = new ArrayList<>();

            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);

            for (Integer num : list) {
                System.out.println(num);
            }

            // Removing element
            list.remove(1);

            System.out.println("\nAfter removal:");
            System.out.println(list);
        }
    }

