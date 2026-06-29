package programacaofuncionaleexpressoeslambda.function.exemplos.exemplos;

import programacaofuncionaleexpressoeslambda.demo1.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Exemplo6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case", 80.90));

        //Expressão, lambda inline onde o conceito de function é aplicado mas é mais simples e direto, sem a necessidade de criar uma classe separada para a função.
        //Declarar a expressão lambda inline diretamente no método map() para transformar o nome do produto em maiúsculo
        //Forma mais enxuta de usar o toList() sem necessidade de usar o Collectors.toList()
        List<String> names = list.stream().map(product -> product.getName().toUpperCase()).toList();
        //Reference method para println
        names.forEach(System.out::println);

    }
}
