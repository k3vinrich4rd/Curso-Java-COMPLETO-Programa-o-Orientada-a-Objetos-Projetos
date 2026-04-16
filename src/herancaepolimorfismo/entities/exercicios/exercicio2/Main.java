package herancaepolimorfismo.entities.exercicios.exercicio2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter the number of products: ");
        int quantityOfProducts = input.nextInt();

        List<Product> products = new ArrayList<>();
        for (int i = 0; i < quantityOfProducts; i++) {
            System.out.println("Product # " + (i + 1) + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char response = input.next().charAt(0);
            input.nextLine();

            if (response == 'I' || response == 'i') {
                System.out.print("Name: ");
                String name = input.nextLine();
                System.out.print("Price: ");
                double price = input.nextDouble();
                System.out.print("Customs fee: ");
                double valueFee = input.nextDouble();

                products.add(new ImportedProduct(name, price, valueFee));
            } else if (response == 'u' || response == 'U') {
                System.out.print("Name: ");
                String name = input.nextLine();
                System.out.print("Price: ");
                double price = input.nextDouble();
                input.nextLine();
                System.out.println("Manufacture date (dd/MM/yyyy): ");
                Date manufactureDate = sdf.parse(input.nextLine());

                products.add(new UsedProduct(name, price, manufactureDate));
            } else {
                System.out.print("Name: ");
                String name = input.nextLine();
                System.out.print("Price: ");
                double price = input.nextDouble();

                products.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }

        input.close();
    }
}