package dataehora;

// Importa classes para manipulação de datas e horas modernas do Java
import java.time.Instant; // Data/hora global (UTC)
import java.time.LocalDate; // Data sem hora
import java.time.LocalDateTime; // Data com hora (sem fuso)
import java.time.format.DateTimeFormatter; // Formatação e parsing de datas

public class Exemplo1 {
    public static void main(String[] args) {

        // Cria formatadores para datas em formato customizado
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Obtém a data atual (sem hora)
        LocalDate d01 = LocalDate.now();
        // Obtém a data e hora atual (sem fuso)
        LocalDateTime d02 = LocalDateTime.now();
        // Obtém o instante atual em UTC
        Instant d03 = Instant.now();

        // Faz parsing de datas em formato padrão ISO
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // UTC
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); // Com offset

        // Faz parsing de datas em formato customizado usando formatador
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        // Cria datas/hora manualmente informando ano, mês, dia, etc.
        LocalDate d10 = LocalDate.of(2026, 2, 18);
        LocalDateTime d11 = LocalDateTime.of(2026, 2, 18, 1, 30);

        // Todos os tipos possuem toString() que retorna a data/hora em formato padrão
        System.out.println("d01: " + d01); // Data atual
        System.out.println("d02: " + d02); // Data/hora atual
        System.out.println("d03: " + d03); // Instante atual UTC
        System.out.println("d04: " + d04); // Parsing ISO
        System.out.println("d05: " + d05); // Parsing ISO com hora
        System.out.println("d06: " + d06); // Parsing ISO UTC
        System.out.println("d07: " + d07); // Parsing ISO com offset
        System.out.println("d08:  " + d08); // Parsing customizado
        System.out.println("d09:  " + d09); // Parsing customizado com hora
        System.out.println("d10:  " + d10); // Data criada manualmente
        System.out.println("d11:  " + d11); // Data/hora criada manualmente
    }
}