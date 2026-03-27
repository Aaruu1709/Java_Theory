package Synchroonization;
class Counter2{
    private int count=0;

    public synchronized void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }

}

class MyThread extends Thread{
    Counter2 counter2;
     MyThread(Counter2 counter2){
        this.counter2=counter2;
    }

    public void run(){
         for(int i=0;i<1000;i++){
             counter2.increment();
         }
    }
}
public class WithSync {
    public static void main(String[] args) throws InterruptedException {
        Counter2 counter2=new Counter2();
        MyThread t1=new MyThread(counter2);
        MyThread t2=new MyThread(counter2);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("final result is:"+ counter2.getCount());
    }
}
