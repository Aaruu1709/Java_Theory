package Java8ByDurgaSir.Session4;

interface Test1{
    void m1();
}

public class ThisKeyWordAnonymous{
    int x=10;//instance varible
    public void show(){
        Test1 t=new Test1() {
            int x=20;
            @Override
            public void m1() {
                System.out.println(this.x);
            }
        };
        t.m1();
    }

    public static void main(String[] args) {
        new ThisKeyWordAnonymous().show();
    }
}

///👉 this refers to anonymous class object