package vetores.exercicios;

import java.util.Scanner;

/*
Problema "mais_velho"
Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/mais_velho.java

Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.

Exemplo:
Quantas pessoas voce vai digitar? 5
Dados da 1a pessoa:
Nome: Joao
Idade: 16
Dados da 2a pessoa:
Nome: Maria
Idade: 21
Dados da 3a pessoa:
Nome: Teresa
Idade: 15
Dados da 4a pessoa:
Nome: Carlos
Idade: 23
Dados da 5a pessoa:
Nome: Paulo
Idade: 17
PESSOA MAIS VELHA: Carlos
 */
public class MaisVelho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantas pessoas você vai digitar? ");
        int quantidadeDePessoas = input.nextInt();

        String[] nomes = new String[quantidadeDePessoas];
        int[] idades = new int[quantidadeDePessoas];
        input.nextLine();

        for (int i = 0; i < quantidadeDePessoas; i++) {
            System.out.println("Dados da " + (i + 1) + "º pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = input.nextLine();
            System.out.print("Idade: ");
            idades[i] = input.nextInt();
            input.nextLine();
        }

        int maiorIdade = idades[0];
        int posicaoMaiorIdade = 0;


        for (int i = 0; i < quantidadeDePessoas; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                posicaoMaiorIdade = i;
            }
        }

        System.out.print("PESSOA MAIS VELHA: " + nomes[posicaoMaiorIdade]);


        input.close();
    }
}
