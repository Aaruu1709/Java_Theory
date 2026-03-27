package Blocks;


public class Example1 {
    Example1(){
        System.out.println("0-args constructor");
    }
    Example1(int a){
        System.out.println("1-args constructor");
    }
    {
        System.out.println("instance block");
    }
    static {
        System.out.println("static block");
    }


    public static void main(String[] args) {
        new Example1();
        new Example1(10);
    }
}

