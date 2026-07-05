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

        // try-with-resources: garante que o BufferedReader será fechado automaticamente
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            // Lê cada linha do arquivo e cria um objeto Employee para cada linha
            String line = bufferedReader.readLine();

            // Enquanto houver linhas no arquivo, processa cada linha
            while (line != null) {
                String[] fields = line.split(",");
                employees.add(new Employee(
                        fields[0],
                        fields[1],
                        Double.parseDouble(fields[2])
                ));
                //Lê a próxima linha do arquivo
                line = bufferedReader.readLine();
            }

            // Usando Stream API para filtrar, mapear e ordenar os emails dos funcionários com salário superior ao valor fornecido
            List<String> emails = employees.stream()
                    .filter(employee -> employee.getSalary() > salary)
                    .map(Employee::getEmail)// Obtém o email do funcionário
                    .sorted() // Ordena os emails em ordem alfabética
                    .toList(); // Coleta os resultados em uma lista

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":"); // Exibe os emails filtrados e ordenados
            emails.forEach(System.out::println); // Imprime cada email na lista

            // Usando Stream API para calcular a soma dos salários dos funcionários cujo nome começa com 'M'
            double sum = employees.stream()// Inicia o stream de funcionários
                    .filter(employee -> employee.getName().startsWith("M"))// Filtra os funcionários cujo nome começa com 'M'
                    .map(Employee::getSalary)// Obtém o salário do funcionário
                    .reduce(0.0, Double::sum);// Reduz os salários filtrados somando-os, começando com 0.0

            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));


            // Exibe a soma dos salários dos funcionários cujo nome começa com 'M'
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        input.close();
    }
}