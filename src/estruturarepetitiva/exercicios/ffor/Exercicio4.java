package estruturarepetitiva.exercicios.ffor;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */
public class Exercicio4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        double divisao;

        for (int i = 0; i < n; i++) {

            int n1 = input.nextInt();
            int n2 = input.nextInt();

            if (n2 == 0) {
                System.out.println("divisao impossivel");
            } else {
                divisao = (double) n1 / n2;
                System.out.printf("%.1f\n", divisao);
            }

        }

        input.close();

    }
}
