package set.operacoes;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveExemplo {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        set.remove("Tablet");

        System.out.println(set.contains("Notebook"));
        for (String p : set) {
            System.out.println(p);
        }

    }
}

