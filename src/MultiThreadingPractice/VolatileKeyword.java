package MultiThreadingPractice;

public class VolatileKeyword {

    static Boolean status = false;

    public static void main(String[] args) throws InterruptedException {

        Thread worker = new Thread(() -> {
            while (!status) {
                // no println
            }
            System.out.println("worker stopped");
        });

        worker.start();

        Thread.sleep(1000);
        status = true;
        System.out.println("im stop,,,,,");
    }
}
