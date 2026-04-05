package Map_Interface;
import java.util.*;

//Map in Java can be iterated using entrySet, forEach, keySet, values,
// and Iterator. Among these, entrySet and forEach are the most efficient
// ways. keySet is less efficient due to additional lookup,
// while Iterator is used when safe removal is required.”
public class Map_Iteration_Approaches {

        public static void main(String[] args) {

            // Creating Map
            Map<Integer, String> map = new HashMap<>();

            map.put(1, "A");
            map.put(2, "B");
            map.put(3, "C");

            System.out.println("Original Map: " + map);

            // -------------------------------
            // 1. entrySet() ⭐ BEST (Fast)
            // -------------------------------
            System.out.println("\n--- entrySet() ---");
            for (Map.Entry<Integer, String> e : map.entrySet()) {
                System.out.println(e.getKey() + " " + e.getValue());
            }

            // -------------------------------
            // 2. forEach() ⭐ MODERN (Java 8+)
            // -------------------------------
            System.out.println("\n--- forEach() ---");
            map.forEach((k, v) -> System.out.println(k + " " + v));

            // -------------------------------
            // 3. keySet() ❌ Slower
            // -------------------------------
            System.out.println("\n--- keySet() ---");
            for (Integer key : map.keySet()) {
                System.out.println(key + " " + map.get(key));
            }

            // -------------------------------
            // 4. values() (Only values)
            // -------------------------------
            System.out.println("\n--- values() ---");
            for (String value : map.values()) {
                System.out.println(value);
            }

            // -------------------------------
            // 5. Iterator (Safe removal use)
            // -------------------------------
            System.out.println("\n--- Iterator ---");
            Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();

            while (it.hasNext()) {
                Map.Entry<Integer, String> e = it.next();
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }
    }

