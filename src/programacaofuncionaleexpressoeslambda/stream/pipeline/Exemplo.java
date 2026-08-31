package programacaofuncionaleexpressoeslambda.stream.pipeline;

// Arrays:
// classe utilitária usada aqui para:
// - criar lista com Arrays.asList(...)
// - imprimir arrays com Arrays.toString(...)
import java.util.Arrays;

// List:
// representa uma coleção ordenada de elementos.
import java.util.List;

// Collectors:
// fornece operações prontas para coletar os resultados de uma Stream.
// Aqui será usado para transformar a Stream novamente em List.
import java.util.stream.Collectors;

// Stream:
// representa um fluxo de dados que pode passar por várias etapas
// de processamento, como map, filter e reduce.
import java.util.stream.Stream;

public class Exemplo {
    public static void main(String[] args) {

        // =========================================================
        // 1) FONTE DE DADOS
        // =========================================================
        // Lista de números inteiros que será usada como origem das Streams.
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        // =========================================================
        // 2) MAP - TRANSFORMANDO OS ELEMENTOS
        // =========================================================
        // list.programacaofuncionaleexpressoeslambda.stream():
        // transforma a lista em uma Stream.
        //
        // map(p -> p * 10):
        // transforma cada elemento da Stream.
        // Cada número da lista será multiplicado por 10.
        //
        // Exemplo:
        // 3 -> 30
        // 4 -> 40
        // 5 -> 50
        // 10 -> 100
        // 7 -> 70
        Stream<Integer> st1 = list.stream().map(p -> p * 10);

        // toArray():
        // operação terminal que converte a Stream em array.
        //
        // Arrays.toString(...):
        // imprime o array de forma legível.
        //
        // Saída:
        // [30, 40, 50, 100, 70]
        System.out.println(Arrays.toString(st1.toArray()));

        // =========================================================
        // 3) REDUCE - REDUZINDO VÁRIOS VALORES A UM SÓ
        // =========================================================
        // reduce(valorInicial, acumulador):
        // combina os elementos da Stream até gerar um único resultado.
        //
        // 0:
        // valor inicial da soma.
        //
        // (x, y) -> x + y:
        // lambda acumuladora.
        // x = valor acumulado até agora
        // y = elemento atual da Stream
        //
        // Funciona assim:
        // 0 + 3 = 3
        // 3 + 4 = 7
        // 7 + 5 = 12
        // 12 + 10 = 22
        // 22 + 7 = 29
        //
        // Resultado final:
        // 29
        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum = " + sum);

        // =========================================================
        // 4) PIPELINE DE STREAM
        // =========================================================
        // Pipeline é uma sequência de operações aplicadas na Stream.
        //
        // Neste caso, o pipeline faz 3 etapas:
        // 1. filter(...)  -> filtra os elementos
        // 2. map(...)     -> transforma os elementos filtrados
        // 3. collect(...) -> gera o resultado final em forma de lista
        List<Integer> newList = list.stream()

                // filter(x -> x % 2 == 0):
                // mantém apenas os números pares.
                //
                // x % 2 == 0 significa:
                // "o resto da divisão por 2 é zero"
                //
                // Da lista original:
                // [3, 4, 5, 10, 7]
                //
                // ficam apenas:
                // [4, 10]
                .filter(x -> x % 2 == 0)

                // map(x -> x * 10):
                // multiplica por 10 os elementos que passaram pelo filtro.
                //
                // [4, 10] -> [40, 100]
                .map(x -> x * 10)

                // collect(Collectors.toList()):
                // operação terminal.
                // Coleta os elementos da Stream e monta uma nova List.
                .collect(Collectors.toList());

        // Imprime a nova lista gerada pelo pipeline.
        // Saída:
        // [40, 100]
        System.out.println(Arrays.toString(newList.toArray()));
    }
}