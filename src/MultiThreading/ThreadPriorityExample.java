package MultiThreading;


class PriorityThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("priority of this thread is:");
        System.out.println(Thread.currentThread().getPriority());
    }
}
public class ThreadPriorityExample {
    public static void main(String[] args) {
        PriorityThread p1=new PriorityThread();
        PriorityThread p2=new PriorityThread();

        p1.setName("This thread has Lower Priority"+ p1);
        p2.setName("this thread has Higher Priority"+p2);

        p1.setPriority(Thread.MIN_PRIORITY);
        p2.setPriority(Thread.MAX_PRIORITY);

        p1.start();
        p2.start();
    }
}
