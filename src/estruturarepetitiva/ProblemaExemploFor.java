package estruturarepetitiva;

import java.util.Scanner;

public class ProblemaExemploFor {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();

        int soma = 0;
        for (int i = 0; i < numero; i++) {
            int x = input.nextInt();
            soma += x;
        }

        System.out.println(soma);

        input.close();
    }
}
