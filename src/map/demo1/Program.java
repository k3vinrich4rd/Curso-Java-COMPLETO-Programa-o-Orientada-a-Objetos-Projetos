package map.demo1;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        // Map armazena pares no formato chave -> valor.
        Map<String, String> cookies = new TreeMap<>();

        // put(...) insere ou atualiza um valor associado a uma chave.
        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711122");

        // remove(...) exclui a entrada da chave informada.
        cookies.remove("email");

        // Se a chave já existir, put(...) substitui o valor anterior.
        cookies.put("phone","99771133");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("All cookies: ");

        // keySet() devolve o conjunto de chaves do mapa.
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
