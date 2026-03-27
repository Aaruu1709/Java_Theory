package JavaInterviewQuestion.FinalFinallyFinalizePractical.FinallyDemo;
//👉 finally will NOT execute when:
//
//System.exit() is called
//JVM is forcefully stopped (halt())
//Infinite loop (control never reaches finally)
//System crash / power failure
public class FinallyTest1 {
    public static void main(String[] args) {
        try{
            System.out.println("inside try...");
            System.exit(0);
        }catch (Exception e){
            System.out.println("Inside catch");
        }finally {
            System.out.println("inside finally..");//will not execute
        }
        System.out.println("End of prgram");
    }
}
//👉 finally is skipped because JVM stops immediately