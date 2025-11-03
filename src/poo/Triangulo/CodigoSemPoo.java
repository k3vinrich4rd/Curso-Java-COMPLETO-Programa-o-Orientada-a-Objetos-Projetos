package poo.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class CodigoSemPoo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double xa, xb, xc, ya, yb, yc;

        System.out.println("Enter the measures of triangle X: ");
        xa = input.nextDouble();
        xb = input.nextDouble();
        xc = input.nextDouble();

        System.out.println("Enter the measures of triangle X: ");
        ya = input.nextDouble();
        yb = input.nextDouble();
        yc = input.nextDouble();

        double p = (xa + xb + xc) / 2;
        double areaX = Math.sqrt(p * (p - xa) * (p - xb) * (p - xc));

        p = (ya + yb + yc) / 2;
        double areaY = Math.sqrt(p * (p - ya) * (p - yb) * (p - yc));

        System.out.printf("Larger area: %.4f%n", areaX);
        System.out.printf("Larger area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Large area: X");
        } else {
            System.out.println("Large area: Y");
        }

        input.close();
    }
}
