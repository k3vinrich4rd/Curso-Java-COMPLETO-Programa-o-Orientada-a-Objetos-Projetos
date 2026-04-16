package herancaepolimorfismo.entities.exercicios.exercicio4.entities;

public class PessoaFisica extends Contribuinte {

    private double healthExpenditures;

    public PessoaFisica(String nome, double rendaAnual, double healthExpenditures) {
        super(nome, rendaAnual);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double impostoAPagar() {
        double valorDoImposto;
        if (this.getRendaAnual() < 20000.00) {
            valorDoImposto = (this.getRendaAnual() * 0.15) - (this.healthExpenditures * 0.5);
        } else {
            valorDoImposto = (this.getRendaAnual() * 0.25) - (this.healthExpenditures * 0.5);
        }
        return valorDoImposto;
    }
}
