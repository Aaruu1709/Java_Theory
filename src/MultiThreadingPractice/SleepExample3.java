package MultiThreadingPractice;

class Test1 extends Thread{
    public void run(){

        for(int i=1;i<4;i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);

        }
    }
}
public class SleepExample3 {
    public static void main(String[] args) throws InterruptedException {
        Test1 t1=new Test1();
        Test1 t2=new Test1();
        t1.start();
        t2.start();


    }
}
