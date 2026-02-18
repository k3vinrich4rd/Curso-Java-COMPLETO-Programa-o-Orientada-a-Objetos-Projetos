package listas.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("How many employees will be registered? ");
        int quantityEmployee = input.nextInt();

        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < quantityEmployee; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = input.nextInt();
            input.nextLine(); // Limpa o buffer
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Salary: ");
            double salary = input.nextDouble();

            employees.add(new Employee(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = input.nextInt();
        System.out.print("Enter the percentage: ");
        double percentage = input.nextDouble();

        Employee emp = null;
        for (Employee e : employees) {
            if (e.getId().equals(id)) {
                emp = e;
                break;
            }
        }

        if (emp != null) {
            emp.increaseSalary(percentage);
        } else {
            System.out.println("This id does not exist!");
        }

        input.close();
    }
}