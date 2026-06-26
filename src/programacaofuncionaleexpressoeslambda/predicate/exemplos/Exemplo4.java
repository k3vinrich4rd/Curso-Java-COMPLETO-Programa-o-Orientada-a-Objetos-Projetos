package programacaofuncionaleexpressoeslambda.predicate.exemplos;

import programacaofuncionaleexpressoeslambda.demo1.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Exemplo4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD case", 80.90));

        //Expressão, lambda, declarada
        Predicate<Product> pred = p -> p.getPrice() >= 100.0;
        list.removeIf(pred);

        for (Product product : list) {
            System.out.println(product);
        }

    }
}
