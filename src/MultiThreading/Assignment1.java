package MultiThreading;

class MyThread6 extends Thread{
    public void run()
    {
        for(int i=0;i<3;i++){
            System.out.println("good morning...."+ Thread.currentThread().getName());
        }
    }
}
public class Assignment1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread6 obj1=new MyThread6();
        MyThread6 obj2=new MyThread6();
        MyThread6 obj3=new MyThread6();


        obj1.start();
        obj1.join();
        obj2.start();
        obj2.join();
        obj3.start();


    }
}
