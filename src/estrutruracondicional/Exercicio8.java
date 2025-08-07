package estrutruracondicional;

import java.util.Locale;
import java.util.Scanner;

/*
Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.

Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais.
 */
public class Exercicio8 {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Informe seu salário: ");

        double salario = input.nextDouble();
        double imposto;

        if (salario <= 2000.0) {
            // Faixa isenta
            System.out.println("Isento");
        } else if (salario <= 3000.0) {
            // 8% sobre o que exceder 2000 até 3000
            imposto = (salario - 2000.0) * 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        } else if (salario <= 4500.0) {
            // 8% sobre 1000 (de 2000.01 até 3000.00) + 18% sobre o que exceder 3000 até 4500
            imposto = (1000.0 * 0.08) + ((salario - 3000.0) * 0.18);
            System.out.printf("R$ %.2f\n", imposto);
        } else {
            // 8% sobre 1000 (de 2000.01 até 3000.00)
            // 18% sobre 1500 (de 3000.01 até 4500.00)
            // 28% sobre o que exceder 4500
            imposto = (1000.0 * 0.08) + (1500.0 * 0.18) + ((salario - 4500.0) * 0.28);
            System.out.printf("R$ %.2f\n", imposto);
        }

    }
}
