package ExceptionHandling;

import java.util.Scanner;

public class TryCatchCombination {
    public static void main(String[] args) {
        System.out.println("******************** CASE -1  **********************");
        System.out.println("try with multiple catch block");
        try{
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter a number");
             int num=sc.nextInt();
             System.out.println(10/num);
             System.out.println("aaruu".charAt(12));//StringIndexOutOfBoundException
         }
         catch (ArithmeticException ae){
             System.out.println("aaruu.com");
         }
         catch (StringIndexOutOfBoundsException e){
             System.out.println("StringIndexOutOfBoundException executed here...");
         }
        System.out.println("rest of the Application...");




        System.out.println("******************** CASE -2  **********************");
        System.out.println("one Exception class handle all type off exceptiption");
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
            int num=sc.nextInt();
            System.out.println(10/num);
            System.out.println("aaruu".charAt(12));//StringIndexOutOfBoundException
        }
        catch (Exception ae) {
            System.out.println("tis exception handle all types of exception any kind of exception..");

        }


            System.out.println("******************** CASE -3  **********************");
            System.out.println("child ->parent Exception flow");
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("enter a number");
                int num=sc.nextInt();
                System.out.println(10/num);
                System.out.println("aaruu".charAt(12));
            }
            catch (ArithmeticException ae)
            {
                System.out.println("Arithmetic exception occured...");
            }
            catch (Exception e){
                System.out.println("exception class is running");
            }
        System.out.println("rest of the code is running...");


        System.out.println("************** CASE-4 ******************");
        System.out.println("parent->child.......error : arithmetic exce already been caught");
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
            int num=sc.nextInt();
            System.out.println(10/num);
            System.out.println("aaruu".charAt(12));
        }
        catch (Exception e){
            System.out.println("this is parent Exception class");
        }
//        catch (ArithmeticException ae){
//            System.out.println("exception ArithmeticException has already been caught..");
//            System.out.println("rest of the Application");
//
//        }

    }

}
