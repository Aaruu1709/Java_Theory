package MultiThreading;

class MorningTask implements Runnable {
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Good Morning " + Thread.currentThread().getName());
        }
    }
}

class EveningTask implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Good Evening " + Thread.currentThread().getName());
        }
    }
}

class NightTask implements Runnable {
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Good Night " + Thread.currentThread().getName());
        }
    }
}

public class Assignment2 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MorningTask(), "Ratan");
        Thread t2 = new Thread(new EveningTask(), "Raju");
        Thread t3 = new Thread(new NightTask(), "Rani");

        t1.start();
        t2.start();
        t3.start();
    }
}
