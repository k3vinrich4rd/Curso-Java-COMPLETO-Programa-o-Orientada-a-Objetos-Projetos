package exerciciosdelogica;

/*
4. Escrever um algoritmo que lê: -
a porcentagem do IPI a ser acrescido no valor das peças
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
 - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
 */

import java.util.Scanner;

public class PorcentagemIpi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Informe a porcentagem do IPI: ");
        double porcentagemIpi = input.nextDouble();

        System.out.print("Informe o código da peça 1: ");
        String codigoPeca1  = input.next();

        System.out.print("Informe o valor unitário da peça 1: ");
        double valorUnitarioPeca1 = input.nextDouble();

        System.out.print("Informe a quantidade de peças da peça 1: ");
        int quantidadePecas1 = input.nextInt();

        System.out.print("Informe o código da peça 2: ");
        String codigoPeca2 = input.next();

        System.out.print("Informe a quantidade de peças da peça 2: ");
        double valorUnitarioPeca2 = input.nextDouble();

        System.out.print("Informe a quantidade de peça: ");
        int quantidadePecas2 = input.nextInt();


        double resultadoSomaDasPecas = calculaSomaDasPecas(valorUnitarioPeca1, quantidadePecas1, valorUnitarioPeca2, quantidadePecas2);
        double acessimoDeIpiSobreAsPecas = calculaTotalComIpi(porcentagemIpi, resultadoSomaDasPecas);

        System.out.println("Codigo peça 1: " + codigoPeca1  + "\n" + "Código peça 2: " + codigoPeca2);
        System.out.printf("Valor total a ser pago já com o Ipi aplicado sobre as peças vendidas: %.2f ", acessimoDeIpiSobreAsPecas);
        input.close();
    }

    public static double calculaSomaDasPecas(double valorUnitarioPeca1, int quantidadePeca1, double valorUnitarioPeca2, int quantidadePeca2) {
        return valorUnitarioPeca1 * quantidadePeca1 + valorUnitarioPeca2 * quantidadePeca2;
    }


    public static double calculaTotalComIpi(double ipi, double somaDasPecas) {
        return somaDasPecas * (ipi / 100 + 1);
    }
}
