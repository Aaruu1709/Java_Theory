package Java_8.Lambda_Expression.implFunctInterface;

interface Calculator{
    void operation(int a,int b);
}
public class FunctionalDemo {
    public static void main(String[] args) {
        Calculator cal=(int x, int y)-> System.out.println(x * 3);
        cal.operation(20,90);

    }
}
