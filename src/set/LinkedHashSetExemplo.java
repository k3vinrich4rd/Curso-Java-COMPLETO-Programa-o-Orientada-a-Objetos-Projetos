package set;


import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Ordena, mas é mais lento
public class LinkedHashSetExemplo {
    public static void main(String[] args) {
       Set<String> set = new LinkedHashSet<>();
       set.add("Tv");
       set.add("Tablet");
       set.add("Notebook");

        System.out.println(set.contains("Notebook"));
        for (String p: set) {
            System.out.println(p);
        }

    }
}
