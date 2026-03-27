package Interface;

// Interface with many methods
interface Message {
    void m1();
    void m2();
    void m3();
    void m4();
    void m5();
    void m6();
}

// Adapter class: provides empty implementations
abstract class X implements Message {
    public void m1() {}
    public void m2() {}
    public void m3() {}
    public void m4() {}
    public void m5() {}
    public void m6() {}
}

// Class implementing interface directly (must override all methods)
 abstract class Boys implements Message {
    public void m1() { System.out.println("Boys m1"); }
    public void m2() {}
    public void m3() {}
    public void m4() {}
//    public void m5() {}
//    public void m6() {}
}

abstract  class  BoysChild extends Boys{
    public void m6(){

    }

}
class  BoysChild2 extends BoysChild {
    public void m5() {

    }
}



// Class extending adapter class (override only required methods)
class Girls extends X {
    public void m3() {
        System.out.println("Girls m3 only");
    }
}

// Test class
public class AdapterDemo {
    public static void main(String[] args) {

        Message b = new BoysChild2();
        b.m1();

        Message g = new Girls();
        g.m3();
    }
}
