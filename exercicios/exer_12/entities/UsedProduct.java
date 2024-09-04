package exercicios.exer_12.entities;

import java.time.LocalDate;

public class UsedProduct extends Product {
    private LocalDate date;
    public UsedProduct(String name, Double price, LocalDate date) {
        super(name, price);
        this.date = date;
    }

    public UsedProduct() {
    }

    @Override
    public String priceTag(){
        return getName() + "(used) $" + getPrice() + " ( remanufatere date " + date + ")";
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
