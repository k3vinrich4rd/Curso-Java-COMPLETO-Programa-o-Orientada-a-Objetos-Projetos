package estruturarepetitiva;

import java.util.Scanner;

public class ProblemaExemploWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();

        int soma = 0;

        while (numero != 0) {
            soma += numero;
            numero = input.nextInt();

        }

        System.out.println("Soma dos números: " + soma);
        input.close();

    }
}
