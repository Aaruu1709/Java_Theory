package Synchroonization;

class DeadLock {

    static Object printer = new Object();
    static Object scanner = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (printer) {
                System.out.println("Thread 1 locked Printer");
                try { Thread.sleep(500); } catch (Exception e) {}
                synchronized (scanner) {
                    System.out.println("Thread 1 locked Scanner");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (scanner) {
                System.out.println("Thread 2 locked Scanner");
                try { Thread.sleep(500); } catch (Exception e) {}
                synchronized (printer) {
                    System.out.println("Thread 2 locked Printer");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
