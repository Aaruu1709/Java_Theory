package Map_Interface.TreeMap;

import java.util.NavigableMap;
import java.util.TreeMap;
public class NavigableMapDemo {
        public static void main(String[] args) {

            NavigableMap<Integer, String> map = new TreeMap<>();

            map.put(10, "A");
            map.put(20, "B");
            map.put(30, "C");
            map.put(40, "D");

            System.out.println("Map: " + map);

            System.out.println("ceilingKey(25): " + map.ceilingKey(25));
            System.out.println("floorKey(25): " + map.floorKey(25));
            System.out.println("higherKey(20): " + map.higherKey(20));
            System.out.println("lowerKey(20): " + map.lowerKey(20));
        }
    }


//Map: {10=A, 20=B, 30=C, 40=D}
//ceilingKey(25): 30
//floorKey(25): 20
//higherKey(20): 30
//lowerKey(20): 10

//---------------------------------------------------------


//🔹 1. ceilingKey(key) → ≥
//If same or bigger exists → return it
//If nothing bigger exists → ❌ returns null
//
//Example:
//
//Keys: 10, 20, 30
//ceilingKey(30) → 30
//ceilingKey(35) → null
//
//🔹 2. floorKey(key) → ≤
//If same or smaller exists → return it
//If nothing smaller exists → ❌ returns null
//
//Example:
//
//floorKey(10) → 10
//floorKey(5) → null
//
//🔹 3. higherKey(key) → >
//Strictly greater only
//If no greater → ❌ null
//
//Example:
//
//higherKey(30) → null
//
//🔹 4. lowerKey(key) → <
//Strictly smaller only
//If no smaller → ❌ null
//
//Example:
//
//lowerKey(10) → null

//| Method  | Equal allowed? | If not found |
//| ------- | -------------- | ------------ |
//| ceiling | ✔ yes          | null         |
//| floor   | ✔ yes          | null         |
//| higher  | ❌ no           | null         |
//| lower   | ❌ no           | null         |
//👉 “Strict methods (higher, lower) never take equal”