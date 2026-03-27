package MultiThreading;

public class CreatingTUsingRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("runaable interface:"+ Thread.currentThread().getName());

        System.out.println("creating thead using runable interface only diff id create thread class object to start() method bcoz runnable interface have only one run() method so we need to create object of threD Class");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        CreatingTUsingRunnable r=new CreatingTUsingRunnable();
        Thread t=new Thread(r);
        t.start();
    }
}
