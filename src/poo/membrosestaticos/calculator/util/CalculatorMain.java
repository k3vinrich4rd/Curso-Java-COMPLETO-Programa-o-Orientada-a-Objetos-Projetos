package poo.membrosestaticos.calculator.util;

import java.util.Locale;
import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);


        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        double c = Calculator.circuference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circuference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f", Calculator.PI);

        input.close();
    }
}
