package exercicios.exer_11.entities;

import exercicios.exer_11.enums.OrderStatus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Order {
    private Client client;
    private OrderStatus orderStatus;
    private List<OrderItem> orderItemList = new ArrayList<>();
    private LocalDate momment;



    public Order(Client client, OrderStatus orderStatus, List<OrderItem> orderItemList) {
        this.client = client;
        this.orderStatus = orderStatus;
        this.orderItemList = orderItemList;
        this.momment = LocalDate.now();
    }

    public double total(){
        double tot = 0;
        for(OrderItem orderItem: orderItemList){
           tot += orderItem.subTotal();
        }
        return tot;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void addOrderItemList(OrderItem orderItem) {
        orderItemList.add(orderItem);
    } public void removeOrderItemList(OrderItem orderItem) {
        orderItemList.remove(orderItem);
    }
    public LocalDate getMomment() {
        return momment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY");
        sb.append("\n");
        sb.append("ORDER MOMENT:").append(momment.toString());
        sb.append("\n");
        sb.append("ORDER STATUS: ").append(orderStatus);
        sb.append("\n");
        sb.append("CLIENT: ").append(client.getName()).append(" - ").append(client.getBirthDate().toString()).append(" - ").append(client.getEmail());
        sb.append("\n");
        sb.append("ITEMS");
        sb.append("\n");
        for(OrderItem orderItem: orderItemList){
            sb.append(orderItem.getProducts().getName()).append(" ").append(orderItem.getProducts().getPrice()).append(" quantity: ").append(orderItem.getQuantity()).append(" subtotal: ").append(orderItem.subTotal());
            sb.append("\n");

        }
        sb.append("total").append(" ").append(total());
        return sb.toString();

    }
}
