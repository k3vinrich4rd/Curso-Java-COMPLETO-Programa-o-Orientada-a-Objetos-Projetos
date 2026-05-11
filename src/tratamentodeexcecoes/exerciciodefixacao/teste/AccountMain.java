package tratamentodeexcecoes.exerciciodefixacao.teste;

import tratamentodeexcecoes.exerciciodefixacao.exceptions.WithDrawLimitException;
import tratamentodeexcecoes.exerciciodefixacao.model.Account;

import java.util.Locale;
import java.util.Scanner;

public class AccountMain {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int accountNumber = input.nextInt();
        input.nextLine();
        System.out.print("Holder: ");
        String holderAccount = input.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = input.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = input.nextDouble();

        Account account = new Account(accountNumber, holderAccount, initialBalance, withdrawLimit);

        System.out.print("Enter amount for withdraw: ");
        double valueWithdraw = input.nextDouble();
        try {
            account.withDraw(valueWithdraw);
            System.out.println("New balance: " + account.getBalance());
        } catch (WithDrawLimitException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        input.close();

    }
}
