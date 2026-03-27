package Inheritance;
//different variable name:to much memory
class Parent{
    int a=10,b=20;
}
class Child extends Parent{
    int m=100,n=200;
    void add(int p,int q){
        System.out.println(" local variable   "+(p+q));
        System.out.println("child variable   "+(m+n));
        System.out.println("instance variable    "+(a+b));
    }
}
public class Example1 {
    public static void main(String[] args) {
        Child c=new Child();
        c.add(1000,2000);

    }
}
