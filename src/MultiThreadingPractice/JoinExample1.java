package MultiThreadingPractice;

//Example: join() Method without Time Limit

class Method1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" :"+ i);
        }
    }
}
public class JoinExample1 {
    public static void main(String[] args) {
        Method1 m=new Method1();
        Method1 m2=new Method1();
        Method1 m3=new Method1();

        m.start();
        m2.start();

      try{
          m2.join();
      }catch (InterruptedException e){
          System.out.println(e);
      }

      m3.start();
    }
}
