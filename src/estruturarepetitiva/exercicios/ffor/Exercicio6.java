package estruturarepetitiva.exercicios.ffor;

import java.util.Locale;
import java.util.Scanner;

/*
Ler um número inteiro N e calcular todos os seus divisores.
 */
public class Exercicio6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        input.close();

    }
}
