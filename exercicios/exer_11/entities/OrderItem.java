package exercicios.exer_11.entities;

public class OrderItem {
    private Double price;
    private Integer quantity;
    private Product products;


    public OrderItem(Integer quantity, Product products) {
        this.price = products.getPrice();
        this.quantity = quantity;
        this.products = products;
    }

    public double subTotal(){
        return price * quantity;
    }
    public Double getPrice() {
        return price;
    }
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }
}
