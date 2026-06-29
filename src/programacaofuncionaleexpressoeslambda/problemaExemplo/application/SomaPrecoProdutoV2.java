package programacaofuncionaleexpressoeslambda.problemaExemplo.application;


import programacaofuncionaleexpressoeslambda.problemaExemplo.entities.Product;
import programacaofuncionaleexpressoeslambda.problemaExemplo.services.ProductServicesV2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

//Fazer um programa que, a partir de uma lista de produtos, calcule a soma dos preços
//Versão mais flexível, utilizando Predicate para permitir a filtragem de produtos com base em diferentes critérios
public class SomaPrecoProdutoV2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case", 80.90));

        ProductServicesV2 productServicesV2 = new ProductServicesV2();
        double valorTotalSoma = productServicesV2.filteredSum(list, p -> p.getName().charAt(0) == 'M'
                || p.getName().charAt(0) == 'm');
        System.out.println("Valor total da soma dos produtos: " + String.format("%.2f", valorTotalSoma));


    }

}

