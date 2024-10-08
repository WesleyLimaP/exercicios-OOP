package exercicios.exer_15.model.entities;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
