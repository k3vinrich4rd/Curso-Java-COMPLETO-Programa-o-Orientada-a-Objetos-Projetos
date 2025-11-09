package poo.membrosestaticos.exercicio.currencyconverter;

/*
Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
para ser responsável pelos cálculos.
 */
public class CurrencyConverter {
    public double valueQuotationInDollar;
    public double dollar;

    public double calculateAmountInReais(double dollarQuotation, double amountInDollars) {
        double amountWithIof = amountInDollars * 1.06; // 6% IOF
        return amountWithIof * dollarQuotation;
    }

    @Override
    public String toString() {
        return "Amount to be paid in reais = " + String.format("%.2f", calculateAmountInReais(valueQuotationInDollar, dollar));
    }
}
