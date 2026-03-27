package MultiThreading;

public class CreatingTUsingThread extends Thread {
    //override run method
    public void run(){
        //run()=it contain task to run
        System.out.println("creating thread using thread class");
        System.out.println("thread is running state:"+ Thread.currentThread().getName());
    }
    public static void main(String[] args) {

        CreatingTUsingThread t=new CreatingTUsingThread();
        //create new thread and calls run() method
        t.start();//creating new thread
        t.start();//Exception in thread "main" java.lang.IllegalThreadStateException


    }

}

