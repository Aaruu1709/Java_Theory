package MultiThreadingPractice;

class ThreadName extends Thread{
    ThreadName(String ThreadName){
        super(ThreadName);
    }

    public void run(){
        System.out.println("the thread is executing.... ");
    }
}
public class ThreadNameUsingConstructor {
    public static void main(String[] args) {
        ThreadName t1=new ThreadName("aaruu Thread");
        ThreadName t2=new ThreadName("kayra thread");
        System.out.println("thread-1:"+ t1.getName());
        System.out.println("thread-2"+ t2.getName());

        t1.start();
        t2.start();

    }
}
