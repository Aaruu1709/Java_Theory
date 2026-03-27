package Java_8.Lambda_Expression.implFunctInterface;

interface MyOperation2{
    int operate(int a,int b);
}
public class AnonymousClass {
    public static void main(String[] args) {
        MyOperation2 obj=new MyOperation2() {
            @Override
            public int operate(int a, int b) {
                return a+b;
            }
        };
        System.out.println(obj.operate(20,04));
    }
}
