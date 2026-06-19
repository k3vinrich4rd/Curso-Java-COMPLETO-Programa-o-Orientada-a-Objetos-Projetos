package map.exerciciodefixacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemDeVotos {
    public static void main(String[] args) {
        Map<String, Integer> nameAndQuantityVoteForCandidate = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String path = input.nextLine();

        try (input; BufferedReader br = new BufferedReader(new FileReader(path))) {
            System.out.print("Enter file full path: ");


            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");

                // trim() remove espaços em branco no começo e no fim da String.
                // Isso evita problemas se no arquivo tiver algo como "Alex " ou " 15"
                // em vez de "Alex" e "15".
                String name = fields[0].trim();
                int quantityVotes = Integer.parseInt(fields[1].trim());

                // getOrDefault(name, 0):
                // - Se o candidato 'name' já estiver no mapa, retorna o total atual de votos.
                // - Se ainda NÃO estiver no mapa, retorna 0 (valor padrão).
                // Assim evitamos NullPointerException e não precisamos fazer if (containsKey...).
                int currentVotes = nameAndQuantityVoteForCandidate.getOrDefault(name, 0);

                // Soma os votos já existentes com os novos votos lidos da linha
                nameAndQuantityVoteForCandidate.put(name, currentVotes + quantityVotes);

                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        for (Map.Entry<String, Integer> entry : nameAndQuantityVoteForCandidate.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
