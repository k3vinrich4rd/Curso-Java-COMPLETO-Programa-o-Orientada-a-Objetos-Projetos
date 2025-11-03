package exerciciosdelogica;
/*1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/

import java.util.Scanner;

public class LeituraDeIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a sua idade em anos: ");
        int idadeAno = input.nextInt();
        System.out.print("Informe a sua idade em meses: ");
        int idadeMes = input.nextInt();
        System.out.print("Informe a sua idade em dias");
        int idadeDias = input.nextInt();

        if (idadeAno < 0 || idadeMes < 0 || idadeDias < 0) {
            System.out.println("Por favor, informe apenas valores positivos. ");
        } else {
            int idadeEmDias = calcularIdadeEmDias(idadeAno, idadeMes, idadeDias);
            System.out.println("A sua idade em dias é " + idadeEmDias + " dias");
        }

        input.close();
    }

    public static int calcularIdadeEmDias(int idadeAno, int idadeEmMes, int idadeEmDias) {
        int anoEmDias = 365 * idadeAno;
        int mesEmDias = 30 * idadeEmMes;

        return anoEmDias + mesEmDias + idadeEmDias;
    }

}
