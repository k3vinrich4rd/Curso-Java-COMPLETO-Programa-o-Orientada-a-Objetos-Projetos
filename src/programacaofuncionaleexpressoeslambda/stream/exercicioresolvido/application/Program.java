package programacaofuncionaleexpressoeslambda.stream.exercicioresolvido.application;

// BufferedReader:
// usado para ler arquivo texto de forma eficiente, linha por linha.
import java.io.BufferedReader;

// FileReader:
// usado para abrir e ler caracteres de um arquivo.
import java.io.FileReader;

// IOException:
// exceção usada para tratar erros de entrada e saída,
// como arquivo não encontrado ou erro na leitura.
import java.io.IOException;

// ArrayList:
// implementação de lista redimensionável.
import java.util.ArrayList;

// Comparator:
// usado para definir regras de comparação e ordenação.
import java.util.Comparator;

// List:
// interface que representa uma coleção ordenada de elementos.
import java.util.List;

// Locale:
// define configurações regionais, como formato de número.
import java.util.Locale;

// Scanner:
// usado para ler dados digitados pelo usuário.
import java.util.Scanner;

// Collectors:
// utilitário usado para coletar resultados de uma Stream.
import java.util.stream.Collectors;

// Classe Product:
// representa o produto lido do arquivo.
// Cada produto possui nome e preço.
import entities.Product;

public class Program {

	public static void main(String[] args) {

		// Define o padrão regional como US.
		// Isso ajuda a trabalhar com números decimais usando ponto.
		// Exemplo: 10.50
		Locale.setDefault(Locale.US);

		// Cria o Scanner para ler dados digitados no teclado.
		Scanner sc = new Scanner(System.in);

		// Solicita ao usuário o caminho completo do arquivo.
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		/*
		 * try-with-resources:
		 * abre o BufferedReader e garante que ele será fechado automaticamente
		 * ao terminar o bloco try.
		 *
		 * new FileReader(path):
		 * abre o arquivo no caminho informado.
		 *
		 * new BufferedReader(...):
		 * melhora a leitura do arquivo, permitindo ler linha por linha.
		 */
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			// Lista que irá armazenar todos os produtos lidos do arquivo.
			List<Product> list = new ArrayList<>();

			/*
			 * Lê a primeira linha do arquivo.
			 *
			 * readLine():
			 * retorna uma linha do arquivo como String.
			 * Quando chega ao final do arquivo, retorna null.
			 */
			String line = br.readLine();

			/*
			 * Enquanto a linha não for null,
			 * significa que ainda existem linhas para processar.
			 */
			while (line != null) {

				/*
				 * split(","):
				 * divide a linha em partes usando a vírgula como separador.
				 *
				 * Exemplo:
				 * "TV,900.00"
				 * vira:
				 * fields[0] = "TV"
				 * fields[1] = "900.00"
				 */
				String[] fields = line.split(",");

				/*
				 * Cria um objeto Product com os dados da linha.
				 *
				 * fields[0] -> nome
				 * Double.parseDouble(fields[1]) -> preço convertido para double
				 */
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));

				// Lê a próxima linha do arquivo para continuar o laço.
				line = br.readLine();
			}

			/*
			 * CÁLCULO DA MÉDIA DOS PREÇOS
			 * ---------------------------------------------------
			 * list.programacaofuncionaleexpressoeslambda.stream():
			 * transforma a lista em uma Stream<Product>.
			 *
			 * map(p -> p.getPrice()):
			 * transforma cada produto em seu preço.
			 * Depois do map, a programacaofuncionaleexpressoeslambda.stream passa a ser Stream<Double>.
			 *
			 * reduce(0.0, (x, y) -> x + y):
			 * soma todos os preços da programacaofuncionaleexpressoeslambda.stream.
			 *
			 * 0.0 = valor inicial da soma
			 * x = valor acumulado
			 * y = elemento atual
			 *
			 * Depois disso, dividimos pelo tamanho da lista
			 * para obter a média.
			 */
			double avg = list.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x,y) -> x + y) / list.size();

			// Exibe a média formatada com duas casas decimais.
			System.out.println("Average price: " + String.format("%.2f", avg));

			/*
			 * COMPARATOR PARA ORDENAR STRINGS
			 * ---------------------------------------------------
			 * Comparator<String> comp:
			 * define uma regra de comparação entre nomes.
			 *
			 * s1.toUpperCase().compareTo(s2.toUpperCase()):
			 * converte as duas strings para maiúsculo antes de comparar.
			 * Isso evita diferença entre letras maiúsculas e minúsculas.
			 *
			 * Exemplo:
			 * "tv" e "TV" serão comparados como se fossem iguais em capitalização.
			 */
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

			/*
			 * PIPELINE DE STREAM
			 * ---------------------------------------------------
			 * Objetivo:
			 * gerar uma lista com os nomes dos produtos
			 * cujo preço é menor que a média.
			 *
			 * Etapas:
			 * 1) filter(...)  -> mantém apenas os produtos abaixo da média
			 * 2) map(...)     -> transforma produto em nome
			 * 3) sorted(...)  -> ordena os nomes
			 * 4) collect(...) -> converte o resultado em List<String>
			 */
			List<String> names = list.stream()

					/*
					 * filter(p -> p.getPrice() < avg):
					 * mantém apenas os produtos cujo preço é menor que a média.
					 */
					.filter(p -> p.getPrice() < avg)

					/*
					 * map(p -> p.getName()):
					 * transforma cada produto restante em seu nome.
					 */
					.map(p -> p.getName())

					/*
					 * sorted(comp.reversed()):
					 * ordena os nomes em ordem decrescente,
					 * usando o comparador definido anteriormente.
					 *
					 * reversed():
					 * inverte a ordem do comparador.
					 */
					.sorted(comp.reversed())

					/*
					 * collect(Collectors.toList()):
					 * coleta o resultado da programacaofuncionaleexpressoeslambda.stream
					 * e transforma em uma nova lista.
					 */
					.collect(Collectors.toList());

			/*
			 * forEach(System.out::println):
			 * percorre a lista de nomes e imprime cada nome em uma linha.
			 *
			 * System.out::println é uma method reference,
			 * uma forma resumida de escrever uma lambda.
			 */
			names.forEach(System.out::println);

		} catch (IOException e) {

			// Caso ocorra erro na leitura do arquivo,
			// exibe a mensagem do erro.
			System.out.println("Error: " + e.getMessage());
		}

		// Fecha o Scanner.
		sc.close();
	}
}