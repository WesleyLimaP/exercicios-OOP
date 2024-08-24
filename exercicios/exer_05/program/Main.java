package exercicios.exer_05.program;

import exercicios.exer_05.entities.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account account;
        System.out.println(("do you want make an initial deposit to create an account? (y/n)"));
        char answer = scan.nextLine().charAt(0);
        System.out.println("account holder name ");
        String name = scan.nextLine();
        System.out.println("account number");
        long  accountNumber = scan.nextLong();
        scan.nextLine();

        if (answer == 'y'){
            System.out.println("enter wich the initial deposit");
             double initial = scan.nextDouble();
             account = new Account(accountNumber, name, initial);
        }else { account = new Account(accountNumber, name);};

        System.out.println(account);

        System.out.println("enter a deposit value");
        account.deposit(scan.nextDouble());
        System.out.println("balance updated");
        System.out.println(account);
        System.out.println("enter a withdrawal value");
        account.withdrawal(scan.nextDouble());
        System.out.println("balance updated");
        System.out.println(account);

        scan.nextLine();
        scan.close();


    }
}
