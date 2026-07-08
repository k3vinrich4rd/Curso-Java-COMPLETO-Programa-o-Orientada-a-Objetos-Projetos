package map.demo2;

import map.demo2.entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        // Aqui a chave do mapa é um objeto Product.
        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        // put(chave, valor): associa cada produto a um valor no mapa.
        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        // Mesmo sendo outro objeto, ps tem os mesmos dados de p1.
        Product ps = new Product("Tv", 900.0);

        // containsKey(...) só funciona como esperado porque Product implementa equals e hashCode.
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));


    }
}
