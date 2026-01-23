package vetores.exercicios;

import java.util.Scanner;

/*
Problema "media_pares"
Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/media_pares.java

Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"

Exemplo 1:
Quantos elementos vai ter o vetor? 6
Digite um numero: 8
Digite um numero: 2
Digite um numero: 11
Digite um numero: 14
Digite um numero: 13
Digite um numero: 20
MEDIA DOS PARES = 11.0

Exemplo 2:
Quantos elementos vai ter o vetor? 3
Digite um numero: 7
Digite um numero: 9
Digite um numero: 11
NENHUM NUMERO PAR
 */
public class MediaPares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int numero = input.nextInt();

        int[] numeros = new int[numero];

        int somaPares = 0;
        int quantidadePares = 0;

        double media;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = input.nextInt();
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
                quantidadePares++;
            }
        }

        if (quantidadePares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            media = (double) somaPares /quantidadePares;
            System.out.printf("MEDIA DOS PARES = %.1f", media);
        }


        input.close();
    }
}
