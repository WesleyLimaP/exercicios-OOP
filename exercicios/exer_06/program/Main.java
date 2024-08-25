package exercicios.exer_06.program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers;
        System.out.println("how many numbers will you insert? (1 to 10");
        int num = scanner.nextInt();
        while (num <1 || num > 10){
            System.out.println("enter a valid number");
            num = scanner.nextInt();
        }
        numbers = new int[num];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter a number ");
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println(numbers[i]);
                ;
            }
        }
    }
}
