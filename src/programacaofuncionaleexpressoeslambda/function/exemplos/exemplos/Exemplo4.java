package programacaofuncionaleexpressoeslambda.function.exemplos.exemplos;

import programacaofuncionaleexpressoeslambda.demo1.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exemplo4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case", 80.90));


        //exemplo de implementação de uma função que recebe um produto e retorna o nome do produto em maiúsculo
        //É uma expressão lambda declarada
        Function<Product, String> function = product -> product.getName().toUpperCase();
        List<String> names = list.stream().map(function).collect(Collectors.toList());
        //Reference method para println
        names.forEach(System.out::println);

    }
}
