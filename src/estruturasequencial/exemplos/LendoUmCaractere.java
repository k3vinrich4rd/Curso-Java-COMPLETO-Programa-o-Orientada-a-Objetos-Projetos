package estruturasequencial.exemplos;

import java.util.Scanner;

public class LendoUmCaractere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char x;
        x = input.next().charAt(0);
        System.out.println("Você digitou: " + x);

        input.close();
    }
}
