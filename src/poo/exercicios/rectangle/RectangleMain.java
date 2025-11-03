package poo.exercicios.rectangle;

import java.util.Locale;
import java.util.Scanner;

public class RectangleMain {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();


        System.out.println("Enter rectangle width and height: ");
        rectangle.width = input.nextDouble();
        rectangle.height = input.nextDouble();

        System.out.println(rectangle);

    }

}
