package exercicios.exer_14.model.entities;

import exercicios.exer_14.model.exceptions.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double whithdrawLimit;
    private Double balance;

    public Account(Integer number, String holder, Double whithdrawLimit, Double balance) {
        this.number = number;
        this.holder = holder;
        this.whithdrawLimit = whithdrawLimit;
        this.balance = balance;
    }

    public void deposit(double ammout){
        balance += ammout;
    }
    public void Whithdraw(double ammount) throws DomainException {
        if(balance == 0){
            throw new DomainException("withdraw error: you don't have enough balance to make the withdrawal");
        }
        if (balance < ammount || ammount > whithdrawLimit){
            throw new DomainException("withdraw error: the amount infringes the withdraw limit");
        }
    }
    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getWhithdrawLimit() {
        return whithdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

}
