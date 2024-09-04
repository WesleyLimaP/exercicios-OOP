package exercicios.exer_12.entities;

public class ImportedProduct extends Product {
    private Double customFee;
    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;

    }

    @Override
    public String priceTag(){
        return getName() + " " + "$" + totalPrice() + " ( custom fee $" + customFee + ")";
    }
    public double totalPrice(){
        return getPrice() + customFee;
    }
    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

    public ImportedProduct() {
    }
}
