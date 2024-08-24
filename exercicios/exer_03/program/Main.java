package exercicios.exer_03.program;

import exercicios.exer_03.entities.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student student = new Student();

        student.name = scan.nextLine();
        student.note1 = scan.nextDouble();
        student.note2 = scan.nextDouble();
        student.note3 = scan.nextDouble();

        scan.nextLine();

        scan.close();
        System.out.println(student);
    }
}
