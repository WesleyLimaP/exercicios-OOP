package exercicios.exer_16.model.entities;

import exercicios.exer_16.model.services.PaymentServices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private List<Instalments> instalmentsList = new ArrayList<>();
    private int contractNumber;
    private double totalContractValue;


    private LocalDate data;

    public Contract(int contractNumber, double totalContractValue, LocalDate data) {
        this.contractNumber = contractNumber;
        this.totalContractValue = totalContractValue;
        this.data = data;
    }



    public void add(Instalments instalment) {
        instalmentsList.add(instalment);
    }

    public void remove(Instalments instalment) {
        instalmentsList.remove(instalment);
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public double getTotalContractValue() {
        return totalContractValue;
    }

    public void setTotalContractValue(double totalContractValue) {
        this.totalContractValue = totalContractValue;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


    public List<Instalments> getInstalmentsList() {
        return instalmentsList;
    }
}
