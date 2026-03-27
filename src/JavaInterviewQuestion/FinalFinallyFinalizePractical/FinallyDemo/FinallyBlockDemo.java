package JavaInterviewQuestion.FinalFinallyFinalizePractical.FinallyDemo;

public class FinallyBlockDemo {
    public static void main(String[] args) {
        try{
            System.out.println("inside try...");
            int a=10/0;//here exception occure
        }catch (Exception e){
            System.out.println("inside catch..");
        }finally {
            System.out.println("inside finally..");
        }
        System.out.println("program continues...");
    }
}
