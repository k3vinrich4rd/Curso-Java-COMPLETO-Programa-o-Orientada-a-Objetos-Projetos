package genericssetmap.tiposcuringa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Com tipos curinga podemos fazer métodos
que recebem um genérico de "qualquer tipo":
 */

public class Exemplo2 {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
