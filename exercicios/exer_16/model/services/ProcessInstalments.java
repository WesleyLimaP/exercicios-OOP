package exercicios.exer_16.model.services;

import exercicios.exer_16.model.entities.Contract;
import exercicios.exer_16.model.entities.Instalments;

import java.time.LocalDate;

public class ProcessInstalments {
    private PaymentServices paymentServices;

    public ProcessInstalments(PaymentServices paymentServices) {
        this.paymentServices = paymentServices;
    }

    public void setInstalments(Contract contract, int instalments){
        for (int i = 0; i < instalments; i ++){
            LocalDate instalemtDate = contract.getData().plusMonths((i+1));
            double instalmentValue = contract.getTotalContractValue()/instalments ;
            instalmentValue += (instalmentValue * paymentServices.monthlyInterest()* (i +1));
            instalmentValue += instalmentValue * paymentServices.paymentTax();

            Instalments instalment = new Instalments(instalemtDate, instalmentValue );
            contract.getInstalmentsList().add(instalment);
        }
    }

    public PaymentServices getPaymentServices() {
        return paymentServices;
    }

    public void setPaymentServices(PaymentServices paymentServices) {
        this.paymentServices = paymentServices;
    }
}
