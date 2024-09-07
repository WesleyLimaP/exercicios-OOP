package exercicios.exer_13.entities;

public class LegalEntity extends Person{
    private int numberOfEmployees;

    public LegalEntity(String name, double annualIncome, int numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if (numberOfEmployees > 10){
            return getAnnualIncome() * 0.14;
        }
        else{
            return getAnnualIncome() * 0.16;
        }
    }


}
