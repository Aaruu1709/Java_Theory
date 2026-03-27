package MultiThreadingPractice;

public class ThreadNaming extends Thread{
    public void run(){
        System.out.println("running....");
    }
    public static void main(String[] args) {
        ThreadNaming t1=new ThreadNaming();
        ThreadNaming t2=new ThreadNaming();

        System.out.println("name of t1:" + t1.getName());
        System.out.println("name of  t2:"+ t2.getName());
        t1.setName("aaruus Thread");
        System.out.println("after cahnging name of t1:"+ t1.getName());

        t1.start();
        t2.start();


    }
}
