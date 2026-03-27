package Java8ByDurgaSir.Session11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        Integer[] arr={10,20,30,40,50};
        List<Integer> list=new ArrayList<>(Arrays.asList(arr));
        // change array
        arr[0] = 100;

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("List : " + list);
    }
}
//Array changed ❌
//List did NOT change ✅
//        ✔️ Because ArrayList created a separate copy

//🔥 List.of() vs Arrays.asList()
//Arrays.asList() → older method (Java 8)
//List.of() → new method (Java 9+)
//
//    🔹 2️⃣ Mutability (MOST IMPORTANT ⚠️)
//🔸 Arrays.asList()
//List<Integer> list = Arrays.asList(10, 20, 30);
//list.set(0, 100); // ✅ Allowed
//list.add(40);     // ❌ Error
//✔️ You can modify values
//❌ You cannot add/remove
//👉 called: fixed-size list

//🔸 List.of()
//List<Integer> list = List.of(10, 20, 30);
//list.set(0, 100); // ❌ Error
//list.add(40);     // ❌ Error
//❌ You cannot modify anything
//👉 called: fully immutable list

//🔹 3️⃣ Null Handling ⚠️
//        🔸 Arrays.asList()
//List<Integer> list = Arrays.asList(10, null, 30); // ✅ Allowed
//
//🔸 List.of()
//List<Integer> list = List.of(10, null, 30); // ❌ NullPointerException

//-Connected to original array (shared data)
//-Completely independent
//No connection with array

//| Feature         | Arrays.asList() | List.of() |
//        | --------------- | --------------- | --------- |
//        | Java Version    | Java 8          | Java 9+   |
//        | Add/Remove      | ❌ No            | ❌ No      |
//        | Modify (set)    | ✅ Yes           | ❌ No      |
//        | Null allowed    | ✅ Yes           | ❌ No      |
//        | Backed by array | ✅ Yes           | ❌ No      |
//        | Immutable       | ❌ Partial       | ✅ Fully   |

//Arrays.asList() returns a fixed-size list where elements can be modified
// but not added or removed, while List.of()
//returns a completely immutable list that does not allow null values."

//Arrays.asList() → 📦 Fixed box (you can replace items, but not add/remove)
//List.of() → 🔒 Locked box (nothing can be changed)