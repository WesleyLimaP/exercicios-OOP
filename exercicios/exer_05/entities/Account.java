package exercicios.exer_05.entities;

public class Account {
    private final long ACCOUNT_NUMBER;
    private double balanece;
    private String name;

    public Account(long ACCOUNT_NUMBER, String name, double initialDeposit){
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        this.name = name;
        deposit(initialDeposit);
    }
    public Account(long ACCOUNT_NUMBER, String name){
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        this.name = name;
    }

    public long getAccountNumer() {
        return ACCOUNT_NUMBER;
    }

    public double getBalanec() {
        return balanece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void deposit(double ammount){
        balanece += ammount;

    }
    public void withdrawal(double amount){
        if (balanece > 0){
            if ((amount + 5) < balanece){
                balanece -= amount;
            } else {System.out.println("cannot make withdrawal because the amount is greater than the balance");}
        }else {System.out.println("you don't have enough to complete the operation");}

    }

    @Override
    public String toString() {
        return "Account: " + ACCOUNT_NUMBER + "\n" +
                "name: " + name + "\n" +
                "balanece: " + balanece;
    }
}
