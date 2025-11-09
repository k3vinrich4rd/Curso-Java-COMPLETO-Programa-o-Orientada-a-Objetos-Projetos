package poo.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductMain2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);


        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();
        System.out.print("Quantity: ");
        int quantity = input.nextInt();

        Product product = new Product(name, price,quantity );

        System.out.println("\nProduct data: " + product);

        System.out.print("\nEnter the number of products to be add in stock: ");
        product.addProducts(input.nextInt());

        System.out.println("Update data: " + product);

        System.out.print("\nEnter the number of products to be removed from stock: ");
        product.removeProducts(input.nextInt());

        System.out.println("Update data: " + product);

        input.close();
    }
}
