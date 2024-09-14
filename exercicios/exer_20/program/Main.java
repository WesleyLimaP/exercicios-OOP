package exercicios.exer_20.program;

import exercicios.exer_20.entities.Sale;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Sale> saleList = new ArrayList<>();
        Locale.setDefault(Locale.US);

        String path = "C:\\temp\\seler.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                String [] salesVect = new String[5];
                salesVect = line.split(",");
                int month = Integer.parseInt(salesVect[0]);
                int year = Integer.parseInt(salesVect[1]);
                String name = salesVect[2];
                int items = Integer.parseInt(salesVect[3]);
                double total = Double.parseDouble(salesVect[4]);
                saleList.add(new Sale(name, items, month, year, total));
                line = br.readLine();

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        List<Sale> sales = saleList.stream()
                .filter(x -> x.getYear() == 2016)
                .sorted(Comparator.comparing(Sale::avaragePrice).reversed())
                .limit(5)
                .toList();
        sales.forEach(System.out:: println);

        double totLoganSales = saleList.stream()
                .filter(x -> x.getSeller().equals("Logan"))
                .filter(x -> x.getMonth() == 1 || x.getMonth() == 7)
                .map(Sale::getTotal)
                .reduce(0.0, Double::sum);

        System.out.println(totLoganSales);
    }
}
