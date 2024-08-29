package exercicios.exer_10.entities;

import java.util.List;

public class Employee {
    private String name;
    private Double salary;
    private final Integer ID;

    public Employee(String name, Double salary, Integer ID) {
        this.name = name;
        this.salary = salary;
        this.ID = ID;
    }

    public void increase(int increase){
        salary += salary * ((double) increase / 100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public Integer getID() {
        return ID;
    }

    @Override
    public String toString() {
        return name + " " + salary + " " +  "id " + ID + "\n";
    }
}
