package set.exerciciodefixacao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CursosOnline {
    public static void main(String[] args) {
        Set<Integer> students = new HashSet<>();

        Scanner input = new Scanner(System.in);
        System.out.println("How many students for course A? ");
        int quantityStudentCourseA = input.nextInt();
        for (int i = 0; i < quantityStudentCourseA; i++) {
            int studentIdA = input.nextInt();
            students.add(studentIdA);
        }

        System.out.println("How many students for course B? ");
        int quantityStudentCourseB = input.nextInt();
        for (int i = 0; i < quantityStudentCourseB; i++) {
            int studentIdB = input.nextInt();
            students.add(studentIdB);
        }

        System.out.println("How many students for course C? ");
        int quantityStudentCourseC = input.nextInt();
        for (int i = 0; i < quantityStudentCourseC; i++) {
            int studentIdC = input.nextInt();
            students.add(studentIdC);
        }

        System.out.println("Total students: " + students.size());

        input.close();
    }

}
