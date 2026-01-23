package vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*

Problema "aprovados"
Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/aprovados.java

Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).

Exemplo:
Quantos alunos serao digitados? 4
Digite nome, primeira e segunda nota do 1o aluno:
Joao Silva
7.0
8.5
Digite nome, primeira e segunda nota do 2o aluno:
Maria Teixeira
9.2
6.5
Digite nome, primeira e segunda nota do 3o aluno:
Carlos Carvalho
5.0
6.0
Digite nome, primeira e segunda nota do 4o aluno:
Teresa Pires
5.5
6.5
Alunos aprovados:
Joao Silva
Maria Teixeira
Teresa Pires
 */
public class Aprovados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos alunos serão digitados: ");
        int quantidadeDeAlunos = input.nextInt();
        input.nextLine();

        String[] nomes = new String[quantidadeDeAlunos];
        double[] notasPrimeiroSemestre = new double[quantidadeDeAlunos];
        double[] notasSegundoSemestre = new double[quantidadeDeAlunos];

        double somaDasNotas;
        double mediaDasNotas;

        for (int i = 0; i < quantidadeDeAlunos; i++) {
            System.out.println("Digite, nome, primeira e segunda nota do " + (i + 1) + "º aluno: ");
            nomes[i] = input.nextLine();
            notasPrimeiroSemestre[i] = input.nextDouble();
            notasSegundoSemestre[i] = input.nextDouble();

            input.nextLine();
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < quantidadeDeAlunos; i++) {
            somaDasNotas = notasPrimeiroSemestre[i] + notasSegundoSemestre[i];
            mediaDasNotas = somaDasNotas / 2;

            if (mediaDasNotas >= 6.0) {
                System.out.println(nomes[i]);
            }
        }

        input.close();
    }
}
