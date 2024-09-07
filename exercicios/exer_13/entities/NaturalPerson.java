package exercicios.exer_13.entities;

public class NaturalPerson extends Person{
    private Double healthcareeExpenses;
    public NaturalPerson(String name, double annualIncome, double healthcareeExpenses) {
        super(name, annualIncome);
        this.healthcareeExpenses = healthcareeExpenses;
    }

    @Override
    public double tax() {
        double rebate = 0;
        if (healthcareeExpenses > 0){
            rebate = healthcareeExpenses/2;
        }
        if (getAnnualIncome() < 20000){
            return getAnnualIncome() * 0.15 - rebate;
        }
        else{
            return getAnnualIncome() * 0.25 - rebate;
        }
    }

    public Double getHealthcareeExpenses() {
        return healthcareeExpenses;
    }

    public void setHealthcareeExpenses(Double healthcareeExpenses) {
        this.healthcareeExpenses = healthcareeExpenses;
    }
}
