package exerciciosdelogica;

/*
2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias.
 */
public class mediaAritmetica {
    public static void main(String[] args) {

        int valor1 = 8;
        int valor2 = 9;
        int valor3 = 7;

        int valor4 = 4;
        int valor5 = 5;
        int valor6 = 6;

        int media1 = calculaMediaAritmetica(valor1, valor2, valor3);
        int media2 = calculaMediaAritmetica(valor4, valor5, valor6);

        int somaDasMedias = calculaMediaDasMedias(media1, media2);

        System.out.println("Primeira média: " + media1);
        System.out.println("Segunda média: " + media2);

        System.out.println("Média das médias: " + somaDasMedias);
    }

    public static int calculaMediaAritmetica(int valor1, int valor2, int valor3) {
        return (valor1 + valor2 + valor3) / 3;
    }

    public static int calculaMediaDasMedias(int media1, int media2) {
        return (media1 + media2) / 2;
    }
}
