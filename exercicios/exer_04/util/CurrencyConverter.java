package exercicios.exer_04.util;

public class CurrencyConverter {
    public static double IOF = 0.06;

    public static double amountToPay(double dollarPrice, double dollarsBought){
        double reais =  (dollarPrice * dollarsBought);
        return reais += reais* IOF;

    }
}
