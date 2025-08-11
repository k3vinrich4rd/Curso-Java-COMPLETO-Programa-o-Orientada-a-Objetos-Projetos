package estruturarepetitiva.exercicios.ffor;

import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.
 */
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            int elevadoAoQuadrado = i * i;
            int elevadoAoCubo = i * i * i;

            System.out.printf("%d %d %d\n", i, elevadoAoQuadrado, elevadoAoCubo);
            //System.out.println(i + " " + elevadoAoQuadrado + " " + elevadoAoCubo);
        }
    }
}