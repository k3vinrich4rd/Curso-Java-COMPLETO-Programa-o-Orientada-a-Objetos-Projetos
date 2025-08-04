package estruturasequencial.exercicios;

import java.util.Scanner;

/*
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int segundoNumero = input.nextInt();

        int soma = primeiroNumero + segundoNumero;
        System.out.println("SOMA = " + soma);

        input.close();


    }
}
