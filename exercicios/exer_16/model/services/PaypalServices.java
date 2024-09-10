package exercicios.exer_16.model.services;

public class PaypalServices implements PaymentServices {
    @Override
    public double monthlyInterest() {
        return 0.01;
    }

    @Override
    public double paymentTax() {
        return 0.02;
    }
}
