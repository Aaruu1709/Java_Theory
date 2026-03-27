package ExceptionHandling;

import java.io.FileReader;

public class Exception1 {
    public static void main(String[] arg) {
        try {
            FileReader fr=new FileReader("abc.txt");

            System.out.println("program Stared from here");
            System.out.println("step 1");
            System.out.println(10/0);
        }
        //! important
        //? heyyyy look at mi
        //todo im also here
        //* wow so beautiful
        // // im normal comment
        //normal comment

        catch (Exception e){
//            System.out.println(10/0);
            //exception occured here..Exception in thread "main" java.lang.ArithmeticException: / by zero
            System.out.println("Application termianted abnormally");
        }


    }
}
