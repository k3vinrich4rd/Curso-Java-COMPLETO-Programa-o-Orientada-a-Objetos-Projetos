package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExemplo {
    public static void main(String[] args) {
        //Não mantém a ordem das inserções mas é indicado em contextos que ordem não importa mas sim a performace
        Set<String> set = new HashSet<>();
        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");


        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }
    }
}
