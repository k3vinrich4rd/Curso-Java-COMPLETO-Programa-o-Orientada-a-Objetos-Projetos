package estruturasequencial.exercicios;

import java.util.Scanner;

/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */
public class Exercicio5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int codigoPeca1 = input.nextInt();
        int quantidadePeca1 = input.nextInt();
        double valorUnitario1 = input.nextDouble();

        int codigoPeca2 = input.nextInt();
        int quantidadePeca2 = input.nextInt();
        double valorUnitario2 = input.nextDouble();

        double valorAPagar = quantidadePeca1 * valorUnitario1 + quantidadePeca2 * valorUnitario2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorAPagar);

        input.close();

    }
}
