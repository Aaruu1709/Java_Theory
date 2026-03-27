package Interface;

public interface Vehical {
    void start();
    void stop();
}
abstract class Car implements Vehical{
    public void start(){
        System.out.println("car staart with key only..");
    }
}
class Scooter extends Car{
    public void stop(){
        System.out.println("scooter start with kick");
    }
}
class FinalVehical{
    public static void main(String[] args) {
        Scooter sc=new Scooter();
        sc.start();
        sc.stop();
    }
}

