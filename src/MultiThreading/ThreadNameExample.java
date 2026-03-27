package MultiThreading;


class ThreadName extends Thread{
    public void run(){
        System.out.println("Thread running:"+ Thread.currentThread().getName());
    }
}
public class ThreadNameExample {
    public static void main(String[] args) {
        ThreadName t1=new ThreadName();
        ThreadName t2=new ThreadName();

        t1.setName("Worker-1");
        t2.setName("worker-2");

        t1.start();
        t2.start();
    }
}
