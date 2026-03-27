package Interface.objectcreation;


import java.util.Scanner;

//step.1=create interface
interface  Payment5{
    void pay();
}

//step 2=implemented class
class Wallet implements Payment5{
    public void pay(){
        System.out.println("payment done through wallet");
    }
}

class Cash implements Payment5{
   public void pay(){
       System.out.println("payment done through cash...");
    }
}

class DebitCardd implements Payment5{
    public void pay(){
        System.out.println("payment debited successfully");

    }
}


//dependent class
class Checkoutt{
   void payment5(Payment5 payment5){
       payment5.pay();

   }

}
public class InterfaceLooseCouplingproject {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Checkoutt checkoutt=new Checkoutt();
        System.out.println("choose payment method...");
        System.out.println("1.wallet");
        System.out.println("2.cash");
        System.out.println("3.debitcard");
        System.out.println("enter your choice: ");
        int choice=sc.nextInt();

        switch (choice){
            case 1:
                checkoutt.payment5(new Wallet());
                break;

            case 2:
                checkoutt.payment5(new Cash());
                break;

            case 3:
                checkoutt.payment5(new DebitCardd());
                break;

            default:
                System.out.println("invalid choice...");
        }
    }
}
