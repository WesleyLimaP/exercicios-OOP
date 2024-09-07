package exercicios.exer_14.program;

import exercicios.exer_14.model.entities.Account;
import exercicios.exer_14.model.exceptions.DomainException;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the account data");

        System.out.println("holder");
        String holder = scanner.nextLine();

        System.out.println("account number");
        int number = scanner.nextInt();

        System.out.println("initial balance");
        double initialBalance = scanner.nextDouble();

        System.out.println("withdraw limit");
        double withdrawLimit = scanner.nextDouble();

        Account account = new Account(number, holder, withdrawLimit, initialBalance);

        System.out.println("withdrawal amount ");
        double amount = scanner.nextDouble();
        scanner.close();

        try {
            account.Whithdraw(amount);
            System.out.println("new balance: " + account.getBalance());
        }catch (DomainException e){
            System.out.println( e.getMessage());
        }

    }
}
