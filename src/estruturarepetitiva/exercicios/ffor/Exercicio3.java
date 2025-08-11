package estruturarepetitiva.exercicios.ffor;

import java.util.Locale;
import java.util.Scanner;

/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
 */
public class Exercicio3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        double media;

        for (int i = 0; i < n; i++) {

            double n1 = input.nextDouble();
            double n2 = input.nextDouble();
            double n3 = input.nextDouble();

            media = (n1 * 2 + n2 * 3 + n3 * 5) / 10.0;
            System.out.printf("%.1f\n", media);
        }

        input.close();

    }
}
