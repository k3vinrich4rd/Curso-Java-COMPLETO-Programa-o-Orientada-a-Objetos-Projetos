package set.demo1;

import set.demo1.entities.Product;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExemplo {
    public static void main(String[] args) {
        // Cria um conjunto do tipo TreeSet para armazenar objetos Product
        // TreeSet exige que os elementos sejam comparáveis para manter a ordem
        Set<Product> set = new TreeSet<>();

        // Adiciona três produtos ao conjunto
        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        // Percorre o conjunto e imprime cada produto
        // A ordem de impressão será determinada pelo método compareTo da classe Product
        for (Product p : set) {
            System.out.println(p);
        }
    }
}