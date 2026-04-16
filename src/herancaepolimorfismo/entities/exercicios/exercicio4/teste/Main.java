package herancaepolimorfismo.entities.exercicios.exercicio4.teste;

import herancaepolimorfismo.entities.exercicios.exercicio4.entities.Contribuinte;
import herancaepolimorfismo.entities.exercicios.exercicio4.entities.PessoaFisica;
import herancaepolimorfismo.entities.exercicios.exercicio4.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of tax payers: ");
        int quantityPayers = input.nextInt();
        List<Contribuinte> contribuintes = new ArrayList<>();

        for (int i = 0; i < quantityPayers; i++) {
            System.out.println("Taxpayer # " + (i + 1) + " data: ");
            System.out.print("Individual or company(i/c)? ");
            char response = input.next().charAt(0);
            input.nextLine();

            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = input.nextDouble();
            if (response == 'i' || response == 'I') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = input.nextDouble();
                contribuintes.add(new PessoaFisica(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = input.nextInt();
                contribuintes.add(new PessoaJuridica(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println("\nTAXES PAID: ");
        for (Contribuinte contribuinte : contribuintes) {
            System.out.println(contribuinte.getNome() + ": $ " + String.format("%.2f", contribuinte.impostoAPagar()));
        }

        double sum = 0;
        for (Contribuinte contribuinte: contribuintes) {
            sum += contribuinte.impostoAPagar();
        }
        System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", sum));
        input.close();
    }
}
