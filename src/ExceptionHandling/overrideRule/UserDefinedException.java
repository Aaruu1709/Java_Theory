package ExceptionHandling.overrideRule;

import ExceptionHandling.InvalidAgeException;

import java.util.Scanner;

public class UserDefinedException {
    static void checkStatus(int age)throws InvalidAgeException{
        if(age>20){
            System.out.println("Eligible for Marriage");
        }
        else {
            throw new InvalidAgeException();
        }
    }

    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age=sc.nextInt();
        UserDefinedException.checkStatus(age);
    }
}
