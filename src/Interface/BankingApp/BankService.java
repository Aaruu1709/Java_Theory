package Interface.BankingApp;

public interface BankService {
    String deposit(int amount, int accNo );
    Boolean withdraw(int amount,int accNo);

    void checkBalance(int accNo);

}
