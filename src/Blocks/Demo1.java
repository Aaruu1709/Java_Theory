package Blocks;

class Test {

    static {
        System.out.println("demo class static block");
    }

    public Test() {
        // default constructor
    }

    void wish() {
        System.out.println("good morning....");
    }
}

public class Demo1 {

    public static void main(String[] args) throws Exception {

        System.out.println("---- Approach 1: using new keyword ----");
        Test d = new Test();
        d.wish();

        System.out.println("\n---- Approach 2: Reflection (deprecated) ----");
        Class c1 = Class.forName("Blocks.Test"); // FULLY qualified name
        Test t1 = (Test) c1.newInstance();       // deprecated
        t1.wish();

        System.out.println("\n---- Approach 3: Reflection (recommended) ----");
        Class<Test> c2 = (Class<Test>) Class.forName("Blocks.Test");
        Test t2 = c2.getDeclaredConstructor().newInstance();
        t2.wish();
    }
}
