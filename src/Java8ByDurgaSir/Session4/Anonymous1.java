package Java8ByDurgaSir.Session4;


//old way to implement class
//here we needed extra class
//interface  Test
//{
//    void m1();
//}
//
//class MyClass implements Test{
//    public void m1(){
//        System.out.println("helloo");
//    }
//}
//public class Anonymous1 {
//    public static void main(String[] args) {
//        Test t=new MyClass();
//        t.m1();
//    }
//}


//new way- we can write it using anonymous inner class so we do not needed to write separate class
interface Test{
    void m1();
}

public class Anonymous1{
    public static void main(String[] args) {
        Test t=new Test() {
            @Override
            public void m1() {
                System.out.println("hey im anonymous inner class ");
            }
        };
        t.m1();
    }
}

//👍 Advantage:
//No separate class
//👎 Still Problem:
//Syntax is long and complex