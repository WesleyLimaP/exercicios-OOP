package exercicios.exer_21.program;

import exercicios.exer_20.entities.Sale;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> saleMap = new LinkedHashMap<>();
        List<Sale> saleList = new ArrayList<>();
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
        for(Sale sale: saleList){
            saleMap.put(sale.getSeller(), saleList.stream().filter(x -> x.getSeller().equals(sale.getSeller())).map(Sale::getTotal).reduce(0.0, Double::sum));
        }
        for(String key: saleMap.keySet()){
            System.out.println(key + " " + String.format("%.2f", saleMap.get(key) ));
        }
    }
}
