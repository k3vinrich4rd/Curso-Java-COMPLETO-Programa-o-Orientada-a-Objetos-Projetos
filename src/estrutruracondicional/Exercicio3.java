package estrutruracondicional;

import java.util.Scanner;

/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
 */
public class Exercicio3 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int segundoNumero = input.nextInt();

        if (primeiroNumero % segundoNumero == 0 || segundoNumero % primeiroNumero == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        input.close();
    }
}
