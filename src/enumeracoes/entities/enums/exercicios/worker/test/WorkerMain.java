package enumeracoes.entities.enums.exercicios.worker.test;

import enumeracoes.entities.enums.exercicios.worker.entities.Department;
import enumeracoes.entities.enums.exercicios.worker.entities.HourContract;
import enumeracoes.entities.enums.exercicios.worker.entities.Worker;
import enumeracoes.entities.enums.exercicios.worker.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class WorkerMain {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter department's name: ");
        String nameDepartment = input.nextLine();
        Department department = new Department(nameDepartment);

        System.out.print("Enter worker data: ");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Level: ");
        String level = input.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = input.nextDouble();
        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, department);

        System.out.println("How many contracts to this worker? ");
        int quantityContracts = input.nextInt();

        for (int i = 0; i < quantityContracts; i++) {
            System.out.println("Enter contract #" + (i + 1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(input.next());
            System.out.print("Value per hour: ");
            double valorPorHora = input.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = input.nextInt();

            HourContract contract = new HourContract(contractDate, valorPorHora, hours);
            worker.addContract(contract);

        }

        System.out.println("Enter month and year to calculate income (MMM/YYYY): ");
        String monthAndYear = input.nextLine();
        int month = Integer.parseInt((monthAndYear.substring(0,2)));
        int year = Integer.parseInt((monthAndYear.substring(3)));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + " : " + String.format("%.2f", worker.income(year, month)));


    }
}
