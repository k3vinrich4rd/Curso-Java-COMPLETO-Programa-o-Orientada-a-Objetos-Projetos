package programacaofuncionaleexpressoeslambda.expressividade;

public class Exemplo {
    public static void main(String[] args) {

        /* Código expressivo
        Integer sum = 0;
        for (Integer x : list) {
            sum += x;
        } */


        /* Código conciso
        Integer sum = list.stream().reduce(0, Integer::sum);
         */



    }
}
