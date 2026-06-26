package programacaofuncionaleexpressoeslambda.demo1.entities;

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

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


}
