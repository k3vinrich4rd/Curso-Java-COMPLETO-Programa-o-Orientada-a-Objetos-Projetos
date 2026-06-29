package programacaofuncionaleexpressoeslambda.problemaExemplo.application;


import programacaofuncionaleexpressoeslambda.problemaExemplo.entities.Product;
import programacaofuncionaleexpressoeslambda.problemaExemplo.services.ProductServicesV1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

//Fazer um programa que, a partir de uma lista de produtos, calcule a soma dos preços
//Somente dos produtos cujo nome começa com a letra "T"
public class SomaPrecoProdutoV1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case", 80.90));

        ProductServicesV1 productServicesV1 = new ProductServicesV1();
        double valorTotalSoma = productServicesV1.filteredSum(list);
        System.out.println("Valor total da soma dos produtos cujo nome começa com a letra 'T': " + String.format("%.2f", valorTotalSoma));


    }

}

