package AbstractClass;

abstract class Services{
    abstract String login(String username,String password);
    abstract double totalBill(String productName,double pcost,int pquantity);
    abstract int add(int num1,int num2);
    abstract void wish();
}
class AmazonService extends Services {

//    @Override
    String login(String username, String password) {
        return "Amazon login successful for " + username;
    }

//    @Override
    double totalBill(String productName, double pcost, int pquantity) {
        return pcost * pquantity;
    }

//    @Override
    int add(int num1, int num2) {
        return num1 + num2;
    }

//    @Override
    void wish() {
        System.out.println("Welcome to Amazon!");
    }
}

class FlipkartService extends Services {

//    @Override
    String login(String username, String password) {
        return "Flipkart user " + username + " logged in";
    }

//    @Override
    double totalBill(String productName, double pcost, int pquantity) {
        double discount = 0.10; // 10% discount
        return (pcost * pquantity) - (pcost * pquantity * discount);
    }

//    @Override
    int add(int num1, int num2) {
        return num1 + num2;
    }

//    @Override
    void wish() {
        System.out.println("Hello from Flipkart!");
    }
}

class LocalStoreService extends Services {

//    @Override
    String login(String username, String password) {
        return "Local store access granted to " + username;
    }

//    @Override
    double totalBill(String productName, double pcost, int pquantity) {
        double tax = 0.05; // 5% tax
        return (pcost * pquantity) + (pcost * pquantity * tax);
    }

//    @Override
    int add(int num1, int num2) {
        return num1 + num2;
    }

//    @Override
    void wish() {
        System.out.println("Thank you for visiting our Local Store!");
    }
}


public  class Assignment1 {
    public static void main(String[] args) {
        Services s1 = new AmazonService();
        s1.wish();
        System.out.println(s1.login("alice", "1234"));
        System.out.println("Bill: " + s1.totalBill("Phone", 20000, 2));
        System.out.println("add:"+s1.add(10,20));
        Services s2 = new FlipkartService();
        s2.wish();
        System.out.println("Bill: " + s2.totalBill("Laptop", 50000, 1));
    }


}
