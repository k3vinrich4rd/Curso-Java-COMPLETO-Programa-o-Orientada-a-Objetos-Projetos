package entities;

public class Product {

    // Entidade simples usada para representar um produto.
    private String name;
    private Double price;

    public Product(String name, Double price) {
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

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        // Representação textual útil para impressão e testes rápidos.
        return name + ", " + String.format("%.2f", price);
    }
}