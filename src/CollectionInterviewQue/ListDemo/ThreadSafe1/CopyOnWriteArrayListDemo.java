package CollectionInterviewQue.ListDemo.ThreadSafe1;


import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();
        Thread t1=new Thread(()->{
            for(int i=1;i<=5;i++){
                list.add(i);
                System.out.println("Thread1 added: "+ i);
            }
        });

        Thread t2=new Thread(()->{
            for(int i=6; i<=10;i++){
                list.add(i);
                System.out.println("Thread2 added: "+i);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        //no need for synchronization
        System.out.println("final list:" + list);
    }
}
