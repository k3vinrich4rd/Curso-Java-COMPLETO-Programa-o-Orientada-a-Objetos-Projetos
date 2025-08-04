package estruturasequencial.exercicios;

import java.util.Scanner;

/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */
public class Exercicio3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        int a = input.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = input.nextInt();
        System.out.print("Digite o valor de C: ");
        int c = input.nextInt();
        System.out.print("Digite o valor de D: ");
        int d = input.nextInt();

        input.close();

        int diferenca = (a * b) - (c * d);

        System.out.println("DIFERENCA = " + diferenca);


    }
}
