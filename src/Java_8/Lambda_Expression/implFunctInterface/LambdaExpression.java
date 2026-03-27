package Java_8.Lambda_Expression.implFunctInterface;

interface MyOperation3{
    int operate(int a,int b);
}

public class LambdaExpression {
    public static void main(String[] args) {
        MyOperation3 obj=(a,b)->a+b;
        System.out.println(obj.operate(10,5));
    }
}


//“A functional interface in Java can be implemented using a
// normal class, an anonymous class, or a lambda expression.
// Lambda expressions are the preferred way because
// they reduce boilerplate code and make the program shorter.”