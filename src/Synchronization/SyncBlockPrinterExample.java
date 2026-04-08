package Synchronization;

class Printer2 {

    void printDocument(String name) {

        // only this block is synchronized
        synchronized (this) {
            System.out.println(name + " started printing...");

            try {
                Thread.sleep(1000); // simulate time
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println(name + " finished printing");
        }

        // this part runs freely (no lock)
        System.out.println(name + " exited print method");
    }
}

// Thread class
class MyThread2 extends Thread {
    Printer2 p;
    String name;

    MyThread2(Printer2 p, String name) {
        this.p = p;
        this.name = name;
    }

    public void run() {
        p.printDocument(name);
    }
}

// Main class
public class SyncBlockPrinterExample {
    public static void main(String[] args) {

        Printer2 printer = new Printer2();

        MyThread2 t1 = new MyThread2(printer, "User1");
        MyThread2 t2 = new MyThread2(printer, "User2");

        t1.start();
        t2.start();
    }
}
