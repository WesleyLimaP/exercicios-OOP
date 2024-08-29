package exercicios.exer_09.program;

import exercicios.exer_09.entities.Dormitory;
import exercicios.exer_09.entities.Students;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("how many bathrooms will be rented? ");
        int rooms = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < rooms; i ++){
            System.out.println("RENT " + (i + 1));
            System.out.println("name: ");
            String name = scanner.nextLine();
            System.out.println("email");
            String email = scanner.nextLine();
            System.out.println("bathroom");
            int bathroom = scanner.nextInt();
            scanner.nextLine();

            Dormitory.BETHROOMS[bathroom] = new Students(email, name);

        } for(int i = 0; i < Dormitory.BETHROOMS.length; i ++){
            if(Dormitory.BETHROOMS[i] != null){
                System.out.println(Dormitory.BETHROOMS[i].getEmail());
                System.out.println(Dormitory.BETHROOMS[i].getName());
                System.out.println("bathroom " + i);
            }
        }



    }
}
