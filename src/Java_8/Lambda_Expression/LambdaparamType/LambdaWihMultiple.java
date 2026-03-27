package Java_8.Lambda_Expression.LambdaparamType;
interface MathCalsy{
    int operation(int a,int b);
}
public class LambdaWihMultiple {
    public static void main(String[] args) {
MathCalsy add=(a,b)  ->a+b;
    MathCalsy mul=(a,b)->a*b;
    MathCalsy sub=(a,b)->a-b;

        System.out.println(add.operation(1,3));
        System.out.println(mul.operation(3,8));
        System.out.println(sub.operation(50,30));
    }

}
