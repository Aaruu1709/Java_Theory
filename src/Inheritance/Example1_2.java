package Inheritance;

//same variable name:
class Parent2{
    int a=10,b=20;

}
class  Child2 extends Parent2{
    int a=100,b=200;
    void addition(int a,int b){
        System.out.println(a+b);
        System.out.println(this.a+this.b);
        System.out.println(super.a + super.b);

    }
}
public class Example1_2 {
    public static void main(String[] args) {
        Child2 c=new Child2();
        c.addition(1000,2000);
    }
}
