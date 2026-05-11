package tratamentodeexcecoes.exerciciodefixacao.model;

import tratamentodeexcecoes.exerciciodefixacao.exceptions.WithDrawLimitException;

public class Account {

    private int number;
    private String holder;
    private double balance;
    private double withDrawLimit;

    public Account(int number, String holder, double balance, double withDrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }


    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withDraw(double amount) throws WithDrawLimitException{
        if (amount > withDrawLimit) {
            throw new WithDrawLimitException("The amount exceeds withdraw limit");
        } else if (this.balance < amount) {
            throw new WithDrawLimitException("Not enough balance");
        } else {
            this.balance -= amount;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public double getWithDrawLimit() {
        return withDrawLimit;
    }

    public void setWithDrawLimit(double withDrawLimit) {
        this.withDrawLimit = withDrawLimit;
    }
}
