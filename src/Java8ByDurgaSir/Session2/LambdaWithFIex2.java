package Java8ByDurgaSir.Session2;

//interface Test2{
//    void m1(int a,int b);
//
//}
//class MyClass implements Test2{
//    public void m1(int a,int b){
//        System.out.println("addidition of a & b: " + (a+b));
//    }
//}
//public class LambdaWithFIex2 {
//    public static void main(String[] args) {
//        MyClass m=new MyClass();
//        m.m1(10,20);
//
//
//    }
//}


//using lambda expression:
//we only need iterface and main
interface  Test2{
    int m1(int a, int b);
}
class LambdaWithFIex2{
    public static void main(String[] args) {
        Test2 t=(a,b)-> {

            System.out.println("My addition of a+b: "+ (a+b));
            return a+b;
        };
        t.m1(100,300);
    }
}