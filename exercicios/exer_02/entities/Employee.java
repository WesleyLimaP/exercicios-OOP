package exercicios.exer_02.entities;

public class Employee {
    public double tax;
    public double grossSalary;
    public String name;

    public void increaseSalary(double incriease){
        double porcentagem = incriease/100;
        grossSalary += porcentagem * grossSalary;
    }

    public double netSalary(){
        return grossSalary - tax;
    }

    @Override
    public String toString() {
        return "name: " + name + "; " + "salary: " + netSalary();
    }
}
