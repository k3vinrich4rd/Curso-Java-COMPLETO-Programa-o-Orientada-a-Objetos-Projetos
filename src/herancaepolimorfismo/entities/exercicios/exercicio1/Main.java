package herancaepolimorfismo.entities.exercicios.exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int quantityOfEmployees = input.nextInt();
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < quantityOfEmployees; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char responseEmployee = input.next().charAt(0);
            input.nextLine();
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Hours: ");
            int hours = input.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = input.nextDouble();
            if (responseEmployee == 'n' || responseEmployee == 'N') {
                employees.add(new Employee(name, hours, valuePerHour));
            } else {
                System.out.print("Additional charge: ");
                double additionalCharge = input.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }
        }

        System.out.println("\nPAYMENTS: ");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
        }

        input.close();


    }
}
