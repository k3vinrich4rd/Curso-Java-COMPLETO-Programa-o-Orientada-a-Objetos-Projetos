package programacaofuncionaleexpressoeslambda.stream.pipeline;

// Arrays: utilitário usado para criar listas e imprimir arrays.
import java.util.Arrays;

// List: coleção ordenada de elementos.
import java.util.List;

// Collectors: usado para transformar o resultado final da stream em lista.
import java.util.stream.Collectors;

// Stream: fluxo de dados processado em etapas como map, filter e reduce.
import java.util.stream.Stream;

public class Exemplo {
    public static void main(String[] args) {

        // =========================================================
        // 1) FONTE DE DADOS
        // =========================================================
        // Lista que servirá como fonte de dados do pipeline.
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        // =========================================================
        // 2) MAP - TRANSFORMANDO OS ELEMENTOS
        // =========================================================
        // stream() inicia o processamento da lista.
        // map(...) transforma cada número em seu valor multiplicado por 10.
        Stream<Integer> st1 = list.stream().map(p -> p * 10);

        // toArray() é uma operação terminal: encerra a stream e gera um array.
        System.out.println(Arrays.toString(st1.toArray()));

        // =========================================================
        // 3) REDUCE - REDUZINDO VÁRIOS VALORES A UM SÓ
        // =========================================================
        // reduce(...) combina todos os elementos até gerar um único resultado.
        // Aqui ele soma os valores da lista começando em 0.
        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum = " + sum);

        // =========================================================
        // 4) PIPELINE DE STREAM
        // =========================================================
        // Pipeline = sequência de operações aplicadas na stream.
        // Neste exemplo: filtra pares, multiplica por 10 e gera uma nova lista.
        List<Integer> newList = list.stream()

                // filter(...) mantém apenas os números pares.
                .filter(x -> x % 2 == 0)

                // map(...) transforma os pares filtrados em valores multiplicados por 10.
                .map(x -> x * 10)

                // collect(...) é terminal e devolve o resultado em forma de lista.
                .collect(Collectors.toList());

        // Saída esperada: [40, 100]
        System.out.println(Arrays.toString(newList.toArray()));
    }
}