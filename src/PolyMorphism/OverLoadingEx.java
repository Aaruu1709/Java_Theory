package PolyMorphism;

public class OverLoadingEx {
    void sum(int a){
        System.out.println(a+a);
    }
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void sum(double d1,double d2){
        System.out.println(d1+d2);
    }
    void sum(int a,float b){
        System.out.println(a+b);
    }

    void sum(float a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
OverLoadingEx o=new OverLoadingEx();
o.sum(10);
o.sum(10,20);
o.sum(1.2,1);
o.sum(10,1.0);
o.sum(10,20,30);
o.sum(20.00,20.00);
    }
}
