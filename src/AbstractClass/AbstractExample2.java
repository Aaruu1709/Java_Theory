package AbstractClass;

abstract class AbstractExample2 {
    abstract int m1(char h,int a);
    abstract  float m2(boolean b);
    abstract  String Login(String username,String password);
}

abstract class Demo1 extends AbstractExample2{
    @Override
    int m1(char h, int a) {
        System.out.println("char and int");
        int example=h+a;
        return example;
    }

}
class Demo2 extends Demo1{

    @Override
    float m2(boolean b) {
        System.out.println("boolean abstact method"+ b);
        return 0;
    }

    @Override
    String Login(String username, String password) {
        System.out.println("Username :"+ username + "   password:"+ password);
        return null;
    }

    public static void main(String[] args) {
        Demo2 d=new Demo2();
        int res1 = d.m1('a', 20);
        System.out.println(res1);

        d.m2(true);
        d.Login("aaruu", "12345");
    }
}