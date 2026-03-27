package Interface.BankingApp;

import java.util.Scanner;

public class SavingAccServices implements BankService{

double totalBalance=3000;
Scanner sc=new Scanner(System.in);
    @Override
    public String deposit(int amount, int accNo) {
        System.out.println("enter anount to deposite:"+amount);
        int amt=sc.nextInt();
        totalBalance=totalBalance+amt;
        return "total balance";
    }

    @Override
    public Boolean withdraw(int amount, int accNo) {
        System.out.println("enter amout to withdraw:"+amount);
        int width=sc.nextInt();
        totalBalance=totalBalance-width;
        return null;
    }

    @Override
    public void checkBalance(int accNo) {
        System.out.println("total bank balance is :"+totalBalance);

    }
}
