package dataehora;

// Importa classes para manipulação de datas e horas modernas do Java
import java.time.Instant;         // Data/hora global (UTC)
import java.time.LocalDate;       // Data sem hora
import java.time.LocalDateTime;   // Data com hora (sem fuso)
import java.time.ZoneId;          // Representa um fuso horário
import java.time.format.DateTimeFormatter; // Formatação e parsing de datas

public class Exemplo3 {
    public static void main(String[] args) {

        // Faz parsing de datas em formato padrão ISO
        LocalDate d04 = LocalDate.parse("2022-07-20");                  // yyyy-MM-dd
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // yyyy-MM-ddTHH:mm:ss
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");            // UTC (padrão ISO)

        // Converte Instant para LocalDate/LocalDateTime em diferentes fusos
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());      // Data local no fuso do sistema
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));       // Data local no fuso de Portugal
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault()); // Data/hora local no fuso do sistema
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));  // Data/hora local no fuso de Portugal

        System.out.println("r1 = " + r1); // Exibe data local (fuso do sistema)
        System.out.println("r2 = " + r2); // Exibe data local (fuso Portugal)
        System.out.println("r3 = " + r3); // Exibe data/hora local (fuso do sistema)
        System.out.println("r4 = " + r4); // Exibe data/hora local (fuso Portugal)

        // Obtém partes específicas da data
        System.out.println("d04 dia = " + d04.getDayOfMonth());  // Dia do mês
        System.out.println("d04 mês = " + d04.getMonthValue());  // Mês (numérico)
        System.out.println("d04 ano = " + d04.getYear());        // Ano

        // Obtém partes específicas da hora
        System.out.println("d05 hora = " + d05.getHour());       // Hora
        System.out.println("d05 minutos = " + d05.getMinute());  // Minutos
    }
}