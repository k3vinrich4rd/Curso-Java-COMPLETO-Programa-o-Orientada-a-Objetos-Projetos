package genericssetmap.tiposcuringa.tiposcuringadelimitados;

/*
Problema 2 (princípio get/put)
Vamos fazer um método que copia os elementos de uma lista para uma
outra lista que pode ser mais genérica que a primeira.
List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
List<Double> myDoubles = Arrays.asList(3.14, 6.28);
List<Object> myObjs = new ArrayList<Object>();
copy(myInts, myObjs);
copy(myDoubles, myObjs)
 */

import java.util.ArrayList;
import java.util.List;

//Princípio get/put - contravariância
public class Contravariancia {
    public static void main(String[] args) {

        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        List<? super Number> myNums = myObjs;

        myNums.add(10);
        myNums.add(3.14);

        //motivo erro: pode ser um supertipo de number
       // Number x = myNums.get(0); // erro de compilacao
    }
}
