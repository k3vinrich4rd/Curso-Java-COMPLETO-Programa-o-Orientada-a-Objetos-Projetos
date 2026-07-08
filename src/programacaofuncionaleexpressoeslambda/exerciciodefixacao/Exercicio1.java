package programacaofuncionaleexpressoeslambda.exerciciodefixacao;

/* Fazer um programa para ler os dados (nome, email e salário)
de funcionários a partir de um arquivo em formato .csv.
Em seguida mostrar, em ordem alfabética, o e-mail dos
funcionários cujo salário seja superior a um dado valor
fornecido pelo usuário.
Mostrar também a soma dos salários dos funcionários cujo
nome começa com a letra 'M'. */

import programacaofuncionaleexpressoeslambda.exerciciodefixacao.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter full file path: ");
        String path = input.nextLine();

        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        // try-with-resources fecha o arquivo automaticamente ao final do bloco.
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            // Lê o arquivo linha por linha.
            String line = bufferedReader.readLine();

            // Cada linha do CSV vira um objeto Employee.
            while (line != null) {
                String[] fields = line.split(",");
                employees.add(new Employee(
                        fields[0],
                        fields[1],
                        Double.parseDouble(fields[2])
                ));
                // Avança para a próxima linha.
                line = bufferedReader.readLine();
            }

            // Filtra quem ganha acima do valor informado, extrai os e-mails e ordena.
            List<String> emails = employees.stream()
                    .filter(employee -> employee.getSalary() > salary)
                    .map(Employee::getEmail)
                    .sorted()
                    .toList();

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
            emails.forEach(System.out::println);

            // Filtra os nomes iniciados com M e soma seus salários.
            double sum = employees.stream()
                    .filter(employee -> employee.getName().startsWith("M"))
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);

            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        input.close();
    }
}