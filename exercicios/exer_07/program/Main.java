package exercicios.exer_07.program;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int[] numbers;
        System.out.println("how many numbers will you insert?");
        int num = scanner.nextInt();
        while (num <1){
            System.out.println("enter a valid number");
            num = scanner.nextInt();
        }
        numbers = new int[num];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        System.out.print(("values: "));
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("soma: " + sum);
        System.out.println("media: " + sum/numbers.length);
    }
}
