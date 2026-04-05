package Map_Interface;
///In Java, the hashCode() method is a part of the Object class and
// is used to generate a hash code value for an object.

import java.util.*;

//class Student {
//    int id;
//    String name;
//
//    Student(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//}
//
//public class HashCode_Method {
//    public static void main(String[] args) {
//
//        Map<Student, String> map = new HashMap<>();
//
//        Student s1 = new Student(1, "Aaruu");
//        Student s2 = new Student(1, "Aaruu"); // logically same as s1
//
//        map.put(s1, "Java Developer");
//
//        System.out.println(map.get(s2)); // ❌ null
//    }
//}
//👉 Java treats them as DIFFERENT objects because:
//
//Default hashCode() → different memory address
//Default equals() → compares reference, not content
//--------------------------------------------------------
//----------------------------------
//✅ FIX: Override hashCode() and equals()

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // logical comparison
    @Override
    public boolean equals(Object o) {
        Student s = (Student) o;
        return this.id == s.id && this.name.equals(s.name);
    }

    // same hash for same data
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class HashCode_Method {
    public static void main(String[] args) {

        Map<Student, String> map = new HashMap<>();

        Student s1 = new Student(1, "Aaruu");
        Student s2 = new Student(1, "Aaruu");

        map.put(s1, "Java Developer");

        System.out.println(map.get(s2)); // ✅ Java Developer
    }
}
//👉 Because Java does NOT understand your object logic automatically.
//
//Without override:
//Java checks memory address ❌
//With override:
//Java checks actual data (id, name) ✔

//“We override hashCode() and equals() when using custom
// objects as keys in Map because default implementation compares
// memory addresses. By overriding, we define logical equality based
// on object data, ensuring
// correct retrieval from hash-based collections like HashMap.”

//“hashCode() is not used to directly retrieve values from a Map.
// It is used to determine the bucket location where the key-value
// pair is stored. After finding the bucket using hashCode, equals()
// is used to find the exact key, and then the value is returned.”