package MultiThreadingPractice;

class ReportTask extends Thread{
    public void run(){
        try{
            System.out.println("Report Generation Started,....");
            Thread.sleep(3000);//takes 3 seconds
            System.out.println("report generation completed....");
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
}
public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
ReportTask r=new ReportTask();
r.start();
        System.out.println("manager waiting for report");
// 1️⃣ Wait fully
         r.join();

        // 2️⃣ Wait max 2 seconds
//         r.join(2000);

        // 3️⃣ Wait max 2 seconds + extra precision
        r.join(2000, 500000);

        System.out.println("Manager continues work...");
    }
}
