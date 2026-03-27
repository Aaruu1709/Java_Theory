package Encapsulation;
interface Payment1{
    void pay(double amount);
}
class CardPayment implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("paid amount is:"+ amount+ "using card");
    }
}
class OrderService{
    private Payment payment;
    public OrderService(Payment payment){
        this.payment=payment;
    }
    public void processOrder(double amount){
        payment.pay(amount);
    }
}
public class UsingConstructor {
    public static void main(String[] args) {
Payment payment=new CardPayment();
OrderService o=new OrderService(payment);
o.processOrder(12000);
    }
}
