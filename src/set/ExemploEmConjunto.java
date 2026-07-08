package set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ExemploEmConjunto {
    public static void main(String[] args) {
        // Conjuntos base usados nas operações.
        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        // União: reúne todos os elementos dos dois conjuntos, sem repetição.
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println("União (a ∪ b): " + c);

        // Interseção: mantém apenas os elementos comuns aos dois conjuntos.
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println("Interseção (a ∩ b): " + d);

        // Diferença: remove de 'a' os elementos que também existem em 'b'.
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println("Diferença (a - b): " + e);
    }
}
