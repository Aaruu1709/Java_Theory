package MultiThreading;

class MyThread3 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("user defined thread");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        }
    }
}
public class InterruptDemo {
    public static void main(String[] args) {
        MyThread3 obj=new MyThread3();
        obj.start();
        obj.interrupt();
    }
}
