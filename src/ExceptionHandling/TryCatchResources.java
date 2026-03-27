package ExceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class TryCatchResources {
    public static void main(String[] args) {
        //? case-1: unchecked Exception => Catch block is optional
//        try(Scanner sc=new Scanner(System.in)){
//            System.out.println("enter a number:");
//            int num=sc.nextInt();
//            System.out.println("entered value:"+ num);
//
            //? case:2: resources throw checked exception then catch is mandatory

//        try(FileInputStream fis=new FileInputStream("abc.txt")){
//            System.out.println("here resources throw checked exception ..catch is mandatory");
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }

        //? we can give multiple resources separed by semicolon
        //? when multiple resources we use ..in that at last one resource throw checked....then catch is mandatory
        try(FileInputStream fis=new FileInputStream("abc.txt");
        Scanner sc=new Scanner(System.in);){
            System.out.println("multiple resources close...");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
