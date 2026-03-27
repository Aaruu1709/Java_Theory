package Inheritance;

public class ParentChild {
   ParentChild(){
       System.out.println("parent 0-args constructor");
    }
    static {
        System.out.println("parent static block");
    }
    {
        System.out.println("parent instance block");
    }
}

class Child5 extends ParentChild{
    static {
        System.out.println("child static block");
    }
    {
        System.out.println("child instance block");
    }
    Child5(){
        System.out.println("child 0-arg constructor");
    }

    public static void main(String[] args) {
        new Child5();
    }
}