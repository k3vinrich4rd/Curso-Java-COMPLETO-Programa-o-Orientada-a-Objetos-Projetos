package programacaofuncionaleexpressoeslambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exemplo1 {
    public static void main(String[] args) {

        // Fonte de dados inicial para os exemplos.
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        /*
         * Stream:
         * fluxo de dados usado para processar elementos sem alterar a coleção original.
         *
         * map(...):
         * transforma cada elemento da stream.
         * Neste caso, cada número da lista é multiplicado por 10.
         */
        Stream<Integer> st1 = list.stream().map(p -> p * 10);

        // toArray() encerra o processamento da stream e gera um array.
        System.out.println(Arrays.toString(st1.toArray()));

        /*
         * Stream.of(...):
         * cria uma stream diretamente a partir dos valores informados.
         */
        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");

        System.out.println(Arrays.toString(st2.toArray()));

        /*
         * Stream.iterate(valorInicial, regra):
         * Cria uma sequência a partir de um valor inicial e de uma regra.
         *
         * Aqui:
         * começa em 0 e soma 2 a cada novo elemento.
         *
         * Como essa stream é infinita, usamos limit(10)
         * para pegar apenas os 10 primeiros valores.
         */
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);

        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        /*
         * Exemplo mais avançado: sequência de Fibonacci.
         *
         * Fibonacci:
         * cada número é a soma dos dois anteriores.
         *
         * Exemplo:
         * 0, 1, 1, 2, 3, 5, 8, 13...
         *
         * Aqui, cada elemento da stream é um array com dois valores:
         * [atual, próximo]
         *
         * Estado inicial:
         * [0, 1]
         *
         * Regra:
         * [segundo, primeiro + segundo]
         *
         * Depois, map(p -> p[0]) pega apenas o primeiro valor de cada par,
         * formando a sequência final de Fibonacci.
         */
        Stream<Long> st4 = Stream
                .iterate(
                        new Long[]{0L, 1L},
                        p -> new Long[]{p[1], p[0] + p[1]}
                )
                .map(p -> p[0]);

        // Como a sequência também é infinita, limitamos a 20 elementos.
        System.out.println(Arrays.toString(st4.limit(20).toArray()));
    }
}