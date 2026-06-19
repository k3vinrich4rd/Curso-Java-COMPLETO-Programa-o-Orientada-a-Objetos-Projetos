package genericssetmap.tiposcuringa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Porém, não é possível adicionar dados a uma
coleção de tipo curinga
O compilador não sabe qual é o tipo específico do qual a lista foi instanciada
 */

public class Exemplo3 {
    public static void main(String[] args) {
        List<?> list = new ArrayList<Integer>();
        //list.add(3); // erro de compilação
    }

}
