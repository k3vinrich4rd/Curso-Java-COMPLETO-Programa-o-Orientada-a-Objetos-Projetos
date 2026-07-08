package herancaepolimorfismo.entities;

public abstract class Account {
    // Classe base da hierarquia de contas.
    // Como é abstract, ela serve de modelo e não deve ser instanciada diretamente.
    private Integer number;
    private String holder;

    // protected permite acesso direto nas subclasses.
    protected Double balance;

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Account(){

    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    // Comportamento padrão de saque da conta base.
    // Aqui existe uma taxa fixa de 5.0 por operação.
    public void withdraw(double amount) {
        this.balance -= amount + 5;
    }

    // Depósito aumenta o saldo pelo valor informado.
    public void deposit(double amount) {
        this.balance += amount;
    }

}
