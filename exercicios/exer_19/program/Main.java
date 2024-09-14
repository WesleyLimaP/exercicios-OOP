package exercicios.exer_19.program;

import exercicios.exer_19.entities.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employeesList = new ArrayList<>();

        String path = "C:\\temp\\funcionrios.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path)) ){
            String line = br.readLine();
            while (line != null){
                String [] employeesArray = new String[3];
                employeesArray = line.split(", ");
                employeesList.add(new Employee(employeesArray[0], employeesArray[1], Double.parseDouble(employeesArray[2])));
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("enter a salary");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        List<String> bigSalarys = employeesList.stream()
                .filter(x -> x.getSalary() > salary).map(Employee::getEmail)
                .sorted((x, y) -> x.toUpperCase().compareTo(y)).toList();

        bigSalarys.forEach(System.out::println);

        double sum = employeesList.stream().filter(x -> x.getName().charAt(0) == 'M')
                .map(Employee:: getSalary)
                .reduce(0.0,(x, y) -> x + y);

        System.out.println("sum of salary's of peoples who's name start with 'M': " + sum);
    }
}
