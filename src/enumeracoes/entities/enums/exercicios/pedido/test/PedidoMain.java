package enumeracoes.entities.enums.exercicios.pedido.test;

import enumeracoes.entities.enums.exercicios.pedido.entities.Client;
import enumeracoes.entities.enums.exercicios.pedido.entities.Order;
import enumeracoes.entities.enums.exercicios.pedido.entities.OrderItem;
import enumeracoes.entities.enums.exercicios.pedido.entities.Product;
import enumeracoes.entities.enums.exercicios.pedido.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class PedidoMain {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        Date birth = sdf.parse(input.next());
        input.nextLine();

        Client client = new Client(name, email, birth);

        System.out.print("Enter order data: ");
        System.out.print("Status: ");
        String statusStr = input.nextLine();
        OrderStatus status = OrderStatus.valueOf(statusStr);

        Order order = new Order(new Date(), status);

        System.out.println("How many items to this order? ");
        int quantityOrder = input.nextInt();
        input.nextLine();

        for (int i = 0; i < quantityOrder; i++) {
            System.out.println("Enter #" + (i + 1) + " item data: ");
            System.out.print("Product name: ");
            String productName = input.nextLine();
            System.out.println("Product price: ");
            double productPrice = input.nextDouble();
            System.out.print("Quantity: ");
            int quantity = input.nextInt();
            input.nextLine();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(product, productPrice, quantity);
            order.addOrderItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println("Client: " + client.getName() + " (" + sdf.format(client.getBirthDate()) + ") - " + client.getEmail());
        SimpleDateFormat sdfMoment = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Order moment: " + sdfMoment.format(order.getMoment()));
        System.out.println("Order status: " + order.getOrderStatus());
        System.out.println("Order items:");
        for (OrderItem item : order.getOrderItemList()) {
            System.out.printf("%s, $%.2f, Quantity: %d, Subtotal: $%.2f%n",
                    item.getProduct().getName(),
                    item.getPrice(),
                    item.getQuantity(),
                    item.subTotal());
        }
        System.out.printf("Total price: $%.2f%n", order.total());


    }
}
