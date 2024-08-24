package exercicios.exer_01.program;

import exercicios.exer_01.Retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();;

        System.out.println("enter wich the width value");
        retangulo.width = scan.nextDouble();
        System.out.println("enter wich the height value");
        retangulo.height = scan.nextDouble();
        scan.nextLine();
        scan.close();
        System.out.println(retangulo);
    }
}
