package poo.membrosestaticos.exercicio.conta;

public class Conta {
    private final int number;
    private String holder;
    private double balance;

    public Conta(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Conta(int number, String holder) {
        this(number, holder, 0.0);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account " + number + "," +
                " Holder: " + holder + ", " +
                String.format("Balance: $ %.2f", balance);
    }

    public void deposit(double depositValueInAccount) {
        this.balance += depositValueInAccount;
    }

    public void withdraw(double withdrawInAccount) {
       this.balance -= withdrawInAccount + 5.0;
    }
}
