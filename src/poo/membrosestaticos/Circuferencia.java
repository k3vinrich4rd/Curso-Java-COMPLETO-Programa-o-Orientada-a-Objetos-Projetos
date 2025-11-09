package poo.membrosestaticos;

import java.util.Locale;
import java.util.Scanner;

public class Circuferencia {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        double c = circuference(radius);
        double v = volume(radius);


        System.out.printf("Circuference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f", PI);

        input.close();
    }

    private static double volume(double radius) {
        return 4.0 * PI * Math.pow(radius, 3) / 3;
    }

    private static double circuference(double radius) {
        return 2.0 * PI * radius;
    }
}
