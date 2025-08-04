package estruturasequencial.exemplos;

import java.util.Scanner;

public class LendoUmNumeroComPontoFlutuante {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x;
        x = input.nextDouble();
        System.out.println("Você digitou: " + x);

        input.close();
    }
}
