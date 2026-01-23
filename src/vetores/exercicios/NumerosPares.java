package vetores.exercicios;

import java.util.Scanner;

/*

Problema "numeros_pares"
Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/numeros_pares.java

Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.

Exemplo:
Quantos numeros voce vai digitar? 6
Digite um numero: 8
Digite um numero: 2
Digite um numero: 11
Digite um numero: 14
Digite um numero: 13
Digite um numero: 20

NUMEROS PARES:
8  2  14  20

QUANTIDADE DE PARES = 4
 */
public class NumerosPares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int numero = input.nextInt();

        int[] numeros = new int[numero];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextInt();
        }

        System.out.print("NUMEROS PARES: ");
        for (int n : numeros) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }

        input.close();
    }
}
