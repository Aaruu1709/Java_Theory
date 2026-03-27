package JavaInterviewQuestion;

public class FinalizeMain {
    public static void main(String[] args) {
        String s=new String("hello...");
        s=null;
        System.gc();
    }
    protected  void finalize() throws Throwable{
        System.out.println("garabge collection taking place");
    }
}
