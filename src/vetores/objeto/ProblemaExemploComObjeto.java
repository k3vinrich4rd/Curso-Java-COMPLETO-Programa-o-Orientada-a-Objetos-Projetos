package vetores.objeto;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemploComObjeto {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int quantidadeDeProdutos = input.nextInt();
        input.nextLine();

        double somaDosPrecos = 0.0;

        Produto[] produtos = new Produto[quantidadeDeProdutos];
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Digite as informações referente ao " + (i + 1) + " º produto");
            System.out.print("nome: ");
            String nome = input.nextLine();
            System.out.print("preço: ");
            double preco = input.nextDouble();
            input.nextLine();
            produtos[i] = new Produto(nome, preco);
            somaDosPrecos += produtos[i].getPreco();
        }

        double mediaDosPrecosDosProdutos = somaDosPrecos / produtos.length;
        System.out.printf("AVERAGE PRICE: %.2f%n", mediaDosPrecosDosProdutos);

        for (Produto produto: produtos) {
            System.out.println("Nome do produto: " + produto.getNome() + " - Preço: " + produto.getPreco());
        }
        input.close();
    }
}
