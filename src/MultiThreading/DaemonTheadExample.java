package MultiThreading;


class DaemonThread extends Thread{
    public void run(){
        while(true){
            System.out.println("Daemon thread running");
        }
    }
}
public class DaemonTheadExample {
    public static void main(String[] args) {
        DaemonThread d=new DaemonThread();
        d.setDaemon(true);
        d.start();
        System.out.println("Main thread is ends...");
    }
}
