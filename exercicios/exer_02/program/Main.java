package exercicios.exer_02.program;

import exercicios.exer_02.entities.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("enter wich the employeer name ");
        employee.name = scan.nextLine();

        System.out.println("enter wich the tax");
        employee.tax = scan.nextDouble();

        System.out.println("enter wich the gross salary ");
        employee.grossSalary = scan.nextDouble();
        System.out.println(employee);

        System.out.println(("enter wich increase value"));
        employee.increaseSalary(scan.nextDouble());

        System.out.println(employee);
    }
}
