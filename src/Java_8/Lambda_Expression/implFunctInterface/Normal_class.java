package Java_8.Lambda_Expression.implFunctInterface;

//functional interface
interface MyOperation{
    int operator(int a,int b);
}

//class implementing interface
class Addition implements MyOperation{
    public  int operator(int a,int b){
        return a+b;
    }
}
public class Normal_class {
    public static void main(String[] args) {
        MyOperation obj=new Addition();
        System.out.println(obj.operator(10,5));
    }
}
//Addition class implements the interface.
//
//We override the operate() method.