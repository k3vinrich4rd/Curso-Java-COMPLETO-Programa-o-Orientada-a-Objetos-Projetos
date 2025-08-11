package estruturarepetitiva.exercicios;

import java.util.Scanner;

/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
 */
public class Exercicio3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int gasolinha = 0;
        int alccol = 0;
        int diesel = 0;

        while (true) {

            int numero = input.nextInt();

            if (numero == 4) {
                break;
            }
            switch (numero) {
                case 1:
                    alccol += 1;
                    break;
                case 2:
                    gasolinha += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
            }

        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alccol);
        System.out.println("Gasolina: " + gasolinha);
        System.out.println("Diesel: " + diesel);

        input.close();
    }
}
