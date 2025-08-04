package estruturasequencial.exercicios;

import java.util.Scanner;

/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:

a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

 */
public class Exercicio6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valorPi = 3.14159;

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double areaTrianguloRetangulo = (a * c) / 2;
        double areaCirculo = valorPi * Math.pow(c, 2);
        double areaTrapezio = ((a + b) * c) / 2;
        double areaQuadrado = Math.pow(b, 2);
        double areaRetangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

        input.close();


    }
}
