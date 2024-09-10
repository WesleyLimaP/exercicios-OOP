package exercicios.exer_17.program;

import exercicios.exer_17.model.Courses;
import exercicios.exer_17.model.Instructor;
import exercicios.exer_17.model.Studants;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Courses couseA = new Courses("couse A");
        Courses couseB = new Courses("couse B");
        Courses couseC = new Courses("couse C");

        Instructor instructor = new Instructor("Alex");

        System.out.println("how many students in course A?");
        int studantsinA = scanner.nextInt();

        for (int i = 0; i < studantsinA; i ++){
            System.out.println("id Student #" + (i+i));
            Studants studants = new Studants(scanner.nextInt());
            couseA.addStudant(studants);
        }
        System.out.println("how many students in course B?");
        int studantsinB = scanner.nextInt();

        for (int i = 0; i < studantsinB; i ++){
            System.out.println("id Student #" + (i+i));
            Studants studants = new Studants(scanner.nextInt());
            couseB.addStudant(studants);
        }
        System.out.println("how many students in course C?");
        int studantsinC= scanner.nextInt();

        for (int i = 0; i < studantsinC; i ++){
            System.out.println("id Student #" + (i+i));
            Studants studants = new Studants(scanner.nextInt());
            couseC.addStudant(studants);
        }
        instructor.add(couseA);
        instructor.add(couseB);
        instructor.add(couseC);
        Set<Studants> set = new HashSet<>();
        for (int i =0; i <instructor.getCoursesList().size();i ++){
            set.addAll(instructor.getCoursesList().get(i).getStudants());
        }
        System.out.println(set.size());


    }
}
