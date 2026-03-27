package MultiThreading;

class Thread1 extends Thread{
    public void run(){
for(int i=0;i<2;i++){
    System.out.println("Good morning...."+Thread.currentThread().getName());
}
    }

}

class Thread2 extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("good eening.... "+Thread.currentThread().getName());
        }
    }
}

class Thread3 extends Thread{
 public void run(){
     for(int i=0;i<4;i++){
         System.out.println("good night..."+Thread.currentThread().getName());
     }
 }
}
public class Assignment1_1 {
    public static void main(String[] args) throws InterruptedException {
        Thread1 obj=new Thread1();
        obj.setName("ratan");
        Thread2 obj2=new Thread2();
        obj2.setName("aaruu");
        Thread3 obj3=new Thread3();
        obj3.setName("meerab");
        obj.start();
        obj.join();
        obj2.start();
        obj2.join();
        obj3.start();
    }
}
//4 thread is created
//every thread=stack memory created
//so total 4 stack mempory is created
//the method calls and local variables of particular thread stored in particular stack