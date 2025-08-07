package estrutruracondicional;

import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        if (numero % 2 != 0) {
            System.out.println("IMPAR");
        } else {
            System.out.println("PAR");
        }

        input.close();
    }
}
