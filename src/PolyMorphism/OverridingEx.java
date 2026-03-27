package PolyMorphism;

public class OverridingEx {
    void m1(int a, long l){
        System.out.println("int long method");
    }

    void m1(float f){
        System.out.println("float argument method");
    }
    public static void main(String[] args) {
OverridingEx o=new OverridingEx();
o.m1(10,20l);
o.m1(100,200);
o.m1('a','b');
o.m1((byte)10,(short)20);

o.m1(10.5f);
o.m1(10);
o.m1('a');
//o.m1(10.5);//error:incompatible types:
//        possible lossy conversion from double to float
    }
}
