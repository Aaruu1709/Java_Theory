package MultiThreadingPractice;
//Example 2: Handling InterruptedException
public class SleepExample2 {
    volatile boolean interrupted=false;

    public static void main(String[] args) {

        Thread thread=new Thread(()->{
          try {
              System.out.println("im going to sleep about 5 seconds");
              Thread.sleep(5000);
          }catch (InterruptedException e){
              System.out.println("ohh my god im so stressed another task interuupted mi ");
          }
        });
        thread.start();//im reaady to sleep

        try{
            Thread.sleep(2000);
            thread.interrupt();

        }catch (InterruptedException e){
            System.out.println("im not able to intruppted that thread");
//Thread.currentThread().interrupt();
}
        if(thread.isInterrupted()){
            System.out.println("ohh sheet ,, im not compled my sleep someone trying to inturupt  me");

        }else {
            System.out.println("IM slept about 5 sec totall");
        }
    }
}
