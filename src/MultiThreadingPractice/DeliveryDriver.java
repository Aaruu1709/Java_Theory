package MultiThreadingPractice;
class  Vehicle{
    void drive(){
        System.out.println("driving vehicle");
    }
}
interface  Delivery{
    void deliveryPackage();
}
interface  Payment{
    void collectPayment();
}
 class Driver extends Vehicle implements Delivery,Payment{
    public void deliveryPackage(){
        System.out.println("delivering package");
    }

    public  void collectPayment(){
        System.out.println("collecting payment");
    }
 }
public class DeliveryDriver {
    public static void main(String[] args) {
        Driver d = new Driver();
        d.collectPayment();
        d.deliveryPackage();
        d.drive();
    }
}
