package MultiThreading;

public class JoinExample extends Thread {
    public void run(){
        System.out.println("child thread running");
    }

    public static void main(String[] args) throws InterruptedException {
        JoinExample je=new JoinExample();
        je.start();
        je.join();
        System.out.println("main thread finished");
    }
}
