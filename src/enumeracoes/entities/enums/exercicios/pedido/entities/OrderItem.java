package enumeracoes.entities.enums.exercicios.pedido.entities;

public class OrderItem {

    private Integer quantity;
    private double price;
    private Product product;

    public OrderItem() {

    }

    public OrderItem(Product product, double price, Integer quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public double subTotal() {
        return this.quantity * this.price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
