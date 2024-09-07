package exercicios.exer_15.model.entities;

public class Product {
    private String name;
    private Double price;
    private int quantitty;

    public Product(String name, Double price, int quantitty) {
        this.name = name;
        this.price = price;
        this.quantitty = quantitty;
    }

    public double getTotal(){
        return quantitty * price;
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

    public int getQuantitty() {
        return quantitty;
    }

    public void setQuantitty(int quantitty) {
        this.quantitty = quantitty;
    }
}
