package Interface.BankingApp;

public class BankMain {
    public static void main(String[] args) {
        SavingAccServices service=new SavingAccServices();
        service.withdraw(100,12345);
        service.checkBalance(12345);
        service.deposit(500,12345);
    }
}
