package set.operacoes;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveIFExemplo {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        //é possível colocar um predicated
        set.removeIf(x -> x.length() >= 3);

        System.out.println(set.contains("Notebook"));
        for (String p : set) {
            System.out.println(p);
        }

    }
}

