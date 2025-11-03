package poo.exercicios.employee;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = input.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = input.nextDouble();
        System.out.print("Tax: " );
        employee.tax = input.nextDouble();

        System.out.println(employee);

        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary(input.nextDouble());

        System.out.println("Update data: " + employee);
    }

}
