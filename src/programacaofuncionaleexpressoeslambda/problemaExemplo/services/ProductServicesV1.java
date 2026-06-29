package programacaofuncionaleexpressoeslambda.problemaExemplo.services;

import programacaofuncionaleexpressoeslambda.problemaExemplo.entities.Product;

import java.util.List;

public class ProductServicesV1 {

    //Exemplo de implementação sem o uso de Predicate, apenas com um método específico para filtrar produtos cujo nome começa com a letra "T"
    //Utilizavel mas é menos flexível, pois não permite a reutilização do método para outros critérios de filtragem
    public double filteredSum(List<Product> products) {
        double sum = 0.0;
        for (Product product: products) {
            if (product.getName().charAt(0) == 'T' || product.getName().charAt(0) == 't') {
                sum += product.getPrice();
            }
        }
        return sum;
    }
}
