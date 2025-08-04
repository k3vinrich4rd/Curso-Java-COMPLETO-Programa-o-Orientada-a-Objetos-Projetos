package estruturasequencial.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class LendoVariosCaracteresNaMesmaLinha {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        String x;
        int y;
        double z;

        x = input.next();
        y = input.nextInt();
        z = input.nextDouble();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        input.close();
    }
}
