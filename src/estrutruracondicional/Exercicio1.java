package estrutruracondicional;

import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        if (numero < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }

        input.close();
    }
}
