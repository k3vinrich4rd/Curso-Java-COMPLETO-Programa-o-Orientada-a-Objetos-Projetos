package listas;

import java.util.ArrayList;
import java.util.List;

public class ListasExemplo1 {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>(); // Para instanciar uma lista
        nomes.add("Maria"); // Para adicionar elementos em uma lista
        nomes.add("Alex");
        nomes.add("Bob");
        nomes.add("Anna");
        nomes.add(2, "Marco"); //Para adicionar elementos em uma determinada posição

        System.out.println(nomes.size()); //Para ver o tamanho da lista

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("-------------------------");
        nomes.removeIf(x -> x.charAt(0) == 'M');

        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("-------------------------");
        System.out.println("Index of Bob: " + nomes.indexOf("Bob")); // Para pegar a posição
        System.out.println("Index of Marco: " + nomes.indexOf("Marco"));

        System.out.println("-------------------------");

        //List<String> resultFilter = nomes.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // para filtrar informações na lista (Forma depreciada)
        List<String> resultFilter = nomes.stream().filter(x -> x.charAt(0) == 'A').toList(); //Forma atual
        for(String result : resultFilter) {
            System.out.println(result);
        }

        System.out.println("-------------------------");
        String name = nomes.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

        //nomes.remove(1); // Para remover elementos em uma determinada posição


    }
}
