package programacaofuncionaleexpressoeslambda.transparenciareferencial;

import java.util.Arrays;
//Exemplo sem transparência referencial, pois o método basicamente não depende somente dos valores declarados por ele
public class ExemploSemTransparenciaReferencial {
    public static int globalValue = 3;

    public static void main(String[] args) {
        int[] vect = new int[]{3, 4, 5};
        changeOddValues(vect);
        System.out.println(Arrays.toString(vect));
    }


    public static void changeOddValues(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += globalValue;
            }
        }
    }
}