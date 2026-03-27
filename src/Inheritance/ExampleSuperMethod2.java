package Inheritance;

class Parent3{
    void m1(){
        System.out.println("parent m1() method");
    }

}
class  ExampleSuperMethod2 extends Parent3{
    void m1(){
        System.out.println("child m1() method");
    }
    void m2(){
        m1();//this is optional
        super.m1();
        System.out.println("child m2() method");
    }

    public static void main(String[] args) {
        new ExampleSuperMethod2().m2();
    }
}