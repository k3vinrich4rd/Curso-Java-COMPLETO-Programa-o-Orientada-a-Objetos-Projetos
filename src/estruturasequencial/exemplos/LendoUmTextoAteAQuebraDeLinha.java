package estruturasequencial.exemplos;

import java.util.Scanner;

public class LendoUmTextoAteAQuebraDeLinha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        String s1, s2, s3;

        x = input.nextInt();
        input.nextLine();
        s1 = input.nextLine();
        s2 = input.nextLine();
        s3 = input.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        input.close();
    }
}
