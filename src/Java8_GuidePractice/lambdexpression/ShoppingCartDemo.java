package Java8_GuidePractice.lambdexpression;

import java.util.*;
import java.util.stream.Collectors;

// Product class representing items in shopping cart
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Display product info
    @Override
    public String toString() {
        return name + " : $" + price;
    }
}

// Functional interface for discount calculation
@FunctionalInterface
interface Discount {
    double apply(double price);
}

public class ShoppingCartDemo {

    public static void main(String[] args) {
        // Step 1: Create shopping cart list
        List<Product> cart = Arrays.asList(
                new Product("Laptop", 1200),
                new Product("Mouse", 25),
                new Product("Keyboard", 50),
                new Product("Monitor", 300),
                new Product("Headphones", 80)
        );

        // Step 2: Define discount lambdas
        Discount tenPercentDiscount = price -> price * 0.9; // 10% discount
        Discount fiveDollarDiscount = price -> price - 5;   // Flat $5 discount

        System.out.println("=== Original Cart ===");
        cart.forEach(System.out::println);
        System.out.println("________________Another way to print list______________");
        cart.forEach(x-> System.out.println(x));

        System.out.println("\n=== Discounted Products (> $100, 10% off) ===");
        // Step 3: Apply discount to expensive products
        cart.stream()
                .filter(p -> p.price > 100) // filter expensive products
                .forEach(p -> System.out.println(p.name + " discounted price: $" + tenPercentDiscount.apply(p.price)));

        System.out.println("\n=== Discounted Products (< $100, $5 off) ===");
        // Step 4: Apply discount to cheaper products
        cart.stream()
                .filter(p -> p.price <= 100)
                .forEach(p -> System.out.println(p.name + " discounted price: $" + fiveDollarDiscount.apply(p.price)));

        System.out.println("\n=== All Products with Discount Collected in List ===");
        // Step 5: Map all products to discounted prices and collect
        List<String> discountedCart = cart.stream()
                .map(p -> {
                    double discountedPrice = p.price > 100 ? tenPercentDiscount.apply(p.price) : fiveDollarDiscount.apply(p.price);
                    return p.name + " : $" + discountedPrice;
                })
                .collect(Collectors.toList());

        discountedCart.forEach(System.out::println);
    }
}
