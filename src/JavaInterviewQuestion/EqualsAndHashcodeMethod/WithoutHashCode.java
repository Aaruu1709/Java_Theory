package JavaInterviewQuestion.EqualsAndHashcodeMethod;

import java.util.HashSet;

class Employee2 {
    int id;
    String name;

    @Override
    public boolean equals(Object obj) {
        Employee2 e = (Employee2) obj;
        return this.id == e.id && this.name.equals(e.name);
    }
}
public class WithoutHashCode {
    public static void main(String[] args) {
        Employee2 e1 = new Employee2();
        e1.id = 1;
        e1.name = "Rahul";

        Employee2 e2 = new Employee2();
        e2.id = 1;
        e2.name = "Rahul";

        HashSet<Employee2> set = new HashSet<>();
        set.add(e1);
        set.add(e2);

        System.out.println(set.size()); // 2 ❌
    }
}

//💻 Case 5: With hashCode (Correct)
//import java.util.*;
//
//class Employee {
//    int id;
//    String name;
//
//    @Override
//    public boolean equals(Object obj) {
//        Employee e = (Employee) obj;
//        return this.id == e.id && this.name.equals(e.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        Employee e1 = new Employee();
//        e1.id = 1;
//        e1.name = "Rahul";
//
//        Employee e2 = new Employee();
//        e2.id = 1;
//        e2.name = "Rahul";
//
//        HashSet<Employee> set = new HashSet<>();
//        set.add(e1);
//        set.add(e2);
//
//        System.out.println(set.size()); // 1 ✅
//    }
//}