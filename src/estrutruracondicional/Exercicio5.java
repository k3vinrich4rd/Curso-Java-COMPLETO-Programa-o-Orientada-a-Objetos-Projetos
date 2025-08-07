package estrutruracondicional;

import java.util.Locale;
import java.util.Scanner;

/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
 */
public class Exercicio5 {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o código do item: ");
        int codigoItem = input.nextInt();
        System.out.print("Digite a quantidade a comprar: ");
        int quantidade = input.nextInt();

        double preco;

        switch (codigoItem) {
            case 1:
                preco = 4.00 * quantidade;
                System.out.printf("Total: R$ %.2f", preco);
                break;
            case 2:
                preco = 4.50 * quantidade;
                System.out.printf("Total: R$ %.2f", preco);
                break;
            case 3:
                preco = 5.00 * quantidade;
                System.out.printf("Total: R$ %.2f", preco);
                break;
            case 4:
                preco = 2.00 * quantidade;
                System.out.printf("Total: R$ %.2f", preco);
                break;
            case 5:
                preco = 1.50 * quantidade;
                System.out.printf("Total: R$ %.2f", preco);
                break;
            default:
                System.out.println("Digite novamente a numeração escolhida para item, não esta presente no cardápio");
        }

        input.close();
    }
}
