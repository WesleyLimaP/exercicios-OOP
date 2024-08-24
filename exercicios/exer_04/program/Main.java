package exercicios.exer_04.program;

import exercicios.exer_04.util.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("wath is the dollar price ?");
        double dollarPrice = scan.nextDouble();

        System.out.println("how many dollars will be bought?");
        double dollarsBought = scan.nextDouble();

        System.out.println("ammount to paid in reais: " + CurrencyConverter.amountToPay(dollarPrice, dollarsBought));

    }
}
