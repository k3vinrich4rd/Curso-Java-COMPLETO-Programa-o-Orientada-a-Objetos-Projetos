package programacaofuncionaleexpressoeslambda.problemaExemplo.services;

import programacaofuncionaleexpressoeslambda.problemaExemplo.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductServicesV2 {

    //Exemplo de implementação com o uso de Predicate, permitindo a filtragem de produtos com base em diferentes critérios
    //Mais flexível, pois permite a reutilização do método para outros critérios de filtragem
    public double filteredSum(List<Product> products, Predicate<Product> criteria) {
        double sum = 0.0;
        for (Product product : products) {
            if (criteria.test(product)) {
                sum += product.getPrice();
            }
        }
        return sum;
    }
}
