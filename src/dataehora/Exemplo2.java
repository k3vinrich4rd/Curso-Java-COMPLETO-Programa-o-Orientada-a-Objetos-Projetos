package dataehora;

// Importa classes para manipulação de datas e horas modernas do Java
import java.time.Instant;                // Data/hora global (UTC)
import java.time.LocalDate;              // Data sem hora
import java.time.LocalDateTime;          // Data com hora (sem fuso)
import java.time.ZoneId;                 // Representa um fuso horário
import java.time.format.DateTimeFormatter; // Formatação e parsing de datas

public class Exemplo2 {
    public static void main(String[] args) {

        // Faz parsing de datas em formato padrão ISO
        LocalDate d04 = LocalDate.parse("2022-07-20");                  // yyyy-MM-dd
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // yyyy-MM-ddTHH:mm:ss
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");            // UTC (padrão ISO)

        // Cria formatadores para diferentes padrões de data/hora
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");           // Apenas data
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");     // Data e hora
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
                .withZone(ZoneId.systemDefault());                                   // Data/hora com fuso do sistema
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;                    // Padrão ISO para data/hora local
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;                      // Padrão ISO para instantes (UTC)

        // Formas diferentes de formatar datas (equivalentes)
        System.out.println("d04 = " + d04.format(fmt1));                             // Usando método da data
        System.out.println("d04 = " + fmt1.format(d04));                             // Usando método do formatador
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // Criando formatador na hora

        // Formatando LocalDateTime com diferentes padrões
        System.out.println("d05 = " + d05.format(fmt1));                             // Só data
        System.out.println("d05 = " + d05.format(fmt2));                             // Data e hora

        // Formatando Instant (precisa de fuso)
        System.out.println("d06 = " + fmt3.format(d06));                             // Data/hora local do sistema
        System.out.println("d06 = " + fmt5.format(d06));                             // Padrão ISO UTC
        System.out.println("d06 = " + fmt3.format(d06));                             // Repetido para reforçar

    }
}