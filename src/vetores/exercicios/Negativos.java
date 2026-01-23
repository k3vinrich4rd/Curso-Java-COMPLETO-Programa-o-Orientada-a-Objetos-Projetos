package vetores.exercicios;

import java.util.Scanner;

/*
Problema "negativos"
Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/negativos.java
Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
Exemplo:
Quantos numeros voce vai digitar? 6
Digite um numero: 8
Digite um numero: -2
Digite um numero: 9
Digite um numero: 10
Digite um numero: -3
Digite um numero: -7
NUMEROS NEGATIVOS: -2 -3 -7
 */
public class Negativos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int n = input.nextInt();

        if (n < 0 || n > 10) {
            System.out.print("Valor inválido, encerrando.. ");
            return;
        }

        int[] numeros = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextInt();
        }

        System.out.print("NUMEROS NEGATIVOS: ");
        for (int numero : numeros) {
            if (numero < 0) {
                System.out.print(numero + " ");
            }
        }
        input.close();
    }

}
