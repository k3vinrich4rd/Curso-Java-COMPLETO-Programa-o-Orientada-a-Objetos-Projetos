package estruturasequencial.exercicios;
import java.util.Scanner;

/*
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.

Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
*/
public class Exercicio2 {
    public static void main(String[] args) {
        double valorPi = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o valor do raio do circulo: ");
        double valorRaio = input.nextDouble();

        double areaCirculo = valorPi * Math.pow(valorRaio, 2);
        System.out.printf("A= %.4f", areaCirculo);

        input.close();


    }
}
