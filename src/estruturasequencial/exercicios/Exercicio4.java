package estruturasequencial.exercicios;

import java.util.Scanner;

/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
 */
public class Exercicio4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o número do funcionário: ");
        int numeroFuncionario = input.nextInt();
        System.out.print("Informe a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = input.nextInt();
        System.out.print("Informe o valor de ganho por hora: ");
        double ganhoPorHora = input.nextDouble();

        double salario = horasTrabalhadas * ganhoPorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f ", salario);


    }
}
