package JavaBasicIntro;


class Services
{
    double totalBill(String pname,double cost,int quantity){
        double bill;
        bill=cost*quantity;
        return bill;
    }
    static int productOrder(String name,String location,int cost){
        if(cost>100){
            return 12345;
        }
        else {
            return 9876;
        }
    }
}
public class ReturnExample1 {
    public static void main(String[] args) {
        Services s=new Services();
        double bill=s.totalBill("pen",12.5,7);
        System.out.println("your total bill:"+ bill);

        int orderId=Services.productOrder("shirt","hydrabad",300);
        System.out.println("your order id is:"+ orderId);
    }
}
