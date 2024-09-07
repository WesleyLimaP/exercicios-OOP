package exercicios.exer_13.program;

import exercicios.exer_13.entities.LegalEntity;
import exercicios.exer_13.entities.NaturalPerson;
import exercicios.exer_13.entities.Person;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NaturalPerson naturalPerson = new NaturalPerson("wesley", 19000, 1000);
        List<Person>personList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number of tax payers");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i ++){
            System.out.println("tax payer #" +(i+1) + " data");
            System.out.println("individual or company?(i/c)");
            scanner.nextLine();
            char answer = scanner.next().charAt(0);
            scanner.nextLine();

            if (answer == 'i'){
                System.out.println("name");
                String name = scanner.nextLine();
                System.out.println("annual income");
                double annualIncome = scanner.nextDouble();
                System.out.println("health expanditurres");
                double healthExpanditures = scanner.nextDouble();
                personList.add(new NaturalPerson(name, annualIncome, healthExpanditures));
            }
            else if (answer ==  'c'){
                System.out.println("name");
                String name = scanner.nextLine();
                System.out.println("annual income");
                double annualIncome = scanner.nextDouble();
                System.out.println("employees");
                int employees  = scanner.nextInt();
                personList.add(new LegalEntity(name, annualIncome, employees));
        }

        }
        for(Person person: personList){
            System.out.println(person);
        }
        System.out.println("total tax: " + totalTax(personList));
    }
    public static double totalTax(List<Person> personList){
        double total =0;
        for(Person person: personList){
            total+= person.tax();
        }
        return total;
    }
}
