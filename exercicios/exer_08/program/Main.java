package exercicios.exer_08.program;
import exercicios.exer_08.entities.Person;
import exercicios.exer_08.util.PersonUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many people will you insert?");
        Person [] people = new Person[scanner.nextInt()];

        for (int i = 0; i < people.length; i ++){
            System.out.println("person " + (i+1));
            scanner.nextLine();
            System.out.println("enter a name");
            String name = scanner.nextLine();
            System.out.println("enter a age");
            int age = scanner.nextInt();
            System.out.println("enter a width");
            double width = scanner.nextDouble();
            Person person = new Person(width, name, age);
            people[i] = person;
        }
        System.out.println("media width " + String.format("%.2f", PersonUtils.mediaWidth(people)));
        System.out.println("16 years under perceptual %" + String.format("%.1f", PersonUtils._16yersUndersPercentual(people)));

        for (int i = 0; i < people.length; i ++){
            if(people[i].getAge() < 16 ){
                System.out.println(people[i].getName());
            }
        }

    }
}
