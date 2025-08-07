package estrutruracondicional;

import java.util.Locale;
import java.util.Scanner;

/*

Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).

Se o ponto estiver na origem, escreva a mensagem “Origem”.

Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.
 */
public class Exercicio7 {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double x = input.nextDouble();
        System.out.print("Digite um segundo número: ");
        double y = input.nextDouble();

        // Verifica se o ponto está na origem (x = 0 e y = 0)
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        // Verifica se o ponto está sobre o eixo Y (x = 0, y diferente de 0)
        else if (x == 0) {
            System.out.println("Eixo Y");
        }
        // Verifica se o ponto está sobre o eixo X (y = 0, x diferente de 0)
        else if (y == 0) {
            System.out.println("Eixo X");
        }
        // Verifica se o ponto está no primeiro quadrante (x > 0 e y > 0)
        else if (x > 0 && y > 0) {
            System.out.println("Q1"); // Primeiro quadrante
        }
        // Verifica se o ponto está no segundo quadrante (x < 0 e y > 0)
        else if (x < 0 && y > 0) {
            System.out.println("Q2"); // Segundo quadrante
        }
        // Verifica se o ponto está no terceiro quadrante (x < 0 e y < 0)
        else if (x < 0 && y < 0) {
            System.out.println("Q3"); // Terceiro quadrante
        }
        // Verifica se o ponto está no quarto quadrante (x > 0 e y < 0)
        else if (x > 0 && y < 0) {
            System.out.println("Q4"); // Quarto quadrante
        }

        input.close();
    }
}
