package Java8_GuidePractice.lambdexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product2 {
    String pName;
    int pPrice;


    Product2(String pName, int pPrice) {
        this.pName = pName;
        this.pPrice = pPrice;
    }

    public String toString() {
        return pName + ": $" + pPrice;

    }
}
interface Discount2{
    int apply(int price);
}
public class ShoppingCartPracticeSet {
    public static void main(String[] args) {
        List<Product2> cart= Arrays.asList(
          new Product2("laptop", 12000),
                new Product2("mouse",200),
          new Product2("keyboard", 500),
          new Product2("Sound",900),
          new Product2("headSet",1010)
        );


        Discount2 tenPerDiscount=pPrice->pPrice* 10;
        Discount2 flat5perDiscount=pPrice->pPrice-5;

        cart.stream().filter(p->p.pPrice>700).forEach(p-> System.out.println(p.pName+ "discounted price: $"+ tenPerDiscount.apply(p.pPrice)));
        cart.stream().filter(p->p.pPrice<=699).forEach(p-> System.out.println(p.pName +"flat 5% dicount :"+ flat5perDiscount.apply(p.pPrice)));


        System.out.println("++++All product with dicount collected in a list++++");
        List<String> discounteedCart=cart.stream().map(p->{
            int discountedPrice=p.pPrice>100 ? tenPerDiscount.apply(p.pPrice):flat5perDiscount.apply(p.pPrice);
            return p.pName + " : "+discountedPrice;
        }).collect(Collectors.toList());
        discounteedCart.forEach(System.out::println);
    }
}
