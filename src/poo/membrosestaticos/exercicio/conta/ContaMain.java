package poo.membrosestaticos.exercicio.conta;

import java.util.Locale;
import java.util.Scanner;

public class ContaMain {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = input.nextInt();
        input.nextLine();
        System.out.print("Enter account holder: ");
        String accountHolder = input.nextLine();

        Conta conta;
        System.out.print("Is there na initial deposit: ");
        char responseHolder = input.next().charAt(0);

        if (responseHolder == 'y' || responseHolder == 'Y') {
            System.out.print("Enter initial deposit: ");
            double depositoInitial = input.nextDouble();
            conta = new Conta(accountNumber, accountHolder, depositoInitial);
        } else
            conta = new Conta(accountNumber, accountHolder);

        System.out.println("\nAccount data: " + "\n" + conta);

        System.out.print("Enter a deposit value: ");
        double depositValueInAccount = input.nextDouble();
        conta.depositInAccount(depositValueInAccount);
        System.out.println("Updated account data: " + "\n" + conta);

        System.out.print("Enter a withdraw value: " );
        double withdrawInAccount = input.nextDouble();
        conta.withdrawInAccount(withdrawInAccount);
        System.out.println("Updated account data: " + "\n" + conta);
    }
}
