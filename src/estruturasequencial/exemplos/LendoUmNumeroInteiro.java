package estruturasequencial.exemplos;

import java.util.Scanner;

public class LendoUmNumeroInteiro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        x = input.nextInt();
        System.out.println("Você digitou: " + x);

        input.close();
    }
}
