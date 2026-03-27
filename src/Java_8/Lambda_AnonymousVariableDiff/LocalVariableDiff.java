package Java_8.Lambda_AnonymousVariableDiff;

public class LocalVariableDiff {

    int a = 5;

    public void test() {

        // Lambda
        Runnable lambda = () -> {
            a = 20;
            System.out.println("Lambda a: " + a);
        };

        // Anonymous Class
        Runnable anon = new Runnable() {
            @Override
            public void run() {
                a = 30;
                System.out.println("Anonymous a: " + a);
            }
        };

        lambda.run();
        anon.run();
    }

    public static void main(String[] args) {
        new LocalVariableDiff().test();
    }
}
