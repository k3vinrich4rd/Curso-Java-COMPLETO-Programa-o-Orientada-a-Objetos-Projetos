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

//Princípio get/put - covariância
public class Covariancia {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;

        Number x = list.get(0);

        //motivo de erro: o compilador não sabe se pode ser compatível com outro tipo Number
        //list.add(20); // erro de compilação

    }
}
