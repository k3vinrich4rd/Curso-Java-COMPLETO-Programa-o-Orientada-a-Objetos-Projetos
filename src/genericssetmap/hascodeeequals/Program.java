package genericssetmap.hascodeeequals;

import genericssetmap.hascodeeequals.hascodeeequalspersonalizados.entities.Client;

public class Program {
    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        //Para esse cenário é true, pois a expressão literal é tratada de uma forma especial
        String s1 = "Test";
        String s2 = "Test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2)); //Compara os conteúdo - console = true
        System.out.println(c1 == c2);  //Compara a referência de memória não o conteúdo - console = false
        System.out.println(s1 == s2);  //Compara a referência de memória não o conteúdo - console = false

    }
}
