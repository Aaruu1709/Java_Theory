package MultiThreading;

class Thread4 extends Thread{
    int n;
    Thread4(int n){
        this.n=n;
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(n+"*"+i +"="+(n*i));
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class Assignment3{
    public static void main(String[] args) throws InterruptedException {
        Thread4 obj=new Thread4(4);
        obj.start();
        obj.join();
        Thread4 obj2=new Thread4(5);
        obj2.start();
        obj2.join();

    }

}