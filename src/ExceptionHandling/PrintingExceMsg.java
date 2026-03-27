package ExceptionHandling;

public class PrintingExceMsg {


    void m3(){

        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException ae){
            System.out.println(ae.toString());
            System.out.println(ae.getMessage());
            ae.printStackTrace();
        }
    }
    void m2(){
        m3();
    }
    void m1()
    {
        m2();
    }
    public static void main(String[] args) {
PrintingExceMsg m=new PrintingExceMsg();
m.m1();
    }
}
//java.lang.ArithmeticException: / by zero
/// by zero
//java.lang.ArithmeticException: / by zero
//	at ExceptionHandling.PrintingExceMsg.m3(PrintingExceMsg.java:7)
//	at ExceptionHandling.PrintingExceMsg.m2(PrintingExceMsg.java:16)
//	at ExceptionHandling.PrintingExceMsg.m1(PrintingExceMsg.java:20)
//	at ExceptionHandling.PrintingExceMsg.main(PrintingExceMsg.java:24)

//JVM internally uses printStackTrace() method when we not handle it