package ExceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        System.out.println("_________________________case-1______________________");
        //! case : 1:normal termination
        try{
            System.out.println("I'm try block");
        }
        catch (ArithmeticException e){
            System.out.println("I'm Catch Block");
        }
        finally {
            {
                System.out.println("Im finally..always executed");
            }


            System.out.println("______________CASE-2_____________");
            //! case : 2: try->arithmetic exception-> catch here->normal execution of program
//! normal termination
            try{
                System.out.println(10/0);
            }
            catch (ArithmeticException ae){
                System.out.println("catch exception here");
            }
            finally {
                System.out.println("finally block");
            }


            System.out.println("_________________case-3_______________________");
            //!case:3
            //! when try throw exception but catch not catch it so our progam abnormally termianted but
//            before abnormally terminated finnaly exceuted
            //! abnormal termination

            try{
//                System.out.println(10/0);
            }
            catch (NullPointerException ne){
                System.out.println("catch block here");
            }
            finally {
                System.out.println("finally block ...");
            }

            //finally block ...
            //Exception in thread "main" java.lang.ArithmeticException: / by zero
            //	at ExceptionHandling.FinallyBlock.main(FinallyBlock.java:39)

            System.out.println("____________________case 04 ____________________");
//!               case : 04
//            try->exception->catch->then catch throw exception->finally exceuted ->abnormal termiantion

            try{
//                System.out.println(10/0);
            }
            catch (ArithmeticException ae){
//                System.out.println(10/0);
            }
            finally {
                System.out.println("finally block");
            }

            System.out.println("______________________case - 05______________");

//!             case : 05
//            finally block ->exception rised->abnormal termation , finally exceuted but exception rised..
//!           so all case finally exceuted
//            First, remember this GOLDEN RULE ✨
//
//finally block always executes
//✔️ whether exception occurs or not
//✔️ whether catch handles exception or not
//❌ except only in special cases (JVM crash, System.exit())


//  todo          ❓ Why finally is executed even after exception?
//
//                    Because:
//
//                    JVM guarantees resource cleanup
//
//finally is designed for:
//
//            closing files
//
//            closing DB connections
//
//            releasing memory
//
//            So JVM never skips finally

            try{
                System.out.println(10/0);
            }
            catch (ArithmeticException ae){
                System.out.println("catch block");
            }
            finally {
                System.out.println("finally");
//                System.out.println(10/0);
            }

            System.out.println("____________________________case-6_____________________");
//! case:6
//            try and finally always exceuted

            try {
                System.out.println("try");
            }
            finally {
                System.out.println("finally");
            }


            //? try-catch
            //? try-with-resources
            //? try-fianlly

            System.out.println("____________________________case-7-1_____________________");

//!            2 cases finally block not exceuted
//        case:1=>    once controlled enterd in try block then only finally block is excecuted

//            System.out.println(10/0);
//            try {
//                System.out.println("try block");
//            }
//            finally {
//                System.out.println("finally");
//            }



            System.out.println("____________________________case-7-2_____________________");
//! case-2 (fianlly not exceuted becoz sysytm close) jvm shout down


            try {
                System.out.println("try");
//                System.exit(0);
            }
            finally {
                System.out.println("finally block");
            }

            System.out.println("____________________________interview guesses_____________________");

            System.out.println("Question is here....");
//
//            try {
//                System.out.println(10/0);//Arithmetic Exp
//            }
//            catch (ArithmeticException ae){
//                System.out.println("aaruu".charAt(10));//StringIndexOutOfBoundExp
//            }
//            finally {
//                int[] a={10,20,30};
//                System.out.println(a[7]);//arrayIndexOutOfBound Exp
//            }
//? in that case every block throws exception then jvm throw only one exception at most recent exp
//            so it gives ArrayIndexOutOfBound


            System.out.println("_________question 2___________");
        class Test{
            int m1() {
                try{
                    return 10;
                }
                catch (ArithmeticException ae)
                {
                    return 20;
                }
                finally {
                    return 30;
                }
            }

            public static void main(String[] args) {
                Test t=new Test();
                int x=t.m1();
                System.out.println(x);
            }
            }

            //here most recent value of x=30 printed
//when only try and catch..try block not return any exception then controller not goes to catch so it exceute try value 10
//when try block exception occure then it handle in catch and vaalue of catch is given
        }
    }
}
