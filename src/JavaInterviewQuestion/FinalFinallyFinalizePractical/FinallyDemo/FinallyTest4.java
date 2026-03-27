package JavaInterviewQuestion.FinalFinallyFinalizePractical.FinallyDemo;

public class FinallyTest4 {
    public static void main(String[] args) {
       try{
           System.out.println("processing......");
           Thread.sleep(10000);//suppose here power cut
       }catch (InterruptedException e){

       }finally {
           System.out.println("cleanup,,,,");//may not execute
       }
    }
}
///👉 If system shuts down → finally won’t run