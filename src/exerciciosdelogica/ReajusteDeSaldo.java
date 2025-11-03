package exerciciosdelogica;

/*
3. Informar um saldo e imprimir o saldo com reajuste de 1%.
 */
import java.util.Scanner;

public class ReajusteDeSaldo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Informe um saldo: ");
        double saldo = input.nextDouble();

        double reajusteSaldo = reajusteSaldoDeUmPorCento(saldo);
        System.out.println("Saldo com reajuste de um por cento: " + reajusteSaldo);
    }

    private static double reajusteSaldoDeUmPorCento(double saldo) {
        double reajusteUmPorcento = saldo * 0.01;
        return saldo + reajusteUmPorcento;
    }
}
