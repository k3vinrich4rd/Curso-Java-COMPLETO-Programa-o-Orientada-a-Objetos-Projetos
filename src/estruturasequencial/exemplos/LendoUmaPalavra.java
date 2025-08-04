package estruturasequencial.exemplos;

import java.util.Scanner;

public class LendoUmaPalavra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x;
        x = input.next();
        System.out.println("Você digitou: " + x);

        input.close();
    }
}
