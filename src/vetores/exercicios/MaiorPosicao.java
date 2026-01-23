package vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
Problema "maior_posicao"
Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/maior_posicao.java

Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).

Exemplo:
Quantos numeros voce vai digitar? 6
Digite um numero: 8.0
Digite um numero: 4.0
Digite um numero: 10.0
Digite um numero: 14.0
Digite um numero: 13.0
Digite um numero: 7.0

MAIOR VALOR = 14.0
POSICAO DO MAIOR VALOR = 3
 */

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int numero = input.nextInt();
        double[] numeros = new double[numero];

        for (int i = 0; i < numero; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = input.nextDouble();
        }

        double maiorValor = numeros[0];
        int posicaoMaior = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.2f", maiorValor);
        System.out.print("\nPOSIÇÃO DO MAIOR VALOR = " + posicaoMaior);

    }
}
