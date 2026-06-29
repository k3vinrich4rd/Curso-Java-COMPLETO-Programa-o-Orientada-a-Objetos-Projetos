package programacaofuncionaleexpressoeslambda.consumer.exemplos.util;

import programacaofuncionaleexpressoeslambda.demo1.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {
    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() + product.getPrice() * 0.1);
    }
}
