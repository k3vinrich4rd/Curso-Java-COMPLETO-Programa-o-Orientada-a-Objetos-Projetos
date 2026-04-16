package herancaepolimorfismo.entities.exercicios.exercicio2;

public class ImportedProduct extends Product {
    private double customFee;

    public ImportedProduct(String name, double price, double customFee) {
        super(name, price);
        this.customFee = customFee;
    }


    public double totalPrice() {
        return this.getPrice() + customFee;
    }


    @Override
    public String priceTag() {
        return getName() + " $ " + String.format("%.2f", totalPrice())
                + " (Customs fee: $ " + String.format("%.2f", customFee);
    }

    public double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(double customFee) {
        this.customFee = customFee;
    }
}
