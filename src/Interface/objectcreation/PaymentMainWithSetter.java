package Interface.objectcreation;

//interface Payment2
interface Payment2{
    public void pay();
}

//implementation classes
class DebitCard2 implements Payment2{
    public void pay(){
        System.out.println("payment coollected via debitcard...");
    }
}
class CreditCard2 implements Payment2{
    public void pay(){
        System.out.println("payment collected via creditcard...");
    }
}


//dependent class
class Checkout2{
    Payment2 payment2;
  //setter injection
    void setPayment2(Payment2 payment2){
        this.payment2=payment2;
    }

    void processPayment(){
        payment2.pay();
    }
}
public class PaymentMainWithSetter {
    public static void main(String[] args) {
          Checkout2 checkout2=new Checkout2();//no pyment yet

        checkout2.setPayment2(new DebitCard2());//injected later
        checkout2.processPayment();

        checkout2.setPayment2(new CreditCard2());//changed at runtime
        checkout2.processPayment();
    }
}
//Checkout depends on Payment
//
//Not on DebitCard / CreditCard
//
//We change payment type without touching Checkout