package Java8ByDurgaSir.Sesson10;

public class Example1 {
    private int m1(){
        //here we pass parameter then we will get error ...invalid method reference
        for(int i=0;i<10;i++){
            System.out.println("child thread-1");
        }
        return  10;
    }
    public static void main(String[] args) {

        Example1 t1=new Example1();
        Runnable r=t1::m1;
        Thread t=new Thread(r);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread-1");
        }

    }
}
