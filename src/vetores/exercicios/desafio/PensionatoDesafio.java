package vetores.exercicios.desafio;

import java.util.Scanner;

public class PensionatoDesafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many rooms will be rented? ");
        int numeroDeQuartosAlugados = input.nextInt();

        if (numeroDeQuartosAlugados < 1 || numeroDeQuartosAlugados > 10) {
            System.out.println("O número informado inválido, encerrando...");
            input.close();
            return;
        }

        Quartos[] quartos = new Quartos[10];
        for (int i = 0; i < numeroDeQuartosAlugados; i++) {
            System.out.println("Rent #" + (i + 1) + ":");
            input.nextLine(); // Limpa o buffer
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();
            System.out.print("Room: ");
            int numberRoom = input.nextInt();

            // Verifica se o quarto está ocupado antes de alugar
            if (quartos[numberRoom] == null) {
                quartos[numberRoom] = new Quartos(name, email);
            } else {
                System.out.println("O quarto solicitado já está ocupado! Escolha outro.");
                i--; // Repete o loop para o estudante em questão
            }
        }

        System.out.println("\nBusy rooms:");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i].getNome() + ", " + quartos[i].getEmail());
            }
        }

        input.close();
    }
}