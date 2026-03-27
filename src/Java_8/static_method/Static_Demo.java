package Java_8.static_method;

interface A{
     static void sayHello(){
        System.out.println("interface A : hello");
    }

    default void sayBye(){
        System.out.println("interface B : hiiii");
    }
}
public class Static_Demo implements A {
    public static void sayHello(){
        System.out.println("sayHello method in another class not overriden method");
    }
    public static void main(String[] args) {
        Static_Demo s=new Static_Demo();
        s.sayBye();//we can access default method but can't static
        A.sayHello();//we can call static method using interface name
        Static_Demo.sayHello();//accss using its implemented clss its not overriden method

    }
}
