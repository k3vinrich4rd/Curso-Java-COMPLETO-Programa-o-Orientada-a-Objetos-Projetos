package herancaepolimorfismo.entities.exercicios.exercicio4.entities;

public class PessoaJuridica extends Contribuinte {

    private int  numberOfEmployees;

    public PessoaJuridica(String nome, double rendaAnual, int numberOfEmployees) {
        super(nome, rendaAnual);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double impostoAPagar() {
        double valorDoImposto;
        if (this.numberOfEmployees > 10) {
            valorDoImposto = this.getRendaAnual() * 0.14;
        } else {
            valorDoImposto = this.getRendaAnual() * 0.16;
        }
        return valorDoImposto;
    }
}
