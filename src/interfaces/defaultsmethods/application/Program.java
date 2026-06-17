package interfaces.defaultsmethods.application;


/*
Problema exemplo
Fazer um programa para ler uma quantia e a duração em meses de um
empréstimo. Informar o valor a ser pago após decorrido o prazo do
empréstimo, conforme regras de juros do Brasil.A regra de cálculo de
juros do Brasil é juro composto padrão de 2% ao mês.
 */


import interfaces.defaultsmethods.services.BrazilInterestService;
import interfaces.defaultsmethods.services.InterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, months);
		
		System.out.println("Payment after " + months + " months:");
		System.out.printf("%.2f%n", payment);
		
		sc.close();
	}
}