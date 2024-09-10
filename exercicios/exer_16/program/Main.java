package exercicios.exer_16.program;

import exercicios.exer_16.model.entities.Contract;
import exercicios.exer_16.model.entities.Instalments;
import exercicios.exer_16.model.services.PaypalServices;
import exercicios.exer_16.model.services.ProcessInstalments;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("enter the contract value");
        double value = scanner.nextDouble();
        System.out.println("enter the contract data");
        scanner.nextLine();
        String dateStr = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateStr, df);
        System.out.println("enter the contract number");
        int n = scanner.nextInt();
        Contract contract = new Contract(n, value, date);

        System.out.println("enter the numbers of instalments");
        int instalments = scanner.nextInt();

        ProcessInstalments processInstalments = new ProcessInstalments( new PaypalServices());
        processInstalments.setInstalments(contract, instalments);

        int cont = 0;
        for (Instalments instalments1: contract.getInstalmentsList()){
            System.out.println("INSTALMENT #" + (cont+= 1) + " " + instalments1);
        }

    }
}
