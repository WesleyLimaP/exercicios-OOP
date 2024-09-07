package exercicios.exer_13.entities;

public abstract class Person {
    private String name;
    private double annualIncome;

    public Person(String name, double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public abstract double tax();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double rendaAnual) {
        this.annualIncome = rendaAnual;
    }

    @Override
    public String toString() {
        return name + " $" + String.format("%.2f", tax());
    }
}
