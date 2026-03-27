package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Pipeline {
    public static void main(String[] args) {
        //? case:1=unchecked(no need to present in try block)
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a number:");
            int num=sc.nextInt();
            System.out.println(10/num);
            System.out.println("Aaruu".charAt(12));

        }
        catch (ArithmeticException | NumberFormatException e){
            System.out.println("pipeline Exccption here..");
        }
        catch (StringIndexOutOfBoundsException | ClassCastException | NullPointerException e){
            System.out.println("pipleine Exception 2...");
        }
        System.out.println("rest of the code here");

        //? Case : 2: Checked Exception: interuppted file not fund(check exception must be present in try block)
//
//        try{
//            Thread.sleep(1000);
//        } catch (InterruptedException | FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("rest o f the code");

        //Exception 'java.io.FileNotFoundException' is never thrown in the corresponding try block

        //REASON=>declare checked exception in try

        //? case: 3:
        System.out.println("____________________  case:3  ____________________");
        try{
            Thread.sleep(1000);
            FileInputStream fis=new FileInputStream("abc.txt");
        }catch (InterruptedException | FileNotFoundException e){
            System.out.println("rest of the app...");
        }

        System.out.println("_____________case 4 ___________________");
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException | ArithmeticException e)
        {
            System.out.println("we can mix both: checkded and unchecked by using pipe(checked must be present in pipe)");
        }
        System.out.println("rest of the app executed");

        System.out.println("________________________case -5 _________________________");
        System.out.println("we cant declare both parent and child");
//         try{
//             FileInputStream fis =new FileInputStream("abc.txt");
//         }catch (IOException | FileNotFoundException e){
//             System.out.println("mixed exception");
//         }
        System.out.println("rest of code");
//Types in multi-catch must be disjoint: 'java.io.FileNotFoundException' is a subclass of 'java.io.IOException
        //either parent or child not both
    }
}
