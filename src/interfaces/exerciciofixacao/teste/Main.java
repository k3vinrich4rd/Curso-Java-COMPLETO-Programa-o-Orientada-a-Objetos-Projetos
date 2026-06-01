package interfaces.exerciciofixacao.teste;

import interfaces.exerciciofixacao.entities.Contract;
import interfaces.exerciciofixacao.entities.Installment;
import interfaces.exerciciofixacao.services.ContractService;
import interfaces.exerciciofixacao.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.println("Número: ");
        int numeroContrato = input.nextInt();
        input.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(input.nextLine(), dateTimeFormatter);
        System.out.print("Valor do contrato: ");
        double valorDoContrato = input.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int months = input.nextInt();

        Contract contract = new Contract(numeroContrato, date, valorDoContrato);

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, months);

        System.out.println("Parcelas");
        for (Installment installment : contract.getInstallments())
            System.out.println(
                    installment.getDueDate().format(dateTimeFormatter)
                            + " - "
                            + String.format("%.2f", installment.getAmount())
            );


        input.close();
    }
}
