package Interface;
//functional interface:only one abstract method
interface Payment{
    void pay();
}


//dependent class
class CheckOut3{
    void processPayment(Payment payment){
        payment.pay();
    }
}


public class PaymentMainLambda {
    public static void main(String[] args) {
        CheckOut3 checkOut3=new CheckOut3();

        //inject behavoir using lambda
        checkOut3.processPayment(()->
                System.out.println("payment done using UPI..."));

        checkOut3.processPayment(()-> System.out.println("payment done using credit card"));

        checkOut3.processPayment(()-> System.out.println("payment done using wallet.."));
    }
}
