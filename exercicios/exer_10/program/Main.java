package exercicios.exer_10.program;

import exercicios.exer_10.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employeesList = new ArrayList<>();
        Employee employee;

        System.out.println("how many employees will be registered?");
        int registers = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < registers; i ++){
            System.out.println("enter a name");
            String name = scanner.nextLine();
            System.out.println("enter a salary");
            double salary = scanner.nextDouble();
            System.out.println("enter a id");
            int id = scanner.nextInt();


            Employee idExist = employeesList.stream().filter(x -> x.getID() == id).findFirst().orElse(null);

            while (idExist != null) {
                System.out.println("the id already exists ");
                System.out.println("enter a id");
                int id1 = scanner.nextInt();
                idExist = employeesList.stream().filter(x -> x.getID() == id1).findFirst().orElse(null);
            }
            employeesList.add(new Employee(name, salary, id));
            scanner.nextLine();
        }
        System.out.println("list of employees");
        for(Employee emp: employeesList){
            System.out.println(emp);
        }

        System.out.println("enter an id to increase the salary");
        employee = employeesList.stream().filter(x -> x.getID() == scanner.nextInt()).findFirst().orElse(null);
        if (employee != null){
            System.out.println("enter the increase value");
            employee.increase(scanner.nextInt());
        }else{
            System.out.println("id not exist");
        }
        System.out.println("list of employees");
        for(Employee emp: employeesList){
            System.out.println(emp);
        }

    }
}
