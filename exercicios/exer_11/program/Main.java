package exercicios.exer_11.program;

import exercicios.exer_11.entities.Client;
import exercicios.exer_11.entities.Order;
import exercicios.exer_11.entities.OrderItem;
import exercicios.exer_11.entities.Product;
import exercicios.exer_11.enums.OrderStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<OrderItem> orderItemList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER CLIENT DATA");
        System.out.println("name:");
        String name = scanner.nextLine();
        System.out.println("email:");
        String email = scanner.nextLine();
        System.out.println("birth date:(dd/mm/yyyy");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = scanner.nextLine();
        LocalDate localDate = LocalDate.parse(date, formatter);
        Client client = new Client(name, email, localDate);


        System.out.println("ENTER ORDER DATA");
        System.out.println("status");
        OrderStatus orderStatus = OrderStatus.PROCESSING;

        System.out.println("how many items to this order?");
        int orders = scanner.nextInt();
        scanner.nextLine();

        for(int i =1; i <= orders; i ++){
            System.out.println("enter #" + i + " data");
            System.out.println("product name");
            String productName = scanner.nextLine();
            System.out.println("product price");
            double price = scanner.nextDouble();
            System.out.println("product quantity");
            int quantity = scanner.nextInt();
            Product product = new Product(productName, price);
            orderItemList.add(new OrderItem(quantity, product));
            scanner.nextLine();
        }
        Order order = new Order(client, orderStatus, orderItemList);
        System.out.println(order);

    }
}
