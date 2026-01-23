package vetores.exercicios;


import java.util.Locale;
import java.util.Scanner;

/*
Problema "dados_pessoas"
Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/dados_pessoas.java
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.
Exemplo:
Quantas pessoas serao digitadas? 5
Altura da 1a pessoa: 1.70
Genero da 1a pessoa: F
Altura da 2a pessoa: 1.83
Genero da 2a pessoa: M
Altura da 3a pessoa: 1.54
Genero da 3a pessoa: M
Altura da 4a pessoa: 1.61
Genero da 4a pessoa: F
Altura da 5a pessoa: 1.75
Genero da 5a pessoa: F
Menor altura = 1.54
Maior altura = 1.83
Media das alturas das mulheres = 1.69
Numero de homens = 2
 */
public class DadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int quantidadeDePessoas = input.nextInt();

        double[] alturas = new double[quantidadeDePessoas];
        char[] genero = new char[quantidadeDePessoas];

        double somaAlturaMulheres = 0;
        double mediaAlturaMulheres;
        int quantidadeHomens = 0;
        int quantidadeDeMulheres = 0;

        for (int i = 0; i < quantidadeDePessoas; i++) {
            System.out.print("Altura da " + (i + 1) + "º pessoa: ");
            alturas[i] = input.nextDouble();
            System.out.print("Gênero da " + (i + 1) + "º pessoa: ");
            genero[i] = input.next().charAt(0);
        }

        double menorAltura = alturas[0];
        double maiorAltura = alturas[0];

        for (double altura : alturas) {
            if (altura < menorAltura) {
                menorAltura = altura;
            }
        }

        for (double altura : alturas) {
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
        }

        for (int i = 0; i < quantidadeDePessoas; i++) {
            if (genero[i] == 'F' || genero[i] == 'f') {
                somaAlturaMulheres += alturas[i];
                quantidadeDeMulheres++;
            } else {
                quantidadeHomens++;
            }
        }

        mediaAlturaMulheres = somaAlturaMulheres / quantidadeDeMulheres;

        System.out.printf("\nMenor altura %.2f", menorAltura);
        System.out.printf("\nMaior altura %.2f", maiorAltura);
        System.out.printf("\nMédia das alturas das mulheres = %.2f", mediaAlturaMulheres);
        System.out.println("\nNúmero de homens = " + quantidadeHomens);

        input.close();
    }
}
