package Java8ByDurgaSir.Session2;

//class MyClass implements Runnable{
//    public void run(){
//        System.out.println("this is simple runnable method");
//        for(int i=0;i<=10;i++){
//            System.out.println(i);
//        }
//    }
//}
public class RunnableDemo {
    public static void main(String[] args) {
        Runnable r=()->{
            for(int i=0;i<10;i++){
                System.out.println("child thread");
            }
        };
        Thread t=new Thread(r);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("main thread");
        }


    }
}
//from java 8 we can use lambda expression to reduce the code.
//do not need implementation class
