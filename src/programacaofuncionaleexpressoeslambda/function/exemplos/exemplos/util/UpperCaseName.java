package programacaofuncionaleexpressoeslambda.function.exemplos.exemplos.util;

import programacaofuncionaleexpressoeslambda.demo1.entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {


    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
