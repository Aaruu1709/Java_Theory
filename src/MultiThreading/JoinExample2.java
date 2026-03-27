package MultiThreading;

 class MyThread  extends Thread {
    public void run() {
        System.out.println("task started....");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        System.out.println("TAsk Finished...");
    }
}
public  class JoinExample2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t=new MyThread();
        t.start();
        t.join();
        System.out.println("Now main thread continues here");
    }
}
//Task started
//Task completed
//Main thread continues
//📌 Without join():
//
// Main thread may finish before t