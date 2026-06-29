package programacaofuncionaleexpressoeslambda.function.exemplos.exemplos;

import programacaofuncionaleexpressoeslambda.demo1.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Exemplo2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case", 80.90));

        //O map é uma operação intermediária que transforma cada elemento da lista em outro elemento, no caso, o nome do produto em maiúsculo.
        //Neste caso executa o método apply da classe UpperCaseName que implementa a interface Function, que recebe um Product e retorna uma String.
        //O collect é uma operação terminal que transforma o stream em uma lista.
        List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
        //Reference method para println
        names.forEach(System.out::println);

    }
}
