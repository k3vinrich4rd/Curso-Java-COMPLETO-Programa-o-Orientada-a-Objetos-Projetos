package programacaofuncionaleexpressoeslambda.predicate.exemplos;

import programacaofuncionaleexpressoeslambda.demo1.entities.Product;
import programacaofuncionaleexpressoeslambda.predicate.exemplos.utils.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Exemplo1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD case", 80.90));

        //Exemplo de uso:
        list.removeIf(new ProductPredicate());

        for (Product product : list) {
            System.out.println(product);
        }

    }
}
