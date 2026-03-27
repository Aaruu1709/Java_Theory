package Java8ByDurgaSir.Session2;

//interface Test{
//    void onlyTesting();
//}
//
//class Myclass implements Test{
//    public void onlyTesting(){
//        System.out.println("this is implementation class method");
//    }
//}
//public class LambdaWithFunction {
//    public static void main(String[] args) {
//        Myclass c=new Myclass();
//        c.onlyTesting();
//    }
//}
//here we wrire separate class to provide implementation of Test clss
//as we can not create object of implementation class wec ceeare object of child class
//where our implementation is written
//but we know about lammbda expression so insteed of writing separate implementation classs
//we can write lambda expression for this functional interface,,lambda works with functional interface so we can easily write logic direclty where we create object\
//so lambda expression for that impllementation class is
// ()-> System.out.println("this is implementation class method");

//so our code become:
interface Test{
    void onlyTesting();
}


public class LambdaWithFunction {
    public static void main(String[] args) {
//        Myclass c=new Myclass();//here we direclty give our lambda expression

        Test t= ()-> System.out.println("this is imple class mehtod ");
        t.onlyTesting();

    }
}

//👉
//"Earlier, to implement an interface, we had to create a separate
// class and override its method. But using lambda expressions,
// we can directly provide the implementation of a functional interface
// (which has only one abstract method) without creating a separate class.
// This reduces boilerplate code and makes the program more concise."