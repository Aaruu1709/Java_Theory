package Encapsulation;

interface Payment{
    void pay(double amount);
}
class UpiPayment implements Payment{
    public void pay(double amount){
         // attempting to assign weaker access privilege..when we not give public

        System.out.println("paid: "+ amount+ "using UPI");
    }

}
public class UsingInterface {
    public static void main(String[] args) {
        Payment payment=new UpiPayment();
        payment.pay(500);

    }
}
