package vetores.exercicios.desafio;

/*
A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N representando 
o número de estudantes que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. 
Para cada registro de aluguel, informar o nome e email do estudante, bem como qual dos quartos ele escolheu (de 0 a 9). 
Suponha que seja escolhido um quarto vago. Ao final, seu programa deve imprimir um relatório de todas as ocupações do pensionato, 
por ordem de quarto, conforme exemplo.

Exemplo de execução:


How many rooms will be rented? 3

Rent #1:
Name: Maria Green
Email: maria@gmail.com
Room: 5

Rent #2:
Name: Marco Antonio
Email: marco@gmail.com
Room: 1

Rent #3:
Name: Alex Brown
Email: alex@gmail.com
Room: 8

Busy rooms:
1: Marco Antonio, marco@gmail.com
5: Maria Green, maria@gmail.com
8: Alex Brown, alex@gmail.com
 */

import java.util.Scanner;

public class QuartoMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many rooms will be rented? ");
        int quantidadeQuartos = input.nextInt();

        Quarto[] quartos = new Quarto[10];

        for (int i = 0; i < quantidadeQuartos; i++) {
            System.out.println("Rent #" + (i + 1) + ":");
            System.out.print("Name: ");
            input.nextLine();
            String nome = input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();
            System.out.print("Room: ");
            int numeroDoQuarto = input.nextInt();

            System.out.println();

            if (quartos[numeroDoQuarto] == null) {
                quartos[numeroDoQuarto] = new Quarto(nome, email);
            } else {
                System.out.println("Quarto indisponível! Escolha outro.");
                i--; //repete o fluxo somente para o estudante em questão
            }
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i].getNome() + ", " + quartos[i].getEmail());
            }
        }

        input.close();
    }

}
