package genericssetmap.tiposcuringa;

import java.util.ArrayList;
import java.util.List;


/*
Generics são invariantes
List<Object> não é o supertipo de qualquer tipo de lista:
List<Object> myObjs = new ArrayList<Object>();
List<Integer> myNumbers = new ArrayList<Integer>();
myObjs = myNumbers; // erro de compilação
O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:
 */
public class Exemplo1 {
    public static void main(String[] args) {

        List<?> myObjs = new ArrayList<Object>();
        List<Integer> myNumbers = new ArrayList<Integer>();
        myObjs = myNumbers;

        Object obj;
        Integer x = 10;
        obj = x;
    }
}
