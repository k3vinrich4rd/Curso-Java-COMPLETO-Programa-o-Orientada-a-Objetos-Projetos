package listas;

import java.util.ArrayList;
import java.util.List;

public class ListasExemplo1 {
    public static void main(String[] args) {

        // List é uma coleção dinâmica, diferente do array de tamanho fixo.
        List<String> nomes = new ArrayList<>();
        nomes.add("Maria");
        nomes.add("Alex");
        nomes.add("Bob");
        nomes.add("Anna");
        nomes.add(2, "Marco"); // Insere um elemento em uma posição específica.

        System.out.println(nomes.size()); // size() informa a quantidade de elementos.

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("-------------------------");

        // removeIf(...) remove elementos que atendem à condição.
        nomes.removeIf(x -> x.charAt(0) == 'M');

        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("-------------------------");
        System.out.println("Index of Bob: " + nomes.indexOf("Bob"));
        System.out.println("Index of Marco: " + nomes.indexOf("Marco"));

        System.out.println("-------------------------");

        // stream().filter(...).toList() cria uma nova lista com os elementos filtrados.
        List<String> resultFilter = nomes.stream().filter(x -> x.charAt(0) == 'A').toList();
        for(String result : resultFilter) {
            System.out.println(result);
        }

        System.out.println("-------------------------");

        // findFirst() pega o primeiro elemento do filtro, se existir.
        String name = nomes.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);


    }
}
