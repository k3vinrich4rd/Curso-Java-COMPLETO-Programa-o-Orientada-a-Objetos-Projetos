package vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
Problema "abaixo_da_media"
Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/abaixo_da_media.java

Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

Exemplo:
Quantos elementos vai ter o vetor? 4
Digite um numero: 10.0
Digite um numero: 15.5
Digite um numero: 13.2
Digite um numero: 9.8

MEDIA DO VETOR = 12.125
ELEMENTOS ABAIXO DA MEDIA:
10.0
9.8
 */
public class AbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int elementos = input.nextInt();
        double soma = 0;


        double[] numeros = new double[elementos];
        for (int i = 0; i < elementos; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = input.nextDouble();
            soma += numeros[i];
        }

        double media = soma / numeros.length;
        System.out.printf("MEDIA DO VETOR = %.3f", media);

        System.out.println("\nELEMENTOS ABAIXO DA MEDIA: ");
        for (double numero : numeros) {
            if (numero < media) {
                System.out.println(numero);
            }
        }


        input.close();
    }
}
