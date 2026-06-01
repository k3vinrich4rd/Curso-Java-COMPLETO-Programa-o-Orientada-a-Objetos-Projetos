package interfaces.solucaoproblema1.teste;

import interfaces.solucaoproblema1.model.entities.CarRental;
import interfaces.solucaoproblema1.model.entities.Vehicle;
import interfaces.solucaoproblema1.model.service.BrazilTaxServices;
import interfaces.solucaoproblema1.model.service.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel: ");
        System.out.print("Modelo do carro: ");
        String carModel = input.nextLine();
        System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(input.nextLine(), formatter);
        System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(input.nextLine(), formatter);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = input.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = input.nextDouble();

        //Injeção de dependência por meio de construtor
        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxServices()); //Upcasting
        rentalService.processInvoice(cr);
        System.out.println("FATURA:");
        System.out.println("Pagamento básico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

        input.close();


    }
}
