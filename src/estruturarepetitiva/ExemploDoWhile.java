package estruturarepetitiva;

import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char resposta;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double temperaturaCelsius = input.nextDouble();

            double fahrenheit = (temperaturaCelsius * 9 / 5) + 32;
            System.out.printf("Equivalênte em fahrenheit: %.2f", fahrenheit);
            System.out.print("Deseja repetir? [s/n] ");
            resposta = input.next().charAt(0);
        } while (resposta != 'n');
        input.close();
    }
}
