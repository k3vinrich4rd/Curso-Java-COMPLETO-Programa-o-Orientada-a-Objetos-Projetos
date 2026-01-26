package vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
Problema "alturas"
Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/alturas.java

Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.

Exemplo:
Quantas pessoas serao digitadas? 5
Dados da 1a pessoa:
Nome: Joao
Idade: 15
Altura: 1.82
Dados da 2a pessoa:
Nome: Maria
Idade: 16
Altura: 1.60
Dados da 3a pessoa:
Nome: Teresa
Idade: 14
Altura: 1.58
Dados da 4a pessoa:
Nome: Carlos
Idade: 21
Altura: 1.65
Dados da 5a pessoa:
Nome: Paulo
Idade: 17
Altura: 1.78

Altura média: 1.69
Pessoas com menos de 16 anos: 40.0%
Joao
Teresa
 */
public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int quantidadeDePessoas = input.nextInt();
        input.nextLine();

        String[] nomes = new String[quantidadeDePessoas];
        int[] idades = new int[quantidadeDePessoas];
        double[] alturas = new double[quantidadeDePessoas];

        double soma = 0;
        int contador = 0;


        for (int i = 0; i < quantidadeDePessoas; i++) {
            System.out.println("Dados da " + (i + 1) + "º pessoa:");
            System.out.print("Nome: ");
            nomes[i] = input.nextLine();
            System.out.print("Idade: ");
            idades[i] = input.nextInt();
            input.nextLine();
            System.out.print("Altura: ");
            alturas[i] = input.nextDouble();
            input.nextLine();
        }

        for (double altura : alturas) {
            soma += altura;
        }

        double mediaDasAlturas = soma / alturas.length;
        System.out.printf("Altura média: %.2f", mediaDasAlturas);

        for (int idade : idades) {
            if (idade < 16) {
                contador++;
            }
        }

        double porcentagemMenoresDe16 = (contador * 100.0) / quantidadeDePessoas;
        System.out.printf("\nPessoas com menos de 16 anos: %.1f%%\n", porcentagemMenoresDe16);
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        input.close();
    }
}
