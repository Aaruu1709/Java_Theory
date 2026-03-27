package Interface.objectcreation;
//using constructor
//this is the payment interface
interface Payment{
    void pay();
}

//this is the implementation
class DebitCard implements Payment{
    public void pay(){
        System.out.println("paid using debit card...");
    }
}

class CreditCard implements Payment{
    public void pay(){
        System.out.println("paid using creditcard....");
    }
}

//dependednt class(does not creat object)
class Checkout{
  private  Payment payment;//this is reference of interface
    Checkout(Payment payment){
        this.payment=payment;
    }
    void processPayment(){
        payment.pay();
    }

}
public class PaymentMain {
    public static void main(String[] args) {
Payment p1=new DebitCard();
Checkout c1=new Checkout(p1);
c1.processPayment();


Payment p2=new CreditCard();
Checkout c2=new Checkout(p2);
c2.processPayment();

    }
}
//How loose coupling happens?
//
//Checkout depends on Payment
//
//Not on DebitCard / CreditCard
//
//We change payment type without touching Checkout