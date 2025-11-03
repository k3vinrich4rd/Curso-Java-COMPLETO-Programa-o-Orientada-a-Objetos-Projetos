package funcoesstring;

public class StringSplit {
    public static void main(String[] args) {

        String s = "potato lemon apple orange";

        String[] vect = s.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);


    }
}
