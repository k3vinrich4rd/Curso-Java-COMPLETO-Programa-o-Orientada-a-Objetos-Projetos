package programacaofuncionaleexpressoeslambda.consumer.exemplos;

import programacaofuncionaleexpressoeslambda.demo1.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Exemplo5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case", 80.90));

        //Expressão, lambda, declarada inline
        list.forEach( p -> p.setPrice(p.getPrice() * 1.1));
        //Reference method para println
        list.forEach(System.out::println);

    }
}
