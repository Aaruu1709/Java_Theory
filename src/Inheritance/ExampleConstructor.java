package Inheritance;

class Parent4{
    Parent4(){
        System.out.println("parent 0-args constructor");
    }
}

 class ExampleConstructor extends Parent4 {
ExampleConstructor(){
    this(10);
    System.out.println("child 0-args constructor");
}
ExampleConstructor(int a){
    super();
    System.out.println("child 1-args constructor"+a);
}

    public static void main(String[] args) {
        new ExampleConstructor();
    }
}
