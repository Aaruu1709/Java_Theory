package ExceptionHandling;

public class ExceptionConditions {
    public static void main(String[] args) {
        System.out.println("_______________________condition 1__________________________");

        //! condition 1
        //? normal-> when exceptio occure program abnormally teminated and rest of code not executed
        System.out.println("Application started....");
//        System.out.println(10/0);
        System.out.println("Application Stopped..");
        System.out.println("____________________condition 2______________________________");

        //! condition 2
//?         we can handle it wth try and catch Block.
// ?       so our program will be exceuted properly and rest of code be exceuted.
        try{
            System.out.println("Application Started..");
            System.out.println(10/0);
        }
        catch (Exception e){
            System.out.println("application Stopped...");

        }
        System.out.println("_________________________condition 3__________________________");


        //!condition 3
      //?  what  happened here exception occure Arithmetic but catch block we didnt write that so try can't find
      //  its compactible type of exeption so our program will be termianted abnormally and rest of code not be executed ahed'
        //?  catch block not match program terminated abnormally
        try{
            System.out.println("Application Started..");
//            System.out.println(10/0);
        }
        catch (NullPointerException e){
            System.out.println("application Stopped...");

        }

        System.out.println("_____________________condition 4______________________________");
        //!condition 4
        try{
            System.out.println("Application Started..");
        }
        catch (NullPointerException e) {
            System.out.println("application Stopped...");
        }

            System.out.println("_____________________condition 5______________________________");
            //!condition 5

            try{
                System.out.println("hey there");
            }
            catch (Exception ex){
                System.out.println("catch is mandatory one try not exceute");
            }

            System.out.println("_____________________condition 6______________________________");
            //!condition 6

            try{
                System.out.println("application started from here");
                System.out.println(10/0);
            }
            catch (ArithmeticException ae){
                System.out.println("exception catched here..but exception at catch then code goes to abnormal termination");
//                System.out.println(10/0);//abnormal termination
            }



            System.out.println("_____________________condition 7(case -1)______________________________");
            //!condition 7-1

            try{
                System.out.println("Meerab");
                System.out.println("Haya");
                System.out.println(10/0);

            }
            catch (ArithmeticException ae){
                System.out.println("exception handle catch match particular excular exception ..rest of code excecuted");
            }


            System.out.println("_____________________condition 7(case -2)______________________________");
            //!condition 7-2


            try{
                System.out.println(10/0);
                System.out.println("aaluu");
                System.out.println("aaruu");
            }
            catch (ArithmeticException ae){
                System.out.println("rest of code excuted but here exception occur at first in try block so remaining try normal code not exceuted ");
            }

        }

    }

