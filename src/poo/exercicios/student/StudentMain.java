package poo.exercicios.student;

import java.util.Locale;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Digite seu nome: " );
        student.name = input.nextLine();
        System.out.print("Digite a sua primeira nota: ");
        student.nota1 = input.nextDouble();
        System.out.print("Digite a sua segunda nota: ");
        student.nota2 = input.nextDouble();
        System.out.print("Digite a sua terceira nota: ");
        student.nota3 = input.nextDouble();

        System.out.printf("%nFINAL GRADE = %.2f" , student.finalGrade() );

        if (student.finalGrade() < 60) {
            System.out.println("\nFAILED");
            System.out.printf("MISSING %.2f POINTS", student.missingPoints());
        } else {
            System.out.println("\nPASS");
        }

        input.close();

    }
}
