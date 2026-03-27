package AbstractClass;

abstract class AbstractExample1 {
     void m1(){
        System.out.println("Im normal method in abstact class");
    }
   abstract void m2();
     abstract void m3();
     abstract void m4();
}

abstract class Test1 extends AbstractExample1{

    @Override
    void m2() {
        System.out.println("im abstact m2 method");
    }

}

abstract class Test2 extends Test1{
    void m3(){
        System.out.println("im abstract m3 method");
    }
}
class Test3 extends Test2{
    void m4(){
        System.out.println("im abstact m4 method");
    }

    public static void main(String[] args) {
        Test3 t3=new Test3();
        t3.m1();
        t3.m2();
        t3.m3();
        t3.m4();
    }
}
