package Blocks;

public class Example3 {
    Example3(){
        this(10);
        System.out.println("0-args constuctor");
    }
    Example3(int a){
        System.out.println("1-args const");
    }
    {
        System.out.println("instance block");
    }

    public static void main(String[] args) {
        new Example3();
    }
}
