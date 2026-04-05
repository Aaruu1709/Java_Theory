package AbstractClass;

abstract class Test11{
    Test11(){
        System.out.println("welcome to java abstract class");
    }
}
 class Test12 extends Test11{
    Test12(){
        System.out.println("it is possible to create constructor in abstract class");
    }
}
public class Example4 {
    public static void main(String[] args) {
        new Test12();
        //here by using new keyword we can call both method
    }

}
