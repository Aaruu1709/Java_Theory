package MultiThreading;

class YieldThread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" this is running task");
            Thread.yield();
        }
    }
}
public class YieldExample {
    public static void main(String[] args) {
        YieldThread y1=new YieldThread();
        YieldThread y2=new YieldThread();
        y1.setName("Thread 1");
        y2.setName("Thread 2");

        y1.start();
        y2.start();


    }
}
