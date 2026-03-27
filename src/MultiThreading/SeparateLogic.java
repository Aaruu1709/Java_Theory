package MultiThreading;

class MyThread5 extends Thread{
    public void run(){
add(10,20);
mul(20,40);
    }
    private void add(int a,int b){
        System.out.println("Addition is here: "+ (a+b));
    }

    private void mul(int a,int b){
        System.out.println("multi is: "+(a*b));
    }
}
public class SeparateLogic {
    public static void main(String[] args) {
        MyThread5 obj=new MyThread5();
        obj.start();

    }
}
