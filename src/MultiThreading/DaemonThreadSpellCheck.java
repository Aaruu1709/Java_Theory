package MultiThreading;

class DaemonWork extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
                System.out.println("im daemon thread...");

            }catch (InterruptedException e){
                e.printStackTrace();

            }
        }
    }
}
public class DaemonThreadSpellCheck {
    public static void main(String[] args) throws InterruptedException {
        DaemonWork d=new DaemonWork();
        d.setDaemon(true);
        d.start();
        System.out.println("user typing");
        Thread.sleep(2000);
        System.out.println("user finish typing");

    }
}
