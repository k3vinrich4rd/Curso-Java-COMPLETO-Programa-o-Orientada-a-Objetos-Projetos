package programacaofuncionaleexpressoeslambda.demo1.application;

import programacaofuncionaleexpressoeslambda.demo1.entities.Product;

import java.util.ArrayList;
import java.util.List;

/*
Conceito central demonstrado

Programação funcional aplicada à ordenação: um Comparator é definido como função (lambda) e passado ao algoritmo de ordenação, desacoplando a “regra de ordenação” do modelo de domínio (Product não precisa implementar Comparable).
Benefícios:
Baixo acoplamento: múltiplos critérios podem coexistir fora da classe Product.
Código mais expressivo/conciso em comparação com classes anônimas verbosas.
Facilita a composição/troca de critérios em tempo de desenvolvimento.
Contrato do comparador usado

Critério: ordenar por nome de forma case-insensitive, normalizando ambas as strings para maiúsculas (toUpperCase) antes de comparar.
Pré-condições: Product.getName() deve ser não nulo (caso contrário, lançará NullPointerException).
Desempate e estabilidade: se dois nomes empatarem (ignora caixa), a ordenação da JDK (TimSort) é estável e preserva a ordem relativa original.
Efeitos: a ordenação modifica a lista in-place (efeito local e explícito).
Trade-offs e alternativas relevantes

Performance:
Complexidade da ordenação: O(n log n). Cada comparação de String custa O(k), onde k é o comprimento médio das strings.
Alocação: toUpperCase cria strings temporárias em cada comparação; para reduzir garbage, considere compareToIgnoreCase ou um Comparator pré-existente (String.CASE_INSENSITIVE_ORDER) com Comparator.comparing.
Internacionalização (i18n):
toUpperCase depende do Locale padrão e não trata acentuação/ordenação semântica (e.g., "ç", "á").
Para ordenação sensível a idioma (pt-BR, etc.), prefira java.text.Collator configurado com o Locale adequado.
Para apenas ignorar caixa com baixo custo, use String::compareToIgnoreCase ou String.CASE_INSENSITIVE_ORDER.
Imutabilidade e segurança:
list.sort(...) altera a lista fornecida. Se precisar de imutabilidade, crie uma cópia (new ArrayList<>(original)) e ordene a cópia.
Tratamento de null:
Se nomes puderem ser null, envolva o comparador com Comparator.nullsFirst/Last ou sanitize os dados antes.
Observação sobre valores monetários

O uso de double aqui é didático. Para dinheiro em produção, prefira BigDecimal e uma Currency/Locale apropriados.
*/
public class Main {


    public static void main(String[] args) {
        // Lista mutável; a chamada a sort abaixo modificará esta instância (efeito local e explícito).
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 900.00));
        list.add(new Product("Tablet", 900.00));

/*Versão verbosa com classe anônima (útil para tornar explícito o contrato do Comparator):

Comparator<Product> comparator = new Comparator<Product>() {
@Override
public int compare(Product p1, Product p2) {
// Normaliza para a mesma “caixa” antes de comparar => comparação case-insensitive.
// Risco: se getName() for null, lança NPE; para tolerar nulls, use Comparator.nullsFirst/Last.
return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
}
};*/

/*Mesma lógica em estilo funcional (lambda com bloco explícito):

Comparator<Product> comparator = (p1, p2) -> {
return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
};*/

/* Forma concisa (lambda “expression-bodied”):

Comparator<Product> comparator =
(p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
*/

// Expressão lambda diretamente no sort:
// - Implementa Comparator<Product> inline.
// - Ordena por nome ignorando caixa (case-insensitive) ao normalizar para maiúsculas antes de comparar.
// - Estável: se dois nomes empatarem ao ignorar caixa, a ordem relativa original é preservada.
// - Custo: O(n log n) no total; toUpperCase aloca strings temporárias (considere compareToIgnoreCase para evitar isso).
// - i18n: para acentuação/regras específicas de idioma, use Collator; para apenas ignorar caixa sem alocar novas strings,
// alternativas:
// a) (p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName())
// b) Comparator.comparing(Product::getName, String.CASE_INSENSITIVE_ORDER)
// - Atenção a nulls: este comparador assume nomes não nulos; se necessário, use:
// Comparator.comparing(Product::getName, String.CASE_INSENSITIVE_ORDER).thenComparing(Product::getPrice)
// …e envolva com Comparator.nullsLast/First conforme o caso.
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

// Saída: imprime a lista já ordenada. A operação acima alterou 'list' (efeito local controlado).
        for (Product product : list) {
            System.out.println(product);
        }
    }
}