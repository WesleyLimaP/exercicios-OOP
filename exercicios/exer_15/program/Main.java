package exercicios.exer_15.program;

import exercicios.exer_15.model.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the file name");
        File file = new File(scanner.next());
        List<Product> productList = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();

            while (line != null){
                String [] lines = line.split(",");
                String name = lines[0];
                double price = Double.parseDouble(lines[1]);
                int quantity = Integer.parseInt(lines[2]);
                productList.add(new Product(name, price, quantity));
                line = br.readLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        File file2 = new File(file.getParent()+ "\\out");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file2 + "\\summary.csv"))) {
            for(Product product: productList){
                bw.write(product.getName() + "," + product.getTotal());
                bw.newLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


        for(Product product: productList){
            System.out.println(product.getName());
        }
    }
}
