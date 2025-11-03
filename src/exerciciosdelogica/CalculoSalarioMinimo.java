package exerciciosdelogica;

/*
5. Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00)
 */

import java.util.Scanner;

public class CalculoSalarioMinimo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Informe seu salário: ");
        double salario = input.nextDouble();

        double calculaQuantidadeDeSalarioMinimos = calculaQuantidadeDeSalarioMinimos(salario);
        System.out.printf("Você ganha %.1f salários mínimos: ", calculaQuantidadeDeSalarioMinimos);
        input.close();
    }

    private static double calculaQuantidadeDeSalarioMinimos(double salario) {
        return  (salario / 788.0);
    }
}
