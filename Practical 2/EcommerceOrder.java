import java.util.Scanner;

// Product Class
class Product {

    String productName;
    double price;
    int quantity;

    // Default Constructor
    Product() {
        productName = "Unknown Product";
        price = 0;
        quantity = 0;
    }

    // Parameterized Constructor
    Product(String name, double p, int q) {
        productName = name;
        price = p;
        quantity = q;
    }

    // Method to calculate total cost
    double calculateTotal() {
        return price * quantity;
    }
}

public class EcommerceOrder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Product initialized using constructor
        Product p1 = new Product("Laptop", 50000, 1);

        // User input product details
        System.out.println("Enter Product Name:");
        String name = sc.nextLine();

        System.out.println("Enter Product Price:");
        double price = sc.nextDouble();

        System.out.println("Enter Product Quantity:");
        int quantity = sc.nextInt();

        // Product initialized using user input
        Product p2 = new Product(name, price, quantity);

        // Calculate total order cost
        double total1 = p1.calculateTotal();
        double total2 = p2.calculateTotal();

        double grandTotal = total1 + total2;

        // Apply discount policy
        double discount = 0;

        if (grandTotal > 50000) {
            discount = grandTotal * 0.10; // 10% discount
        } else if (grandTotal > 20000) {
            discount = grandTotal * 0.05; // 5% discount
        }

        double finalAmount = grandTotal - discount;

        // Invoice
        System.out.println("\n========= INVOICE =========");

        System.out.println("\nProduct 1:");
        System.out.println("Name: " + p1.productName);
        System.out.println("Price: " + p1.price);
        System.out.println("Quantity: " + p1.quantity);
        System.out.println("Total: " + total1);

        System.out.println("\nProduct 2:");
        System.out.println("Name: " + p2.productName);
        System.out.println("Price: " + p2.price);
        System.out.println("Quantity: " + p2.quantity);
        System.out.println("Total: " + total2);

        System.out.println("\nGrand Total: " + grandTotal);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);

        System.out.println("===========================");

        sc.close();
    }
}