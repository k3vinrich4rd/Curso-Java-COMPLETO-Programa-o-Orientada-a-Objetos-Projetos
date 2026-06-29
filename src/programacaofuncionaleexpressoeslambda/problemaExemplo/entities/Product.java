package programacaofuncionaleexpressoeslambda.problemaExemplo.entities;

public class Product {

    private String name;
    private Double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Outra forma de implementar o predicate (Method Reference)
    public static boolean staticProductPredicate(Product product) {
        return product.getPrice() >= 100.00;
    }

    //Outra forma de implementar o predicate (Method Reference)
    public boolean nonstaticProductPredicate() {
        return this.price >= 100.00;
    }

    //Método statico que faz o mesmo papel do consumer
    public static void staticPriceUpdate(Product product) {
        product.setPrice(product.getPrice() + product.getPrice() * 0.1);
    }

    //Método não statico que faz o mesmo papel do consumer
    public void nonstaticPriceUpdate() {
        price += price * 0.1;
    }

    //Método toString para exibir os nomes dos produtos em maiúsculo
    //Faz o mesmo papel do function sem necessidade de criar uma classe que implementa a interface Function
    //exemplo de metodo statico que faz o mesmo papel do function
    public static String staticUpperCaseName(Product product) {
         return product.getName().toUpperCase();
    }

    //exemplo de metodo não statico que faz o mesmo papel do function
    public String nonstaticUpperCaseName() {
        return name.toUpperCase();
    }

    @Override
    public String toString() {
        return String.format("%s,%.2f", name, price);
    }
}
