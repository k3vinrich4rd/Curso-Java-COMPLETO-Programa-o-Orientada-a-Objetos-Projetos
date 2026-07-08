package matrizes;

import java.util.Scanner;

public class MatrizExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Primeiro o usuário informa a quantidade de linhas e colunas.
        System.out.print("Informe o número de linhas: ");
        int linhas = scanner.nextInt();
        System.out.print("Informe o número de colunas: ");
        int colunas = scanner.nextInt();

        // Cria a matriz com o tamanho informado.
        int[][] matriz = new int[linhas][colunas];

        // Preenche a matriz percorrendo linha por linha.
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Digite o valor para matriz[%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Exibe a matriz usando for-each para percorrer cada linha.
        System.out.println("Matriz informada:");
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}