package Java_8.Lambda_Expression.ThreadUsingLambda;

public class ThreadUsingLambda2 {
    public static void main(String[] args) {
        Runnable runnable=()->{
            for(int i=1;i<=10;i++){
                System.out.println("hello: "+ i);
            }
        };

        Thread childThread=new Thread(runnable);
        childThread.run();
    }
}
