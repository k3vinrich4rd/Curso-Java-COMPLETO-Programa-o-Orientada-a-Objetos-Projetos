package poo.membrosestaticos.exercicio.conta;

public class Conta {
    private final int numeroDaConta;
    private String titularDaConta;
    private double saldo;

    public Conta(int numeroDaConta, String titularDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.titularDaConta = titularDaConta;
        this.saldo = saldo;
    }

    public Conta(int numeroDaConta, String titularDaConta) {
        this(numeroDaConta, titularDaConta, 0.0);
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }


    public String getTitularDaConta() {
        return titularDaConta;
    }

    public void setTitularDaConta(String titularDaConta) {
        this.titularDaConta = titularDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Account " + numeroDaConta + "," +
                " Holder: " + titularDaConta + ", " +
                String.format("Balance: $ %.2f", saldo);
    }

    public void depositInAccount(double depositValueInAccount) {
        this.saldo += depositValueInAccount;
    }

    public void withdrawInAccount(double withdrawInAccount) {
       double taxa = withdrawInAccount + 5;
       this.saldo -= taxa;
    }
}
