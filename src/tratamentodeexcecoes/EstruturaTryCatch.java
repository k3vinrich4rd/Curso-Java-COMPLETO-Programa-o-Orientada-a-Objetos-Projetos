package tratamentodeexcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EstruturaTryCatch {
    public static void main(String[] args) {

        method1();
        System.out.println("End of program");

    }

    public static void method1() {
        System.out.println("*** METHOD1 START ***");
        method2();
        System.out.println("*** METHOD1 END ***");

    }

    public static void method2() {
        System.out.println("*** METHOD2 START ***");
        Scanner input = new Scanner(System.in);

        try {
            String[] vect = input.nextLine().split(" ");
            int position = input.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Invalid position!");
            arrayIndexOutOfBoundsException.printStackTrace();
            input.next();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Input error");
        }

        input.close();
        System.out.println("*** METHOD2 END ***");
    }

}
