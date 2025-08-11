package estrutruracondicional;

import java.util.Scanner;

public class CondicionalTernario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número para representar a semana: ");
        int numeroSemana = input.nextInt();

        int numero = (numeroSemana > 1 ? numeroSemana + 1 : numeroSemana - 10);
        System.out.println(numero);


        input.close();
    }
}
