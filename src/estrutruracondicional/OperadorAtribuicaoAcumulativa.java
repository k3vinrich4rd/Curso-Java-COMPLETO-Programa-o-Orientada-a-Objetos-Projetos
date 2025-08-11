package estrutruracondicional;

import java.util.Scanner;

public class OperadorAtribuicaoAcumulativa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int minutos = input.nextInt();

        double valorFatura = 50;

        if (minutos > 0 && minutos <= 100) {
            System.out.printf("Valor a pagar: R$ %.2f", valorFatura);
        } else {
            valorFatura += (minutos - 100) * 2;
            System.out.printf("Valor a pagar: R$ %.2f", valorFatura);
        }
        input.close();

    }
}
