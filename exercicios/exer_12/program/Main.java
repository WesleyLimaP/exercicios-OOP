package exercicios.exer_12.program;

import exercicios.exer_12.entities.ImportedProduct;
import exercicios.exer_12.entities.Product;
import exercicios.exer_12.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();

        System.out.println("enter the number of products");
        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < n; i ++){
            System.out.println("commom, used or imported ? (c/u/i)");
            char type = scanner.next().charAt(0);
            scanner.nextLine();

            if (type == 'c'){
                System.out.println("product name");
                String productName = scanner.nextLine();

                System.out.println("price");
                double price = scanner.nextDouble();

                productList.add(new Product(productName, price));

            } else if (type == 'u') {
                System.out.println("product name");
                String productName = scanner.nextLine();

                System.out.println("price");
                double price = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("manufate date (dd/mm/yyyy)");
                String dateString = scanner.nextLine();
                DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate date = LocalDate.parse(dateString, formatterDate);
                productList.add(new UsedProduct(productName, price, date));

            } else if (type == 'i') {
                System.out.println("product name");
                String productName = scanner.nextLine();

                System.out.println("price");
                double price = scanner.nextDouble();

                System.out.println("custom fee");
                double customFee = scanner.nextDouble();

                productList.add(new ImportedProduct(productName, price, customFee));
            }

        }
        for(Product product: productList){
            System.out.println(product.priceTag());
        }



    }
}
