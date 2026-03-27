package PolyMorphism;

interface Bird{
    void fly();
    void swim();
}

class Parrot implements Bird{
    public void fly(){
        System.out.println("parrot can fly");
    }
   public void swim(){
        System.out.println("parrot can not swim");
    }
}


//best approach:Use parent reference (Bird) instead
// of child references (Parrot, Penguin) to avoid multiple methods.
class Penguin implements Bird{
    public void fly(){
        System.out.println("penguin can not fly");

    }
    public void swim(){
        System.out.println("penguin can swim");
    }
}

class ClientInfo{
    void birdInfo(Bird b){
        b.fly();
        b.swim();
    }

    public static void main(String[] args) {
        ClientInfo c=new ClientInfo();
        c.birdInfo(new Parrot());
        c.birdInfo(new Penguin());
    }
}
//
//aaproach 1:
//✅ What’s happening here?
//No extra methods
//Directly calling methods on objects
//Less code than first example
//❌ Still a problem
//Client code knows exact classe
//If behavior changes → client must change
//Still no polymorphism

//public class ClientInfo {
//    public static void main(String[] args) {
//        ClientInfo c=new ClientInfo();
//        Parrot p=new Parrot();
//        p.fly();
//        p.swim();
//
//        Penguin p2=new Penguin();
//        p2.fly();
//        p2.swim();
//
//    }


//approach 2
//❌ What is the problem here?
//
//👉 Method duplication
//
//parrotInfo() and penguinInfo() do exactly the same work
//Only the object type changes
//If tomorrow you add:
//Sparrow
//Duck
//You must create new methods again 😵
//❌ This breaks scalability
//❌ Violates DRY principle (Don’t Repeat Yourself)
//
//
//public class ClientInfo {
//    void parrotInfo(Parrot p){
//        p.fly();
//        p.swim();
//    }
//    void penguinInfo(Penguin p){
//        p.fly();
//        p.swim();
//    }
//
//    public static void main(String[] args) {
//        ClientInfo c=new ClientInfo();
//        c.parrotInfo(new Parrot());
//        c.penguinInfo(new Penguin());
//    }
//}

