package set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ExemploEmConjunto {
    public static void main(String[] args) {
        // Cria o conjunto 'a' com alguns números pares e ímpares
        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        // Cria o conjunto 'b' com outros números, alguns em comum com 'a'
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        // =========================
        // União dos conjuntos (union)
        // Une todos os elementos de 'a' e 'b', sem repetições
        Set<Integer> c = new TreeSet<>(a); // Cria um novo conjunto baseado em 'a'
        c.addAll(b); // Adiciona todos os elementos de 'b' em 'c'
        System.out.println("União (a ∪ b): " + c);

        // =========================
        // Interseção dos conjuntos (intersection)
        // Mantém apenas os elementos que estão em ambos os conjuntos
        Set<Integer> d = new TreeSet<>(a); // Cria um novo conjunto baseado em 'a'
        d.retainAll(b); // Mantém apenas os elementos que também estão em 'b'
        System.out.println("Interseção (a ∩ b): " + d);

        // =========================
        // Diferença dos conjuntos (difference)
        // Remove do conjunto 'a' todos os elementos que também estão em 'b'
        Set<Integer> e = new TreeSet<>(a); // Cria um novo conjunto baseado em 'a'
        e.removeAll(b); // Remove todos os elementos de 'b' do conjunto 'e'
        System.out.println("Diferença (a - b): " + e);
    }
}
