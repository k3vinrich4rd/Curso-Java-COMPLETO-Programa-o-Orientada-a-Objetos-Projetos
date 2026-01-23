package vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemploAltura {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de altura que são lidas: ");
        int n = input.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a " + (i + 1) + " altura: ");
            vect[i] = input.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }

        double mediaDasAlturas = soma / n;
        System.out.printf("AVERAGE HEIGHT: %.2f", mediaDasAlturas);


    }
}
