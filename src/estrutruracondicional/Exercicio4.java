package estrutruracondicional;

import java.util.Scanner;

/*

Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas
 */
public class Exercicio4 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o horário inicial: ");
        int horarioInicial = input.nextInt();
        System.out.print("Digite o horário final do jogo: ");
        int horarioFinal = input.nextInt();

        int duracaoJogo = horarioFinal - horarioInicial;

        if (duracaoJogo <= 0) {
            duracaoJogo += 24;
        }
        System.out.println("O JOGO DUROU " + duracaoJogo + " HORA(S) ");


        input.close();
    }
}
