package JavaInterviewQuestion.FinalFinallyFinalizePractical.FinallyDemo;
//❌ 2. JVM Crash (Force crash)
public class FinallyTest2 {
    public static void main(String[] args) {
        try{
            System.out.println("inside try...");
            //force JVM crash
            Runtime.getRuntime().halt(0);
        }finally {
            System.out.println("inside finallly..");//will not execute
        }
    }
}
//👉 halt() stops JVM instantly (no cleanup)