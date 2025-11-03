package exerciciosdelogica;

/*
6. Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor.
 */

import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        antecessorESucessorDeUmNumero(numero);

        input.close();
    }

    public static void antecessorESucessorDeUmNumero(int numero) {
        int antecessorDeUmNumero = numero - 1;
        int sucessorDeUmNumero = numero + 1;

        System.out.println("Antecessor do número " + numero + " é " + antecessorDeUmNumero);
        System.out.println("Sucessor do número " + numero + " é " + sucessorDeUmNumero);
    }
}
