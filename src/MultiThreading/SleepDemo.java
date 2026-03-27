package MultiThreading;
class MyThread2 extends Thread{
    public void run(){
        for (int i=0;i<=10;i++){
            System.out.println("User defined thread..");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        }
    }
}
public class SleepDemo {
    public static void main(String[] args) {
        MyThread2 m2=new MyThread2();
        m2.start();
    }
}
