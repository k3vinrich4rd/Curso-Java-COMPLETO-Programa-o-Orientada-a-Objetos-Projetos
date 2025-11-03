import java.util.Scanner;


public class FuncoesJava {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int higer = max(a, b, c);

        showResult(higer);

    }

    private static void showResult(int higer) {
        System.out.println("Resultado: " + higer);
    }

    public static int max(int a, int b, int c) {

        int aux;

        if (a > b && a > c) {
            aux = a;
        } else if (b > c) {
            aux = b;
        } else {
            aux = c;
        }

        return aux;

    }
}
