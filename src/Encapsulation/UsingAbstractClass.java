package Encapsulation;

//class abstract and method is normal:add body to method or declare abstract
//method is abstract and class is normal :Abstract method in non-abstract class...add method body or declare class as abstract
 abstract class Vehicle {
    abstract void start();
}
class Bike extends Vehicle{
     void start(){
         System.out.println("bike start with self-start");
     }
}
public class UsingAbstractClass {
    public static void main(String[] args) {
Vehicle v=new Bike();
v.start();
    }
}
