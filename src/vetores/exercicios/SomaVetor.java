package vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/soma_vetor.java
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a média dos elementos do vetor
Exemplo:
Quantos numeros voce vai digitar? 4
Digite um numero: 8.0
Digite um numero: 4.0
Digite um numero: 10.0
Digite um numero: 14.0
VALORES = 8.0  4.0  10.0  14.0
SOMA = 36.00
MEDIA = 9.00
 */
public class SomaVetor {
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

        System.out.print("VALORES = ");
        for (int i = 0; i < numero; i++) {
            System.out.print(numeros[i] + " ");
        }

        double soma = 0;

        for (double n : numeros) {
            soma += n;
        }

        System.out.printf("%nSOMA = %.2f", soma);

        double media = soma / numeros.length;

        System.out.printf("%nMEDIA = %.2f", media);


        input.close();
    }
}
