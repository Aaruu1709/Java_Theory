package Java_8.Lambda_Expression.ThreadUsingLambda;

public class ThreadUsingLambda {

    public static void main(String[] args) {

        Thread t = new Thread(() -> {
            for(int i = 1; i <= 10; i++) {
                System.out.println("Hello " + i);
            }
        });

        t.start();

        for(int i = 1; i <= 10; i++) {
            System.out.println("Bye " + i);
        }
    }
}
