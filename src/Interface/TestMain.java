package Interface;

interface  It1 {
    default void m1() {
        System.out.println("It1 m1() method");
    }
}
    interface It2{
        default void m1(){
            System.out.println("It1 m2() method");
        }
    }


public class TestMain implements It1,It2 {
    public void m1(){
        It1.super.m1();
        It2.super.m1();
        System.out.println("yeah..this is my own method");
    }
    public static void main(String[] args) {
TestMain t=new TestMain();
t.m1();

//t.m2();
    }
}
